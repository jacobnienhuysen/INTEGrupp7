package integrationstest;

import static org.junit.Assert.*;
import inte.projekt.*; 

import org.junit.Test;

public class TestFall17 {

	@Test(expected=IllegalArgumentException.class)
	public void testaTotalprisMindreÄnNoll() {
		Vara g = new Vara("Pantade burkar", -0.01, "st", "0000000000026");
		Kvittorad kr = new Kvittorad(g, 1);
		NyValuta valuta = new NyValuta("sek");
		Kvitto kvitto = new Kvitto(2222, kr);
	}

}
