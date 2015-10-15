import java.text.DecimalFormat;


public class Vara {
	
	private String namn;
	private double jfrPris;
	private String enhet;
	private String streckkod;
	DecimalFormat formatter = new DecimalFormat("#0.00");  
	
	public Vara(String n, double p, String e, String sk){
		if(n.length()<1 || !n.matches(".*[a-zA-Z0-9������]+.*"))
			throw new IllegalArgumentException("Ogiltigt namn p� vara");

		if(!e.equalsIgnoreCase("st") && !e.equalsIgnoreCase("g") && !e.equalsIgnoreCase("hg") && !e.equalsIgnoreCase("kg"))
			throw new IllegalArgumentException(e + " �r inte en giltig enhet!");
		
		if(p < 0)
			throw new IllegalArgumentException(p + " �r inte ett giltigt pris!");
		
		
		for (int i = 0; i < sk.length(); i++) {
			if (!Character.isDigit(sk.charAt(i)))
				throw new IllegalArgumentException("Streckkoden f�r enbart inneh�lla siffror");
		}
		
		if(sk.length()!=13)
			throw new IllegalArgumentException("Ogiltig l�ngd p� streckkoden.");
		
		namn = n;
		jfrPris = p;
		enhet = e.toLowerCase();
		streckkod = sk;
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
	
	public String getStreckkod(){
		return streckkod;
	}
	
	public String toString(){
		if(enhet.equalsIgnoreCase("g")){
			return namn + ", " + formatter.format(jfrPris*1000) + "/kg";
		}
		else if(enhet.equalsIgnoreCase("hg"))
			return namn + ", " + formatter.format(jfrPris*10) + "/kg";
		else if(enhet.equalsIgnoreCase("kg"))
			return namn + ", " + formatter.format(jfrPris) + "/kg";
		else
			return namn + ", " + formatter.format(jfrPris) + "/st"; 
	}
	
}
