/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inte.projekt;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import static org.junit.Assert.*;

import org.junit.*;

public class TestKvittorad {
	
	private Vara v;
	
	@Before
	public void setUp(){
            v = new Vara("Korv", 20.9, "st", "5000000000000");
	}
	
	@Test
	public void duKanSkapaKvittoradMedVaraOchAntal(){
		Kvittorad kvittorad = new Kvittorad(v, 2);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void antalKanInteVaraNoll(){
		Kvittorad kvittorad = new Kvittorad(v, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void antalKanInteVaraMindreÄnNoll(){
		Kvittorad kvittorad = new Kvittorad(v, -1);
	}
	
	@Test
	public void duKanFåFramVaranFrånKvittoraden(){
		Kvittorad kvittorad = new Kvittorad(v, 4);
		assertEquals("Korv", kvittorad.getVara().getNamn());
	}
	
	@Test
	public void duKanFåFramAntaletFrånKvittoraden(){
		Kvittorad kvittorad = new Kvittorad(v, 4);
		assertEquals(4, kvittorad.getAntal());
	}
	
	@Test
	public void duKanÖkaAntaletPåEnKvittorad(){
		Kvittorad kvittorad = new Kvittorad(v, 4);
		kvittorad.addAntal(1);
		assertEquals(5, kvittorad.getAntal());
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void ökningAvAntalKanInteVaraNoll(){
		Kvittorad kvittorad = new Kvittorad(v, 4);
		kvittorad.addAntal(0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void ökningAvAntalKanInteVaraMindreÄnNoll(){
		Kvittorad kvittorad = new Kvittorad(v, 4);
		kvittorad.addAntal(-1);
	}
	
	@Test
	public void totalPrisetRäknasUt(){
		Kvittorad kvittorad = new Kvittorad(v, 4);
		kvittorad.getTotalPris();
	}
        @Test
        public void testKvittoradMedRabatt(){
            Kvittorad kr = new Kvittorad(v, 10);
            Rabatter r = new Rabatter("TestR", 10);
            kr.setRabatt(r);
            assertEquals(188.1, kr.getRabattPris(), 0.005);
        }

}