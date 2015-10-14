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
		r�knaTotal(antal);
	}

	public void r�knaTotal(int antal){
		if(antal < 0){
			throw new IllegalArgumentException("Priset kan inte bli negativt");
		}
		totalPris = antal * 10;//P�hittat pris.
	}

	public String getVara() {
		return vara;
	}
	
	public int getAntal(){
		return antal;
	}
	
	public void addAntal(int �kning){
		if(�kning <= 0){
			throw new IllegalArgumentException("�kning av antal m�ste vara st�rre �n 0");
		}
		antal += �kning;
	}
	
	public String toString(){
		return "Vara: "+vara+" Antal: "+antal+" Totalpris: "+totalPris;
	}
}