/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inte.projekt;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Erik
 */
public class KvittoTest {
    Vara v;
    Kvittorad kr;
    public KvittoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        v = new Vara("Korv", 20.9, "st", "5000000000000");
        kr = new Kvittorad(v, 1);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class INTEProjekt.
     */
 /*   @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        INTEProjekt.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
    @Test
    public void testKvittonummer(){
        Kvitto k = new Kvitto(0, kr);
        assertEquals(0, k.getKvittonummer());
    }
    @Test
    public void testKvittodatum(){
        Kvitto k = new Kvitto(0, kr);
        assertEquals("15/10/15", k.getDatum());
    }
    @Test
    public void testKvittotid(){
        Kvitto k = new Kvitto(0, kr);
        DateFormat df = new SimpleDateFormat("HH:mm:ss");
        Date dateobj = new Date();
        String tid = df.format(dateobj);
        assertEquals(tid, k.getTid());
    }
    @Test
    public void testKvittovaluta(){
        Kvitto k = new Kvitto(0, kr);
        k.setValuta(new NyValuta("sek"));
        assertEquals("sek", k.getValuta().getValutaNamn());
    }
    @Test(expected = IllegalArgumentException.class) 
    public void testSetvaluta(){
        Kvitto k = new Kvitto(0, kr);
        k.setValuta(new NyValuta("blaja"));
        assertEquals(null, k.getValuta());
    }
    @Test
    public void testKvittoMedAnnat(){
        Vara v = new Vara("Korv", 20.9, "st", "5000000000000");
        Vara v2 = new Vara("Banan", 19.35, "g", "5000000000001");
        Kvittorad kr = new Kvittorad(v, 1);
        Kvittorad kr2 = new Kvittorad(v2, 1);
        Kvittorad kr3 = new Kvittorad(v, 3);
        Kvitto k = new Kvitto(1, kr);
        NyValuta valuta = new NyValuta("dollar");
        Rabatter rabatt = new Rabatter("Student Rabatt", 10.0);
        //k.setValuta(valuta);
        k.addRabatt(rabatt);
        k.addKvittorad(kr2);
        k.addKvittorad(kr3);
        System.out.println(k);
        //assertEquals(12.66, k.getTotalSumma(), 0.01);
        assertEquals(102.95*0.9, k.getTotalSumma(), 0.001);
    }
}
