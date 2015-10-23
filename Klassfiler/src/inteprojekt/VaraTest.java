package inteprojekt;

import inteprojekt.Vara;
import inteprojekt.Rabatter;
import static org.junit.Assert.*;
import org.junit.Test;


public class VaraTest {
	
	
	
	@Test
	public void createVaraTest() {
		Vara v = new Vara("Toalettpapper", 67.5, "g", "0987654321234");
	}
	
	@Test
	public void getVarasNamn(){
		Vara v = new Vara("Lättmjölk", 8.5, "st", "0987654321234");
		assertEquals("Lättmjölk", v.getNamn());
		
		Vara g = new Vara("Grillkol", 39.90, "st", "0987654321234");
		assertEquals("Grillkol", g.getNamn());
	}
	
	@Test
	public void getVarasJfrPris(){
		Vara v = new Vara("Lättmjölk", 8.50, "st", "0987654321234");
		assertEquals(8.50, v.getJfrPris(), 0.001);
		
		Vara f = new Vara("Hundmat", 90, "st", "0987654321234");
		assertEquals(90, f.getJfrPris(), 0.001);
	}
	
	@Test
	public void getVarasEnhet(){
		Vara v = new Vara("Lättmjölk", 8.50, "st", "0987654321234");
		assertEquals("st", v.getEnhet());
		
		Vara g = new Vara("Saffran", 40, "g", "0987654321234");
		assertEquals("g", g.getEnhet());
		
		Vara h = new Vara("Lösgodis", 25, "hg", "0987654321234");
		assertEquals("hg", h.getEnhet());
		
		Vara k = new Vara("Äpplen", 19.45, "kg", "0987654321234");
		assertEquals("kg", k.getEnhet());
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void enterFelaktigEnhet(){
		Vara v = new Vara("Gurka", 19.90, "m", "0987654321234");
		
		Vara g = new Vara("Mineralvatten", 29.50, "l", "0987654321234");
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void enterFelaktigtPris(){
		Vara v = new Vara("Senap", -0.01, "st", "0987654321234");
		
		Vara f = new Vara("Senap", Double.MIN_VALUE, "st", "0987654321234");
		
		Vara g = new Vara("Gräslök", Double.MAX_VALUE , "g", "0987654321234");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void ingetVarunamn(){
		Vara v = new Vara("", 25, "st", "0987654321234");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void ogiltigtNamn(){
		Vara g = new Vara(" ", 16, "st", "0987654321234");
		
	}
	
	@Test
	public void testaGetStreckkod(){
		Vara g = new Vara("Sand", 1, "st", "0987654321234");
		assertEquals("0987654321234", g.getStreckkod());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testaStreckodTecken(){
		Vara g = new Vara("Grus", 3, "kg", "8980dsdsd");
		
		Vara f = new Vara("Sten", 45, "st", "---  ");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testaStreckkodLängd(){
		Vara g = new Vara("Pengar", 6, "hg", "858585858599");
		Vara d = new Vara("Pengar", 6, "kg", "00000987654321");
	}
	
	/*@Test
	public void toStringTest(){
		Vara g = new Vara("Äpplen", 29.90, "kg", "0987654321234");
		assertEquals("Äpplen, 29,90/kg", g.toString());
		
		Vara s = new Vara("Grillkol", 39.90, "st", "0987654321234");
		assertEquals("Grillkol, 39,90/st", s.toString());
	}*/
	
	@Test
        public void testVaraMedRabatt(){
            Vara s = new Vara("Grillkol", 39.90, "st", "0987654321234");
            Rabatter r = new Rabatter("TestR", 10);
            s.setRabatt(r);
            assertEquals(35.91, s.getRabattPris(), 0.0);
        }
	
	

}