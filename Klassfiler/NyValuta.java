package inte.projekt;

public class NyValuta {

	String valutaNamn;
	double valutakurs;
	
	public NyValuta(String namn) {
	valutaNamn = namn;
        if(namn.equals("sek"))
            valutakurs = 1.0;
        else if(namn.equals("euro"))
            valutakurs = 9.27;
        else if(namn.equals("dollar"))
            valutakurs = 8.13;
        else
            throw new IllegalArgumentException("Invalid input...");
        
	}
	public String getValutaNamn(){
		return valutaNamn;
	}
	public double getValutaKurs() {
		return valutakurs;
	}

	

}
