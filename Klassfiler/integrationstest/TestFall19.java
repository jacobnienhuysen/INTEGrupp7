package integrationstest;

import static org.junit.Assert.*;
import inte.projekt.*;

import org.junit.Test;

public class TestFall19 {
	
	Vara v = new Vara("Skor", 199, "st", "9830000098437");
	
	@Test(expected=IllegalArgumentException.class)
	public void testaTomtRabattNamn(){
		Rabatter r = new Rabatter("", 5);
		v.setRabatt(r);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testaRabattNamnBaraMellanslag(){
		Rabatter r = new Rabatter("   ", 5);
		v.setRabatt(r);
	}
	
	

}
