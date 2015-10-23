/*
TODO:
Ändra listans datatyp till "Kvittorad"
Koppla valuta med kvitto
 */

package inteprojekt;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Erik
 */
public class Kvitto {
    
    private int kvittonummer;
    private String datum;
    private String tid;
    private NyValuta valuta;
    private ArrayList<Kvittorad> kvittorader = new ArrayList<>();
    private Rabatter rabatt;
    DecimalFormat formatter = new DecimalFormat("#0.00");
    
    public Kvitto(int knr, Kvittorad kr){
        if(knr < 0)
            throw new IllegalArgumentException("Kvittonummer kan inte vara mindre än 0");
            
        kvittonummer = knr;
        DateFormat df = new SimpleDateFormat("dd/MM/yy");
        Date dateobj = new Date();
        datum = df.format(dateobj);
        df = new SimpleDateFormat("HH:mm:ss");
        tid = df.format(dateobj);
        this.addKvittorad(kr);
        valuta = new NyValuta("sek");
        
    }
    
    public int getKvittonummer(){
        return kvittonummer;
    }
    public String getDatum(){
        return datum;
    }
    public String getTid(){
        return tid;
    }
    public NyValuta getValuta(){
        return valuta;
    }
    
    public void setValuta(NyValuta val){
        valuta = val;
    }
    
    public void setRabatt(Rabatter r){
        rabatt = r;
    }
    
    public void addKvittorad(Kvittorad kRad){
        boolean found = false;
        for(Kvittorad kr : kvittorader){
            if(kr.getVara().getNamn().equals(kRad.getVara().getNamn())){
                found = true;
                kr.addAntal(kRad.getAntal());
            }
        }
        if(found == false)
            kvittorader.add(kRad);
    }
    
    public double getRabattPris(double inp){
        return rabatt.getRabatteratPris(inp);
    }
    
    public Double getTotalSumma(){
        
        Double sum = 0.0;
        
        for(Kvittorad kr : kvittorader){
            double add = kr.getTotalPris();
            if(sum + add>= Double.MAX_VALUE)
                throw new IllegalArgumentException("Summan är för stor!");
            
            else
                sum = sum+add;
        }
        if(valuta != null)
            sum = sum/valuta.getValutaKurs();
        if(rabatt != null)
            sum = this.getRabattPris(sum);
        
        return sum;
    }
    
    public String toString(){
        System.out.println(datum + "     " + tid);
        for (Kvittorad kr : kvittorader){
            System.out.println(kr);
        }
        return ("Att betala: "+ formatter.format(getTotalSumma())+ " "+ valuta.getValutaNamn());
    }
}
