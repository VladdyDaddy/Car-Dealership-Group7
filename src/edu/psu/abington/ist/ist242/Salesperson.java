/*
Project: Team Project Design: Create Java Classes
Purpose Details: The Java application you are building for the car dealership will be all text-based running from the command line.
Course: IST 242
Author: Team 7
Date Developed: 06/10/2020
Last Date Changed: 06/25/2020
Revision: 4
*/

package edu.psu.abington.ist.ist242;
import java.util.ArrayList;
import java.util.Scanner;
public class Salesperson extends Users{
    /*
     * Employee's commission, first and last names phone number, email, and location
     * Employee ID is a unique number for each employee
     */
    protected int salesPersonID;
    protected String spLocation;
    public static String empID;
    Scanner userInput = new Scanner(System.in);
    int cCount = 00001;
    // create method getSalespersonByID() find sp by their id
    // Add salesLead - new customer
    public Salesperson(int _id) {
        super();
        this.salesPersonID = _id;
    }
    /*
     * SalesLead constructor
     */
    public Salesperson() {
        super();
    }

    public Salesperson addSalesperson() {
        Salesperson sp = new Salesperson(cCount++);
        System.out.println("Please enter salesperson first name: ");
        firstName = Exception.testAlpha(Exception.getInput());
        sp.setFirstName(firstName);
        System.out.println("Please enter salesperson last name: ");
        lastName = Exception.testAlpha(Exception.getInput());
        sp.setLastName(lastName);
        System.out.println("Please enter salesperson phone number:");
        phoneNumber = Exception.testPhone(Exception.getInput());
        sp.setSpPhoneNumber(phoneNumber);
        System.out.println("Please enter salesperson email: ");
        email = Exception.testEmail(Exception.getInput());
        sp.setEmail(email);
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

    public void setSpPhoneNumber(String _PhoneNumber) {
        this.spPhoneNumber = _PhoneNumber;
    }

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
        for (Salesperson salesPerson : spList) {
            System.out.printf("%-10s | %-10s | %-15s | %-10s | %-10s \n",
                    salesPerson.getFirstName(), salesPerson.getLastName(),
                    salesPerson.getSpLocation(), salesPerson.getPhoneNumber(), salesPerson.getEmail());
        }
    }
}
