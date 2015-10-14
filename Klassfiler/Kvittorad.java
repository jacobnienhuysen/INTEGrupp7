package Kvittorad;

public class Kvittorad {
	
	private String vara;
	private int antal;
	public double totalPris;
	
	public Kvittorad(String vara, int antal){
		if(antal <= 0){
			throw new IllegalArgumentException();
		}
		
		this.vara = vara;
		this.antal = antal;
		räknaTotal(antal);
	}

	public void räknaTotal(int antal){
		if(antal < 0){
			throw new IllegalArgumentException("Priset kan inte bli negativt");
		}
		totalPris = antal * 10;//Påhittat pris.
	}

	public String getVara() {
		return vara;
	}
	
	public int getAntal(){
		return antal;
	}
	
	public void addAntal(int ökning){
		if(ökning <= 0){
			throw new IllegalArgumentException("Ökning av antal måste vara större än 0");
		}
		antal += ökning;
	}
	
	public String toString(){
		return "Vara: "+vara+" Antal: "+antal+" Totalpris: "+totalPris;
	}
}