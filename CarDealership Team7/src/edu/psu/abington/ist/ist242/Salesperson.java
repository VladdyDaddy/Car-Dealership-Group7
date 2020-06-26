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
import java.util.ArrayList;
import java.util.Scanner;
public class Salesperson extends Users{
    /**
     * Employee's commission, first and last names phone number, email, and location
     * Employee ID is a unique number for each employee
     */
    protected int salesPersonID;
    protected String spLocation;
    public static String empID;
    Scanner userInput = new Scanner(System.in);
    public static int cCount = 00001;
    // create method getSalespersonByID() find sp by their id
    // Add salesLead - new customer
    /**
     * Salesperson
     *
     * @param _id   Salesperson ID
     * @author      Team 7
     * @version     1.0
     * @since       2020-06-24
     */
    public Salesperson(int _id) {
        super();
        this.salesPersonID = _id;
    }
    /**
     * SalesLead constructor
     */
    public Salesperson() {
        super();
    }

    public Salesperson addSalesperson() {
        Salesperson sp = new Salesperson(cCount+=1);
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter salesperson first name: ");
        firstName = Exception.testAlpha(Exception.getInput());
        sp.setFirstName(firstName);
        System.out.println("Please enter salesperson last name: ");
        lastName = Exception.testAlpha(Exception.getInput());
        sp.setLastName(lastName);
        System.out.println("Please enter salesperson phone number:");
        phoneNumber = Exception.testPhone(Exception.getInput());
        sp.setPhoneNumber(phoneNumber);
        System.out.println("Please enter salesperson email: ");
        email = Exception.testEmail(Exception.getInput());
        sp.setEmail(email);
        System.out.println("Please enter salesperson location: ");
        spLocation = Exception.testAlpha(Exception.getInput());
        sp.setSpLocation(spLocation);
        System.out.println("Please enter Employee ID: ");
        empID = Exception.testAlphaNumeric(Exception.getInput());
        sp.setEmpID(empID);

        return sp;
    }
    public void setspID(int num) {
        this.salesPersonID = num;
        cCount+=1;
    }
    /**
     * getSalesPersonID for Salesperson
     *
     * @return     String Salesperson
     */
    public int getSalesPersonID() {
        return salesPersonID;
    }

    /**
     * setSalesPersonID for Salesperson
     *
     * @param _salesPersonID    Salesperson ID
     */
    public void setSalesPersonID(int _salesPersonID) {
        this.salesPersonID = _salesPersonID;
    }

    /**
     * getEmpID for Salesperson
     *
     * @return      String EmpID
     */
    public String getEmpID() {
        return empID;
    } // get random number

    /**
     * setEmpID for Salesperson
     *
     * @param _empID   Salesperson ID
     */
    public void setEmpID(String _empID) {
        this.empID = _empID;
    }

    /**
     * setSpPhoneNumber for Salesperson
     *
     * @param _PhoneNumber   Salesperson Phone Number
     */
    public void setSpPhoneNumber(String _PhoneNumber) {
        this.spPhoneNumber = _PhoneNumber;
    }

    /**
     * setSpLocation for Salesperson
     *
     * @param _location   Salesperson Location
     */
    public void setSpLocation(String _location) {
        this.spLocation = _location;
    }

    /**
     * getSpLocation for Salesperson
     *
     * @return     String spLocation
     */
    public String getSpLocation() {
        return spLocation;
    }

    public static int getCCount() {
        return cCount;
    }

    /**
     * printSalesperson method lists salesperson information
     * @param spList salesperson Array List
     * @author Team 7
     * @version 1.0
     * @since 2020-06-24
     */
    public static void printSalesperson(ArrayList<Salesperson> spList) {
        for (Salesperson salesPerson : spList) {
            System.out.printf("%-10s | %-10s | %-15s | %-10s | %-10s | %-16s \n", salesPerson.getFirstName(), salesPerson.getLastName(), salesPerson.getSpLocation(), salesPerson.getPhoneNumber(), salesPerson.getEmail(), salesPerson.getSalesPersonID());
        }
    }
}