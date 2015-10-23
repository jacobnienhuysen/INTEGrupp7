package inteprojekt;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValutaTest {

	@Test
	public void newValutaOmvandling() {
	NyValuta valuta = new NyValuta("sek");
	
	}
	
	@Test
	public void testaNamn(){
		NyValuta valuta = new NyValuta("sek");
		assertEquals("sek",valuta.getValutaNamn());
		
	}

	@Test
	public void testaNamnEuro(){
	NyValuta valuta = new NyValuta("euro");
	assertEquals("euro",valuta.getValutaNamn());
	}
	
	@Test
	public void testaNamnDollar(){
	NyValuta valuta = new NyValuta("dollar");
	assertEquals("dollar",valuta.getValutaNamn());
	
	}
	@Test
	public void testKurs(){
		NyValuta valuta = new NyValuta("dollar");
		assertEquals(8.13,valuta.getValutaKurs(), 0);
	}

}
