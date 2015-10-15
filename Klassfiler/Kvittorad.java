package inte.projekt;

import java.text.DecimalFormat;

public class Kvittorad {
	
	private Vara vara;
	private int antal;
	public double totalPris;
        DecimalFormat formatter = new DecimalFormat("#0.00");
	
	public Kvittorad(Vara vara, int antal){
		if(antal <= 0){
			throw new IllegalArgumentException();
		}
		
		this.vara = vara;
		this.antal = antal;
		raknaTotal(antal);
	}

	public void raknaTotal(int antal){
		if(antal < 0){
			throw new IllegalArgumentException("Priset kan inte bli negativt");
		}
		totalPris = antal * vara.getJfrPris();//P�hittat pris.
	}
        
        public double getTotalPris(){
            return(antal * vara.getJfrPris());
        }

	public Vara getVara() {
		return vara;
	}
	
	public int getAntal(){
		return antal;
	}
	
	public void addAntal(int okning){
		if(okning <= 0){
			throw new IllegalArgumentException("Ökning av antal måste vara större än 0");
		}
		antal += okning;
	}
	
	public String toString(){
		return "Vara: "+vara+" Antal: "+antal+vara.getEnhet()+" Totalpris: "+formatter.format(getTotalPris());
	}
}