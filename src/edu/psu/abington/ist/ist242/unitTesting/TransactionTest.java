package edu.psu.abington.ist.ist242.unitTesting;

import edu.psu.abington.ist.ist242.Transaction;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TransactionTest extends MainTest {

    /**
     * Unit testing for calculateTransaction method in the Transaction class.
     * It tests whether or not the calculation works properly.
     * @author
     */

    @Test
    public void totalPayment_UnitTestTrue() {
        Transaction trans = new Transaction();
        try {
            assertTrue(trans.calculateTransaction(5.0, 5.0) == 25.00);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @Test
    public void totalPayment_UnitTestFalse () {
        Transaction trans = new Transaction();
        try {
            assertFalse(trans.calculateTransaction(5.0, 5.0) == 7.0);
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    /**
     * Unit testing for sales commission method.
     * @author
     */

    @Test
    public void setSalesCommission_UnitTestTrue () {
        Transaction trans = new Transaction();
        try {
            assertTrue(trans.setSalesCommission(100.0) == 15.0);
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @Test
    public void setSalesCommission_UnitTestFalse () {
        Transaction trans = new Transaction();
        try {
            assertFalse(trans.setSalesCommission(100.0) == 20.0);
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
