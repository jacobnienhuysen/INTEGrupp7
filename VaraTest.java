import static org.junit.Assert.*;

import org.junit.Test;


public class VaraTest {
	
	
	
	@Test
	public void createVaraTest() {
		Vara v = new Vara("Toalettpapper", 67.5, "g");
	}
	
	@Test
	public void getVarasNamn(){
		Vara v = new Vara("Lättmjölk", 8.5, "st");
		assertEquals("Lättmjölk", v.getNamn());
		
		Vara g = new Vara("Grillkol", 39.90, "st");
		assertEquals("Grillkol", g.getNamn());
	}
	
	@Test
	public void getVarasJfrPris(){
		Vara v = new Vara("Lättmjölk", 8.50, "st");
		assertEquals(8.50, v.getJfrPris(), 0.001);
		
		Vara f = new Vara("Hundmat", 90, "st");
		assertEquals(90, f.getJfrPris(), 0.001);
	}
	
	@Test
	public void getVarasEnhet(){
		Vara v = new Vara("Lättmjölk", 8.50, "st");
		assertEquals("st", v.getEnhet());
		
		Vara g = new Vara("Äpplen", 0.01995, "g");
		assertEquals("g", g.getEnhet());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void enterFelaktigEnhet(){
		Vara v = new Vara("Gurka", 19.90, "m");
		
		Vara g = new Vara("Mineralvatten", 29.50, "l");
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void enterFelaktigtPris(){
		Vara v = new Vara("Senap", -0.01, "st");
		
		Vara f = new Vara("Senap", Double.MIN_VALUE, "st");
		
		Vara g = new Vara("Gräslök", Double.MAX_VALUE , "g");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void ingetVarunamn(){
		Vara v = new Vara("", 25, "st");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void ogiltigtNamn(){
		Vara g = new Vara(" ", 16, "st");
		
	}
	
	@Test
	public void toStringTest(){
		Vara g = new Vara("Äpplen", 0.0299, "g");
		assertEquals("Äpplen, 29,90/kg", g.toString());
		
		Vara s = new Vara("Grillkol", 39.90, "st");
		assertEquals("Grillkol, 39,90/st", s.toString());
	}
	

}
