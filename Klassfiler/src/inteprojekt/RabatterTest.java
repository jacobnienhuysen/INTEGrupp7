/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inteprojekt;

import inteprojekt.Rabatter;
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
public class RabatterTest {
    
    public RabatterTest() {
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

    @Test
    public void testRabatt(){
        Rabatter r = new Rabatter("TestR", 10);
        assertEquals(0.9, r.getRabatt(), 0.0);
    }
    
    @Test
    public void testNamn(){
        Rabatter r = new Rabatter("TestR", 10);
        assertEquals("TestR", r.getNamn());
    }
    
    @Test
    public void testReturneraRabateratPris(){
        Rabatter r = new Rabatter("TestR", 10);
        assertEquals(90.0, r.getRabatteratPris(100.0), 0.0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testRabattForStor(){
        Rabatter r = new Rabatter("TestR", 110);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testRabattForLiten(){
        Rabatter r = new Rabatter("TestR", -1);
    }
}
