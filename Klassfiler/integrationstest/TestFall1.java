package integrationstest;

import static org.junit.Assert.*;
import inte.projekt.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestFall1 {
	
	@Test
	public void skapaObjekt(){
		Vara v = new Vara("Äpplen", 12, "kg", "1234567891234");
		NyValuta nv = new NyValuta("dollar");
		Kvittorad kr = new Kvittorad(v, 13);
		Kvitto kvitto = new Kvitto(123, kr);
		kvitto.setValuta(nv);
		Rabatter r = new Rabatter("Pensionär", 10);
		kvitto.setRabatt(r);
		assertEquals(17.27, kvitto.getTotalSumma(), 0.01);
		System.out.println(kvitto);
		
	}

}
