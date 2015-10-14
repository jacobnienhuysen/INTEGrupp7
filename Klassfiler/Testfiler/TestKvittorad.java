package Kvittorad;

import static org.junit.Assert.*;

import org.junit.*;

public class TestKvittorad {
	
	private Kvittorad kvittorad;
	
	@Before
	public void setUp(){
		kvittorad = new Kvittorad("L�ttmj�lk",3);
	}
	
	@Test
	public void duKanSkapaKvittoradMedVaraOchAntal(){
		Kvittorad kvittorad = new Kvittorad("L�ttmj�lk", 2);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void antalKanInteVaraNoll(){
		Kvittorad kvittorad = new Kvittorad("L�ttmj�lk", 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void antalKanInteVaraMindre�nNoll(){
		Kvittorad kvittorad = new Kvittorad("L�ttmj�lk", -1);
	}
	
	@Test
	public void duKanF�FramVaranFr�nKvittoraden(){
		Kvittorad kvittorad = new Kvittorad("Filmj�lk", 4);
		assertEquals("Filmj�lk", kvittorad.getVara());
	}
	
	@Test
	public void duKanF�FramAntaletFr�nKvittoraden(){
		Kvittorad kvittorad = new Kvittorad("Filmj�lk", 4);
		assertEquals(4, kvittorad.getAntal());
	}
	
	@Test
	public void duKan�kaAntaletP�EnKvittorad(){
		Kvittorad kvittorad = new Kvittorad("Filmj�lk", 4);
		kvittorad.addAntal(1);
		assertEquals(5, kvittorad.getAntal());
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void �kningAvAntalKanInteVaraNoll(){
		Kvittorad kvittorad = new Kvittorad("Filmj�lk", 4);
		kvittorad.addAntal(0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void �kningAvAntalKanInteVaraMindre�nNoll(){
		Kvittorad kvittorad = new Kvittorad("Filmj�lk", 4);
		kvittorad.addAntal(-1);
	}
	
	@Test
	public void totalPrisetR�knasUt(){
		Kvittorad kvittorad = new Kvittorad("Filmj�lk", 4);
		kvittorad.r�knaTotal(kvittorad.getAntal());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void totalPrisetKanInteVaraMindre�nNoll(){
		Kvittorad kvittorad = new Kvittorad("Filmj�lk", 4);
		kvittorad.r�knaTotal(-1);
	}

}

