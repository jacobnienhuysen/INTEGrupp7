import java.text.DecimalFormat;


public class Vara {
	
	private String namn;
	private double jfrPris;
	private String enhet;
	DecimalFormat formatter = new DecimalFormat("#0.00");  
	
	public Vara(String n, double p, String e){
		if(n.length()<1 || !n.matches(".*[a-zA-Z0-9������]+.*"))
			throw new IllegalArgumentException("Ogiltigt namn p� vara");

		if(!e.equalsIgnoreCase("st") && !e.equalsIgnoreCase("g"))
			throw new IllegalArgumentException(e + " �r inte en giltig enhet!");
		
		if(p < 0)
			throw new IllegalArgumentException(p + " �r inte ett giltigt pris!");
		
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
