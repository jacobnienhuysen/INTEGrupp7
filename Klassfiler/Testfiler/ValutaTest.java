package kvittoTDD;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValutaTest {

	@Test
	public void newValutaOmvandling() {
	NyValuta valuta = new NyValuta("sek",1);
	
	}
	
	@Test
	public void testaNamn(){
		NyValuta valuta = new NyValuta("sek",1);
		assertEquals("sek",valuta.getValutaNamn());
		
	}

	@Test
	public void testaNamnEuro(){
	NyValuta valuta = new NyValuta("euro",9.27);
	assertEquals("euro",valuta.getValutaNamn());
	}
	
	@Test
	public void testaNamnDollar(){
	NyValuta valuta = new NyValuta("dollar",8.13);
	assertEquals("dollar",valuta.getValutaNamn());
	
	}
	@Test
	public void testKurs(){
		NyValuta valuta = new NyValuta("dollar",8.13);
		assertEquals(8.13,valuta.getValutaKurs(), 0);
	}

}
