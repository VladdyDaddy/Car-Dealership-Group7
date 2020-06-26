/*
Project: Team Project Design: Create Java Classes
Purpose Details: The Java application you are building for the car dealership will be all text-based running from the command line.
Course: IST 242
Author: Team 7
Date Developed: 06/10/2020
Last Date Changed:06/26/2020
Revision: 3
*/

package edu.psu.abington.ist.ist242;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Enumeration that contains the preset values of credit and cash to set payment type
 */
enum PaymentType {credit, cash}

public class Transaction {

    private double commission = 0.10;
    private int transactionId;
    private PaymentType payment;
    private double subTotal;
    private double totalPrice;
    private double tax = 1.06;

    // Transaction ID

    /**
     * Transaction Id getter
     * @return transaction id
     */

    public int getTransactionId() {
        return transactionId;
    }

    /**
     * Transaction Id setter
     * @param _transactionId transaction id
     */

    public void setTransactionId(int _transactionId) {
        this.transactionId = _transactionId;
    }

    // Commission

    /**
     * Commission getter
     * @return commission getter
     */

    public double getCommission() {
        return commission;
    }

    /**
     * Commission setter
     * @param _Commission Commission
     */

    public void setCommission(double _Commission) {
        this.commission = _Commission;
    }

    /**
     * Commission ID getter
     * @return commission id getter
     */

    public String getCommissionID() {
        return Salesperson.empID;
    }

    /**
     * Commission ID setter
     * @param commissionID commissionID
     */

    public void setCommissionID(String commissionID) {
        Salesperson.empID = commissionID;
    }

    // Price

    /**
     * SubTotal getter
     * @return sub total getter
     */

    public double getSubTotal() {
        return subTotal;
    }

    /**
     * SubTotal setter
     * @param _subTotal Sub Total
     */

    public void setSubTotal(double _subTotal) {
        this.subTotal = _subTotal;
    }

    /**
     * TotalPrice getter
     * @return total price getter
     */

    public double getTotalPrice() {
        return totalPrice;
    }

    /**
     * TotalPrice setter
     * @param _totalPrice Total Price
     */

    public void setTotalPrice(double _totalPrice) {
        this.totalPrice = _totalPrice;
    }

    // Payment Type

    /**
     * PaymentType getter
     * @return payment getter
     */

    public PaymentType getPaymentType() {
        return payment;
    }

    /**
     * PaymentType setter
     * @param _pType PaymentType
     */

    public void setPaymentType(PaymentType _pType) {
        payment = _pType;
    }

    /**
     * setPaymentTyp method
     * Prompt user to select payment type and use try and catch to only accept characters
     * @return payment
     * @author Team 7
     * @version 1.0
     * @since 2020-06-24
     */

    public PaymentType setPaymentType() {
        System.out.println("Enter payment type: cash or credit");
        String _payment = Exception.testAlpha(Exception.getInput());
        payment = PaymentType.valueOf(_payment.toLowerCase());
        return payment;
    }

    // Transaction

    public Transaction() {
    }

    /**
     * calculateTransaction multiplies subtotal and tax, then rounds
     * @param transactionSubtotal subTotal
     * @param tax flat rate 6%
     * @return totalPrice
     * @author Team7
     * @version 1.0
     * @since 2020-06-24
     */

    public double calculateTransaction(double transactionSubtotal, double tax) {
        totalPrice = transactionSubtotal * tax;
        totalPrice = Math.round(totalPrice * 100.0) / 100.0;
        return totalPrice;
    }

    public double calculateCommission(double calculateCommission, double commission) {
        totalPrice = calculateCommission * commission;
        totalPrice = Math.round(totalPrice * 100.0) / 100.0;
        return totalPrice;
    }

    private static DecimalFormat df2 = new DecimalFormat("#.00");

    /**
     * addTransaction will add a new transaction to the array list of transactions
     * @return transaction
     * @author Team 7
     * @version 1.0
     * @since 2020-06-24
     */

    public Transaction addTransaction() {
        Transaction tran = new Transaction();

        System.out.println("Enter transaction ID");
        String _transactionId = Exception.testInt(Exception.getInput());
        transactionId = Integer.parseInt(_transactionId);
        tran.setTransactionId(transactionId);

        System.out.println("Enter subtotal as a int");
        String _subTotal = Exception.testDouble(Exception.getInput());
        subTotal = Double.parseDouble(_subTotal);
        tran.setSubTotal(subTotal);

        tran.setPaymentType();

        tran.setTotalPrice(calculateTransaction(tran.getSubTotal(), tax));
        System.out.println("Total price is: $" + getTotalPrice());

        tran.setCommission(calculateCommission(tran.getSubTotal(), commission));
        System.out.println("Salesperson earned $" + df2.format(tran.getCommission()) + " commission");

        System.out.println("Enter Employee ID");
        Salesperson.empID = Exception.testAlphaNumeric(Exception.getInput());
        tran.setSalesCommission(getTotalPrice());
        tran.setCommissionID(Salesperson.empID);

        System.out.println("Transaction recorded");


        return tran;
    }

    /**
     * listTransactions will print list of previous transactions
     * @param transList Transaction array list
     * @author Team 7
     * @version 1.0
     * @since 2020-06-24
     */

    public static void listTransactions(ArrayList<Transaction> transList) {
        System.out.println("Transaction History:");
        for (Transaction tran : transList) {
            System.out.println();
            System.out.println("Transaction ID: " + tran.getTransactionId());
            System.out.println("Subtotal: $" + df2.format(tran.getSubTotal()));
            System.out.println("Total price: $" + df2.format(tran.getTotalPrice()));
            System.out.println("Payment type: " + tran.getPaymentType());
            System.out.println("Commission from sale: $" + df2.format(tran.getCommission()));
        }
    }

    // commission method

    /**
     * setSalesCommission sets salesperson commission
     * @param commission a double
     * @return commission
     * @author Team 7
     * @version 1.0
     * @since 2020-06-24
     */

    public double setSalesCommission(double commission) {
        double comm = commission * 0.010;
        return comm;
    }
}