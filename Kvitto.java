/*
TODO:
Ändra listans datatyp till "Kvittorad"
Koppla valuta med kvitto
 */

package inte.projekt;

import java.text.DateFormat;
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
    private String valuta;
    ArrayList<Double> kvittorader = new ArrayList<>();//Ändra under INTEGRATIONSTEST
    public Kvitto(int knr){
        kvittonummer = knr;
        DateFormat df = new SimpleDateFormat("dd/MM/yy");
        Date dateobj = new Date();
        datum = df.format(dateobj);
        df = new SimpleDateFormat("HH:mm:ss");
        tid = df.format(dateobj);
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
    public String getValuta(){
        return valuta;
    }
    public void setValuta(String val){
        try{
            if(val.equals("SEK") || val.equals("Dollar") || val.equals("Euro")){
                valuta = val;
                //INTEGRATIONSTEST BEHÖVS
            }
            else{
                throw new IllegalArgumentException("Invalid input...");
            }
        }
        catch(IllegalArgumentException iae){
            System.out.println("Invalid input...");
        }
    }
   /*INTEGRATIONSTEST BEHÖVS
    
    public void addKvittorad(Double kRad){//ÄNDRA
        kvittorader.add(kRad);
    }*/
    public Double getTotalSumma(){
        /* INTEGRATIONSTEST BEHÖVS
        
        Double sum = 0.0;
        for(Double kr : kvittorader){//ÄNDRA
            if(sum+kr >= Double.MAX_VALUE){
                throw new IllegalArgumentException("Summan är för stor!");
            }
            else
                sum = sum+kr;
        }
        return sum;*/
        return null;
    }
}
