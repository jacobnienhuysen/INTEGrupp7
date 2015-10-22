package integrationstest;

import static org.junit.Assert.*;
import inte.projekt.*;

import org.junit.Test;

public class TestFall18 {

	Vara v = new Vara("Skor", 199, "st", "9830000098437");
	
	@Test(expected=IllegalArgumentException.class)
	public void testaAntalMindre�nNoll() {
		Kvittorad kr = new Kvittorad(v, 0);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testaAntalMinusv�rde() {
		Kvittorad kr2 = new Kvittorad(v, -1);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testaAntalSt�rreMinusv�rde() {
		Kvittorad kr3 = new Kvittorad(v, -111);
	}

}
