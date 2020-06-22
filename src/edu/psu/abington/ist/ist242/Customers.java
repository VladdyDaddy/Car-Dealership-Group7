/*
Project: Team Project Design: Create Java Classes
Purpose Details: The Java application you are building for the car dealership will be all text-based running from the command line.
Course: IST 242
Author: Team 7
Date Developed: 06/10/2020
Last Date Changed:
Revision: 3
*/

package edu.psu.abington.ist.ist242;

import java.util.ArrayList;
import java.util.Scanner;

public class Customers extends Users{

    /*
     * Unique identification number of each customer and dealership
     */

    private int custID, dealershipID;

    /*
     * Customers first and last name, phone number, and email
     */
    //private String firstName, lastName, phoneNumber, custEmail;

    /*
     * Counter to automatically generate customer IDs
     */
    int cCount = 00001;

    /*
     * Customers constructor requiring Customer ID
     */
    //Customers(String firstName, String lastName,String email,String phoneNumber,String spEmail,String spPhoneNumber, int custID) {
    //    super(firstName, lastName, email, phoneNumber, spEmail, spPhoneNumber);
    //    this.custID = custID;
    //}

    /*
     * Customers constructor
     */
    Customers(int custID) {
        super();
        this.custID = custID;
    }

    Customers() {
        super();
    }

    /*
     * addCustomer method adds a new car dealership customer
     * The addCustomer method prompts user for multiple inputs
     * to get customer information to be stored in an array list.
     */

    // add customer method
    public Customers addCustomer() {
        Customers cust = new Customers(cCount++);
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter Dealership ID: \n 1 - Abington \n 2 - University Park ");
        int dealershipID = scnr.nextInt();
        cust.setDealershipID(dealershipID);

        System.out.println("Please enter customer first name: ");
        firstName = Exception.testAlpha(Exception.getInput());
        cust.setFirstName(firstName);

        System.out.println("Please enter customer last name: ");
        lastName = Exception.testAlpha(Exception.getInput());
        cust.setLastName(lastName);

        System.out.println("Please enter customer phone number:");
        phoneNumber = Exception.testPhone(Exception.getInput());
        cust.setPhoneNumber(phoneNumber);

        System.out.println("Please enter customer email: ");
        email = Exception.testEmail(Exception.getInput());
        cust.setEmail(email);

        cust.setCustID(cCount);

        return cust;
    }

    /*
     * Customer ID getter
     * @return int custID
     */

    public int getCustID() {
        return custID;
    }

    /*
     * Customer ID getter
     * @return int _CustID
     */

    public void setCustID(int _CustID) {
        this.custID = _CustID;
    }

    public static void printCustByDealershipID(ArrayList<Customers> cList, int _id) {
        for (Customers cust : cList) {
            if (cust.dealershipID == _id) {
                System.out.printf("%-10s | %-12s |  %-12s | %-12s | %-10s \n", cust.getCustID(), cust.getFirstName(), cust.getLastName(), cust.getEmail(), cust.getPhoneNumber());
            }

        }
    }


    /*
     * Dealership ID setter
     * @param _dealershipID Dealership ID
     */


    public void setDealershipID(int _dealershipID) {
        this.dealershipID = _dealershipID;
    }

    /*
     * Dealership ID getter
     * @return an integer Dealership ID
     */

    public int getDealershipID() {
        return dealershipID;
    }
}