package integrationstest;

import static org.junit.Assert.*;
import inte.projekt.*;

import org.junit.Test;

public class TestFall5 {

	@Test
	public void skapaObjekt() {
		Vara v = new Vara("Lösgodis", 14, "hg", "3456789012345");
		NyValuta valuta = new NyValuta("euro");
		Kvittorad kr = new Kvittorad(v, 1);
		Kvitto kvitto = new Kvitto(45678, kr);
		kvitto.setValuta(valuta);
		assertEquals(1.51, kvitto.getTotalSumma(), 0.01);
		System.out.println(kvitto);
		
	}

}
