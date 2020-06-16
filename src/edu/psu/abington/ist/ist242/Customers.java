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

public class Customers {

    /*
     * Unique identification number of each customer and dealership
     */

    private int custID, dealershipID;

    /*
     * Customers first and last name, phone number, and email
     */
    private String firstName, lastName, phoneNumber, custEmail;

    /*
     * Counter to automatically generate customer IDs
     */
    int cCount = 00001;

    /*
     * Customers constructor requiring Customer ID
     */
    Customers(int custID) {
    }

    /*
     * Customers constructor
     */
    Customers() {
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
        custEmail = Exception.testEmail(Exception.getInput());
        cust.setCustEmail(custEmail);

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

    /*
     * Customer firstName getter
     * @return String firstName
     */

    public String getFirstName() {
        return firstName;
    }

    /*
     * Customer firstName setter
     * @return String _FirstName
     */

    public void setFirstName(String _FirstName) {
        this.firstName = _FirstName;
    }

    /*
     * Customer lastName getter
     * @return String lastName
     */

    public String getLastName() {
        return lastName;
    }

    /*
     * Customer lastName setter
     * @return String _LastName
     */

    public void setLastName(String _LastName) {
        this.lastName = _LastName;
    }

    /*
     * Customer phoneNumber getter
     * @return String phoneNumber
     */

    public String getPhoneNumber() {
        return phoneNumber;
    }

    /*
     * Customer phoneNumber setter
     * @return String _PhoneNumber
     */

    public void setPhoneNumber(String _PhoneNumber) {
        this.phoneNumber = _PhoneNumber;
    }

    /*
     * Customer custEmail getter
     * @return String custEmail
     */

    public String getcustEmail() {
        return custEmail;
    }

    /*
     * Customer custEmail setter
     * @return String _email
     */

    public void setCustEmail(String _email) {
        this.custEmail = _email;
    }

    /*
     * printCustByDealershipID method lists customers information based on dealership's ID
     *
     * @param cList customers Array List
     * @param _id   dealership's id
     */
    public static void printCustByDealershipID(ArrayList<Customers> cList, int _id) {
        for (Customers cust : cList) {
            if (cust.dealershipID == _id) {
                System.out.printf("%-10s | %-12s |  %-12s | %-12s | %-10s \n", cust.getCustID(), cust.getFirstName(), cust.getLastName(), cust.getcustEmail(), cust.getPhoneNumber());
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