package integrationstest;

import static org.junit.Assert.*;
import inte.projekt.*;

import org.junit.Test;

public class TestFall3 {

	@Test
	public void skapaObjekt() {
		Vara v = new Vara("Mjölk", 16, "l", "9876543210987");
		NyValuta valuta = new NyValuta("sek");
		Kvittorad kr = new Kvittorad(v, 4);
		Kvitto kvitto = new Kvitto(567,kr);
		kvitto.setValuta(valuta);
		assertEquals(64, kvitto.getTotalSumma(), 0.01);
		System.out.print(kvitto);
	}

}
