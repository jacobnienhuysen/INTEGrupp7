import java.text.DecimalFormat;


public class Vara {
	
	private String namn;
	private double jfrPris;
	private String enhet;
	DecimalFormat formatter = new DecimalFormat("#0.00");  
	
	public Vara(String n, double p, String e){
		if(n.length()<1 || !n.matches(".*[a-zA-Z0-9åäöÅÄÖ]+.*"))
			throw new IllegalArgumentException("Ogiltigt namn på vara");

		if(!e.equalsIgnoreCase("st") && !e.equalsIgnoreCase("g"))
			throw new IllegalArgumentException(e + " är inte en giltig enhet!");
		
		if(p < 0)
			throw new IllegalArgumentException(p + " är inte ett giltigt pris!");
		
		namn = n;
		jfrPris = p;
		enhet = e.toLowerCase();
	}
	
	public String getNamn(){
		return namn;
	}
	
	public double getJfrPris(){
		return jfrPris;
	}
	
	public String getEnhet(){
		return enhet;
	}
	
	public String toString(){
		if(enhet.equalsIgnoreCase("g")){
			return namn + ", " + formatter.format(jfrPris*1000) + "/kg";
		}
		else
			return namn + ", " + formatter.format(jfrPris) + "/st"; 
	}
	
}
