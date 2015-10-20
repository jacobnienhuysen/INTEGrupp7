package integrationstest;
import inte.projekt.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestFall4 {

	@Test
	public void testFall4() {
		Vara v = new Vara("saffran", 18, "g", "2345678901111");
		assertEquals(18, v.getJfrPris(),0);
		assertEquals("saffran", v.getNamn());
		assertEquals("g", v.getEnhet());
		assertEquals("2345678901111", v.getStreckkod());
		
		Kvittorad kr = new Kvittorad(v, 1);
		assertEquals(1, kr.getAntal(),0);
		
		NyValuta dollar = new NyValuta("dollar");
		assertEquals("dollar", dollar.getValutaNamn());
		assertEquals(8.13, dollar.getValutaKurs(),0);
		
		Kvitto kvitto = new Kvitto(987, kr);
		kvitto.setValuta(dollar);
		assertEquals(987, kvitto.getKvittonummer());
		
		assertEquals(true, kvitto.getTotalSumma()>0);
		System.out.println(kvitto);
	}

}
