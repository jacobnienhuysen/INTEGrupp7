package kvittoTDD;

public class NyValuta {

	String valutaNamn;
	double valutakurs;
	
	public NyValuta(String namn, double kurs) {
	valutaNamn = namn;
	valutakurs = kurs;
	}
	public String getValutaNamn(){
		return valutaNamn;
	}
	public double getValutaKurs() {
		return valutakurs;
	}

	

}
