package integrationstest;

import static org.junit.Assert.*;
import inte.projekt.*;

import org.junit.Test;

public class Testfall15 {

	@Test(expected=IllegalArgumentException.class)
	public void testaKvittonummerLängd(){
		Vara g = new Vara("Äpplen, röda", 18.95, "kg", "9584900000002");
		Kvittorad kr = new Kvittorad(g, 5);
		NyValuta valuta = new NyValuta("sek");
		Kvitto kvitto = new Kvitto(-1, kr);
	}

}
