package Kvittorad;

import static org.junit.Assert.*;

import org.junit.*;

public class TestKvittorad {
	
	private Kvittorad kvittorad;
	
	@Before
	public void setUp(){
		kvittorad = new Kvittorad("Lättmjölk",3);
	}
	
	@Test
	public void duKanSkapaKvittoradMedVaraOchAntal(){
		Kvittorad kvittorad = new Kvittorad("Lättmjölk", 2);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void antalKanInteVaraNoll(){
		Kvittorad kvittorad = new Kvittorad("Lättmjölk", 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void antalKanInteVaraMindreÄnNoll(){
		Kvittorad kvittorad = new Kvittorad("Lättmjölk", -1);
	}
	
	@Test
	public void duKanFåFramVaranFrånKvittoraden(){
		Kvittorad kvittorad = new Kvittorad("Filmjölk", 4);
		assertEquals("Filmjölk", kvittorad.getVara());
	}
	
	@Test
	public void duKanFåFramAntaletFrånKvittoraden(){
		Kvittorad kvittorad = new Kvittorad("Filmjölk", 4);
		assertEquals(4, kvittorad.getAntal());
	}
	
	@Test
	public void duKanÖkaAntaletPåEnKvittorad(){
		Kvittorad kvittorad = new Kvittorad("Filmjölk", 4);
		kvittorad.addAntal(1);
		assertEquals(5, kvittorad.getAntal());
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void ökningAvAntalKanInteVaraNoll(){
		Kvittorad kvittorad = new Kvittorad("Filmjölk", 4);
		kvittorad.addAntal(0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void ökningAvAntalKanInteVaraMindreÄnNoll(){
		Kvittorad kvittorad = new Kvittorad("Filmjölk", 4);
		kvittorad.addAntal(-1);
	}
	
	@Test
	public void totalPrisetRäknasUt(){
		Kvittorad kvittorad = new Kvittorad("Filmjölk", 4);
		kvittorad.räknaTotal(kvittorad.getAntal());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void totalPrisetKanInteVaraMindreÄnNoll(){
		Kvittorad kvittorad = new Kvittorad("Filmjölk", 4);
		kvittorad.räknaTotal(-1);
	}

}

