package integrationstest;

import static org.junit.Assert.*;
import inte.projekt.*;

import org.junit.Test;

public class TestFall2 {

	@Test
	public void testFall2(){
		Vara v = new Vara("Sudd", 5, "st", "1234567890123");
		
		assertEquals(5, v.getJfrPris(),0);
		assertEquals("Sudd", v.getNamn());
		assertEquals("st", v.getEnhet());
		assertEquals("1234567890123", v.getStreckkod());
		
		NyValuta valuta = new NyValuta("euro");
		
		assertEquals("euro", valuta.getValutaNamn());
		assertEquals(9.27, valuta.getValutaKurs(),0);
		
		Kvittorad kr = new Kvittorad(v, 23);
		
		assertEquals(23, kr.getAntal(),0);
		
		Kvitto kvitto = new Kvitto(12345, kr);
		
		assertEquals(12345, kvitto.getKvittonummer());
		
		kvitto.setValuta(valuta);
		
		System.out.println(kvitto);

	}

}
