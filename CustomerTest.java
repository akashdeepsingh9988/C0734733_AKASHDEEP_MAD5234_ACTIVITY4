/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c0734733_akashdeep_mad5234_activity4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Akashdeep Singh
 */
public class CustomerTest {

    public CustomerTest() {
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
     * Test of getAccount method, of class Customer.
     */
    @Test
    public void testGetAccount() {
        System.out.println("getAccount");
        /*
            Logic to test new customer has an account
         */
        // Create account with deposit more than 0 at time of account creation
        Customer instance = new Customer("Akashdeep", 100);
        // Getting name of customer. if account created then cusomer name matches with expResult
        String result = instance.getName();
        String expResult = "Akashdeep";
        System.out.println(result+ "Account Balance : "+instance.getAccount().balance());
        assertEquals(expResult, result);

        // Create Account with 0 balance
        instance = new Customer("Abhi", 0);
        // Getting name of customer. if account created then cusomer name matches with expResult
        result = instance.getName();
        expResult = "Abhi";
        System.out.println(result + "Account Balance : "+instance.getAccount().balance());
        assertEquals(expResult, result);

    }

}
