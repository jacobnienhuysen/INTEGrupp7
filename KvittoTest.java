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
        Kvitto k = new Kvitto(0);
        assertEquals(0, k.getKvittonummer());
    }
    @Test
    public void testKvittodatum(){
        Kvitto k = new Kvitto(0);
        assertEquals("14/10/15", k.getDatum());
    }
    @Test
    public void testKvittotid(){
        Kvitto k = new Kvitto(0);
        DateFormat df = new SimpleDateFormat("HH:mm:ss");
        Date dateobj = new Date();
        String tid = df.format(dateobj);
        assertEquals(tid, k.getTid());
    }
    @Test
    public void testKvittovaluta(){
        Kvitto k = new Kvitto(0);
        k.setValuta("SEK");
        assertEquals("SEK", k.getValuta());
    }
    @Test
    public void testSetvaluta(){
        Kvitto k = new Kvitto(0);
        k.setValuta("blaja");
        assertEquals(null, k.getValuta());
    }
    /*@Test
    public void testRaknaSumma(){
        Kvitto k = new Kvitto(0);
        k.addKvittorad(5.4);
        k.addKvittorad(9.0);
        k.addKvittorad(765.99);
        assertEquals(780.39, k.getTotalSumma(), 0.0);
    }
    
    @Test(expected = IllegalArgumentException.class) 
    public void testOverflowSumma(){
        Kvitto k = new Kvitto(0);
        k.addKvittorad(Double.MAX_VALUE);
        assertEquals(Double.MAX_VALUE, k.getTotalSumma(), 0.0);
    }*/
}
