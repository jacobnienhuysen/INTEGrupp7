package integrationstest;

import static org.junit.Assert.*;
import inte.projekt.*;

import org.junit.Test;

public class TestFall6 {

	@Test(expected=IllegalArgumentException.class)
	public void testaVaruPrisA() {
		Vara v = new Vara("Vitkål", -0.01, "kg", "9900993782574");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testaVaruPrisB(){
		Vara v = new Vara("ABBA-cd", -130, "st", "0099411200938");
	}
}