/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c0734733_akashdeep_mad5234_activity4;

import java.util.ArrayList;
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
public class BankTest {

    public BankTest() {
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
     * Test of getCustomers method, of class Bank.
     */
    @Test
    public void testBank() {
        System.out.println("Test Bank");
        Bank instance = new Bank();
        int expResult = 0;
        // checking number of customers
        // EXPECTED OUTPUT 0
        int result = instance.getNumberOfCustomers();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetCustomers() {
        System.out.println("getCustomers");
        Bank instance = new Bank();
        /* 
            ADDING CUSTOMERS
        */
        instance.addCustomer("Akashdeep", 100);
        instance.addCustomer("Abhishek", 200);

        ArrayList<Customer> expResult = instance.getCustomers();
        ArrayList<Customer> result = instance.getCustomers();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of addCustomer method, of class Bank.
     */
    @Test
    public void testAddCustomer() {
        System.out.println("addCustomer");
        //String name = "";
        Bank instance = new Bank();
        int expResult = 1;
        /*
        ADDING FIRST CUSTOMER
         */
        instance.addCustomer("Akashdeep", 100);
        int result = instance.getNumberOfCustomers();
        System.out.println("No of Customers : " + result);
        assertEquals(expResult, result);

        /*
        ADDING SECOND CUSTOMER TO TEST REQUIREMENT 2
         */
        instance.addCustomer("Abhishek", 200);
        expResult = 2;
        result = instance.getNumberOfCustomers();
        System.out.println("No of Customers : " + result);
        assertEquals(expResult, result);

    }

    /**
     * Test of removeCustomer method, of class Bank.
     */
    @Test
    public void testRemoveCustomer() {
        System.out.println("removeCustomer");
        String name = "Akashdeep";
        Bank instance = new Bank();
        instance.addCustomer(name, 200);
        boolean expResult = true;
        System.out.println("No of Customers before removing : " + instance.getNumberOfCustomers());

        boolean result = instance.removeCustomer(name);
        assertEquals(expResult, result);
        System.out.println("No of Customers after removing : " + instance.getNumberOfCustomers());

    }

    /**
     * Test of getNumberOfCustomers method, of class Bank.
     */
    @Test
    public void testGetNumberOfCustomers() {
        System.out.println("getNumberOfCustomers");
        Bank instance = new Bank();
        instance.addCustomer("Abhishek", 200);

        int expResult = 1;
        int result = instance.getNumberOfCustomers();
        assertEquals(expResult, result);
    }

    /**
     * Test of transferMoney method, of class Bank.
     */
    @Test
    public void testTransferMoney() {
        System.out.println("transferMoney");
        Bank instance = new Bank();
        instance.addCustomer("Abhishek", 200);
        instance.addCustomer("Akash", 100);
        

        Customer fromCustomer = new Customer("Abhishek",200);
        Customer toCustomer = new Customer("Akashdeep", 100);
        int amountToTransfer = 10;
        boolean expResult = true;
        boolean result = instance.transferMoney(fromCustomer, toCustomer, amountToTransfer);
        assertEquals(expResult, result);
        System.out.println("Customer 1 Balance "+fromCustomer.getAccount().balance());
        System.out.println("Customer 2 Balance "+toCustomer.getAccount().balance());
    }

}
