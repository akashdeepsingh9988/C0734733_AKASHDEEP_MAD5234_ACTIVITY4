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
public class AccountTest {

    public AccountTest() {
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
     * Test of deposit method, of class Account.
     */
    @Test
    public void testInit() {
        System.out.println("deposit");
        int amount = 0;
        Account instance = new Account(0);
        int expResult = 0;
        int result = instance.balance();
        assertEquals(expResult, result);
    }

    @Test
    public void testOverdraft() {
        int amount = 0;
        //initializing account with 0
        Account instance = new Account(amount);
        int balanceToWidrawl = 200;
        /*
            TEST WILL BE FAILED IF WIDRAWL AMOUNT MORE THAN ACCOUNT BALANCE
         */
        System.out.println("Amount to widrawl : " + balanceToWidrawl + "\n Money in account: " + instance.balance());
        assertEquals(instance.balance(), balanceToWidrawl);

    }

    @Test
    public void testDeposit() {
        System.out.println("deposit");
        int amount = 0;
        Account instance = new Account(amount);
        //updating amount
        amount = 100;
        //depositing money in account
        System.out.println("Balance before deposit : " + instance.balance());

        instance.deposit(amount);
        int expResult = 100;
        int result = instance.balance();
        assertEquals(expResult, result);
        System.out.println("Balance after deposit : " + instance.balance());

    }

    /**
     * Test of withdraw method, of class Account.
     */
    @Test
    public void testWithdraw() {
        System.out.println("withdraw");
        int amount = 0;
        //initializing account with 0
        Account instance = new Account(amount);
        instance.deposit(200);
        int balanceToWidrawl = 100;
        System.out.println("Balance before widrawl : " + instance.balance());

        instance.withdraw(balanceToWidrawl);
        int result = instance.balance();
        int expResult = 100;
        assertEquals(expResult, result);
        System.out.println("Balance after widrawl : " + instance.balance());
    }

    /**
     * Test of balance method, of class Account.
     */
    @Test
    public void testBalance() {
        System.out.println("Test Balance");
        Account instance = new Account(0);
        int expResult = 0;
        int result = instance.balance();
        assertEquals(expResult, result);
        System.out.println("Balance In Account : " + result);

        // Depositing money to test balance updating after deposit 
        instance.deposit(200);
        System.out.println("Balance After Deposit : " + instance.balance());

    }
    @Test
    public void testInvalidArgs() {
        System.out.println("Test Invalid Args");
        Account instance = new Account(50);
        int expResult = 50;
        
        // TESTING DEPOSTING NEGATIVE AMOUNT
        instance.deposit(-200);
        int result = instance.balance();
        assertEquals(expResult, result);
        System.out.println("Balance In Account : " + result);
        
             // TESTING WIDRAWL NEGATIVE AMOUNT
        instance.withdraw(-200);
        result = instance.balance();
        assertEquals(expResult, result);
        System.out.println("Balance In Account : " + result);
        
//
//        // Depositing money to test balance updating after deposit 
//        instance.deposit(200);
//        System.out.println("Balance After Deposit : " + instance.balance());

    }

}
