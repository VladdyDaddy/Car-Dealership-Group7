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

public class Salesperson {
    /*
     * Employee's commission, first and last names phone number, email, and location
     * Employee ID is a unique number for each employee
     */

    protected int salesPersonID;

    protected String spFirstName, spLastName, spPhoneNumber, spEmail, spLocation;
    public static String empID;
    Scanner userInput = new Scanner(System.in);
    int cCount = 00001;

    // create method getSalespersonByID() find sp by their id
    // Add salesLead - new customer
    public Salesperson(int _id) {
        this.salesPersonID = _id;
    }

    /*
     * SalesLead constructor
     */

    public Salesperson() {
    }


    /*
     * addSalesLead method adds a new sales lead to the dealership
     * @param empID
     */

    public Salesperson(int _id, String _spLocation, String _spFirstName, String _spLastName, String _spPhoneNumber, String _spEmail, String _empID) {
        this.salesPersonID = _id;
        this.spLocation = _spLocation;
        this.spEmail = _spEmail;
        this.spFirstName = _spFirstName;
        this.spLastName = _spLastName;
        this.spPhoneNumber = _spPhoneNumber;
        this.empID = _empID;

    }

    public Salesperson addSalesperson() {
        Salesperson sp = new Salesperson(cCount++);
        Scanner scnr = new Scanner(System.in);

        System.out.println("Please enter salesperson first name: ");
        spFirstName = Exception.testAlpha(Exception.getInput());
        sp.setSpFirstName(spFirstName);

        System.out.println("Please enter salesperson last name: ");
        spLastName = Exception.testAlpha(Exception.getInput());
        sp.setSpLastName(spLastName);

        System.out.println("Please enter salesperson phone number:");
        spPhoneNumber = Exception.testPhone(Exception.getInput());
        sp.setSpPhoneNumber(spPhoneNumber);

        System.out.println("Please enter salesperson email: ");
        spEmail = Exception.testEmail(Exception.getInput());
        sp.setSpEmail(spEmail);

        System.out.println("Please enter salesperson location: ");
        spLocation = Exception.testAlpha(Exception.getInput());
        sp.setSpLocation(spLocation);

        sp.setEmpID(Integer.toString(cCount));


        return sp;
    }

    public void setspID(int cCount) {
    }

    public int getSalesPersonID() {
        return salesPersonID;
    }

    public void setSalesPersonID(int _salesPersonID) {
        this.salesPersonID = _salesPersonID;
    }
    /*
     * Salesperson empID getter
     * @return String empID
     */

    public String getEmpID() {
        return empID;
    } // get random number

    /*
     * Salesperson empID setter
     * @return String empID
     */

    public void setEmpID(String _empID) {
        this.empID = _empID;
    }

    /*
     * Salesperson SpFirstName getter
     * @return String empFirstName
     */

    public String getSpFirstName() {
        return spFirstName;
    }

    /*
     * Salesperson SpFirstName setter
     * @return String empFirstName
     */

    public void setSpFirstName(String _empFirstName) {
        this.spFirstName = _empFirstName;
    }

    /*
     * Salesperson SpLastName getter
     * @return String empLastName
     */

    public String getSpLastName() {
        return spLastName;
    }

    /*
     * Salesperson SpLirstName setter
     * @return String empFirstName
     */

    public void setSpLastName(String _empLastName) {
        this.spLastName = _empLastName;
    }

    /*
     * Salesperson SpphoneNumber getter
     * @return String phoneNumber
     */

    public String getSpPhoneNumber() {
        return spPhoneNumber;
    }

    /*
     * Salesperson SpphoneNumber setter
     * @return String phoneNumber
     */

    public void setSpPhoneNumber(String _PhoneNumber) {
        this.spPhoneNumber = _PhoneNumber;
    }

    /*
     * Salesperson SpEmail getter
     * @return String empEmail
     */

    public String getSpEmail() {
        return spEmail;
    }

    /*
     * Salesperson SpEmail setter
     * @return String empEmail
     */

    public void setSpEmail(String _empEmail) {
        this.spEmail = _empEmail;
    }

    /*
     * Salesperson Splocation setter
     * @return String location
     */

    public void setSpLocation(String _location) {
        this.spLocation = _location;
    }

    /*
     * Salesperson Splocation getter
     * @return String location
     */

    public String getSpLocation() {
        return spLocation;
    }

    /*
     * printSalesperson method lists salesperson information
     * @param salespersonArrayListList salesperson Array List
     */
    public static void printSalesperson(ArrayList<Salesperson> spList) {
        for (Salesperson sales_person : spList) {
            System.out.printf("%-10s | %-10s | %-15s | %-10s | %-10s \n", sales_person.getSpFirstName(), sales_person.getSpLastName(), sales_person.getSpLocation(), sales_person.getSpPhoneNumber(), sales_person.getSpEmail());
        }
    }
}
