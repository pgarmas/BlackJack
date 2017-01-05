/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author polina.garmas
 */
public class MainFrameTest {
    
    public MainFrameTest() {
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
     * Test of showOutcome method, of class MainFrame.
     */
    @Test
    public void testShowOutcome() {
        System.out.println("showOutcome");
        ArrayList<Card> playerHand = null;
        ArrayList<Card> dealerHand = null;
        MainFrame instance = new MainFrame();
        instance.showOutcome(playerHand, dealerHand);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of handValue method, of class MainFrame.
     */
    @Test
    public void testHandValue() {
        System.out.println("handValue");
        ArrayList<Card> hand = null;
        ArrayList<Integer> expResult = null;
        ArrayList<Integer> result = MainFrame.handValue(hand);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handAceCount method, of class MainFrame.
     */
    @Test
    public void testHandAceCount() {
        System.out.println("handAceCount");
        ArrayList<Card> hand = null;
        int expResult = 0;
        int result = MainFrame.handAceCount(hand);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class MainFrame.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MainFrame.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
