/*
Project: Team Project Design: Create Java Classes
Purpose Details: The Java application you are building for the car dealership will be all text-based running from the command line.
Course: IST 242
Author: Team 7
Date Developed: 06/10/2020
Last Date Changed:06/26/2020
Revision: 4
*/
package edu.psu.abington.ist.ist242.unitTesting;

import edu.psu.abington.ist.ist242.Transaction;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransactionTest {

    /**
     * Unit testing for calculateTransaction method in the Transaction class.
     * It tests whether or not the calculation works properly.
     * @author Team 7
     */

    @Test
    public void calculateTransaction_UnitTestTrue() {
        Transaction trans = new Transaction();
        try {
            assertTrue(trans.calculateTransaction(5.0, 5.0) == 25.00);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @Test
    public void calculateTransaction_UnitTestFalse () {
        Transaction trans = new Transaction();
        try {
            assertFalse(trans.calculateTransaction(5.0, 5.0) == 7.0);
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
    /**
     * Unit testing for calculateCommission method in the Transaction class.
     * It tests whether or not the calculation works properly.
     * @author Team 7
     */
    @Test
    public void calculateCommission_UnitTestEquals(){
        Transaction trans = new Transaction();
        try{
            assertEquals(25.0, trans.calculateCommission(250.0, 0.10), 0.0);
        }
        catch(Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
    @Test
    public void calculateCommission_UnitTestNotEquals(){
        Transaction trans = new Transaction();
        try{
            assertNotEquals(8.0, trans.calculateCommission(250.0, 0.10));
        }
        catch(Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }


}
