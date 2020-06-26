/*
Project: Team Project Design: Create Java Classes
Purpose Details: The Java application you are building for the car dealership will be all text-based running from the command line.
Course: IST 242
Author: Team 7
Date Developed: 06/10/2020
Last Date Changed:06/26/2020
Revision: 4
*/

package edu.psu.abington.ist.ist242;

import java.util.ArrayList;
import java.util.Scanner;

public class Customers extends Users{

    /**
     * Unique identification number of each customer and dealership
     * @author Team 7
     */

    private int custID, dealershipID;

    /**
     * Customers first and last name, phone number, and email
     * @author Team 7
     */
    private String firstName, lastName, phoneNumber, custEmail;

    /**
     * Counter to automatically generate customer IDs
     * @author Team 7
     */
    int cCount = 00001;

    /**
     * Customers constructor requiring Customer ID
     * @author Team 7
     */
    Customers(int custID) {
        super();
        this.custID = custID;
    }

    /**
     * Customers constructor
     * @author Team 7
     */
    Customers() {
        super();
    }

    /**
     * addCustomer method adds a new car dealership customer
     *
     * The addCustomer method prompts user for multiple inputs
     * to get customer information to be stored in an array list.
     * @return a Customer object
     * @author Team7
     * @version 1.0
     * @since 2020-06-24
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
        cust.setCustEmail(email);

        cust.setCustID(cCount);

        return cust;
    }

    /**
     * Customer ID getter
     * @return customer id getter
     */

    public int getCustID() {
        return custID;
    }

    /**
     * Customer ID getter
     * @param _CustID customer id
     */

    public void setCustID(int _CustID) {
        this.custID = _CustID;
    }

    /**
     * Customer firstName getter
     * @return firstname getter
     */

    public String getFirstName() {
        return firstName;
    }

    /**
     * Customer firstName setter
     * @param _FirstName customer firstname
     */

    public void setFirstName(String _FirstName) {
        this.firstName = _FirstName;
    }

    /**
     * Customer lastName getter
     * @return customer lastname getter
     */

    public String getLastName() {
        return lastName;
    }

    /**
     * Customer lastName setter
     * @param _LastName customer lastname
     */

    public void setLastName(String _LastName) {
        this.lastName = _LastName;
    }

    /**
     * Customer phoneNumber getter
     * @return customer phonenumber getter
     */

    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Customer phoneNumber setter
     * @param _PhoneNumber customer phonenumber
     */

    public void setPhoneNumber(String _PhoneNumber) {
        this.phoneNumber = _PhoneNumber;
    }

    /**
     * Customer custEmail getter
     * @return customer email getter
     */

    public String getcustEmail() {
        return custEmail;
    }

    /**
     * Customer custEmail setter
     * @param _email customer email
     */

    public void setCustEmail(String _email) {
        this.custEmail = _email;
    }

    /**
     * printCustByDealershipID method lists customers information based on dealership's ID
     *
     * @param cList customers Array List
     * @param _id   dealership's id
     * @author Team 7
     * @version 1.0
     * @since 2020-06-24
     */
    public static void printCustByDealershipID(ArrayList<Customers> cList, int _id) {
        for (Customers cust : cList) {
            if (cust.dealershipID == _id) {
                System.out.printf("%-10s | %-12s |  %-12s | %-12s | %-10s \n", cust.getCustID(), cust.getFirstName(), cust.getLastName(), cust.getcustEmail(), cust.getPhoneNumber());
            }

        }
    }


    /**
     * Dealership ID setter
     * @param _dealershipID Dealership ID
     * @author Team 7
     * @version 1.0
     * @since 2020-06-24
     */


    public void setDealershipID(int _dealershipID) {
        this.dealershipID = _dealershipID;
    }

    /**
     * Dealership ID getter
     * @return an integer Dealership ID
     * @author Team 7
     * @version 1.0
     * @since 2020-06-24
     */

    public int getDealershipID() {
        return dealershipID;
    }
}