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

public class SalesLead {
    /*
     * Sales Lead unique identification number
     */
    protected int salesLeadID;
    protected String sl_location, sl_firstName, sl_lastName, sl_phoneNumber, sl_Email, sl_empID;
    protected String salesLeadDate;
    int cCount;


    // Constructors

    /*
     * SalesLead constructor requiring sales lead ID
     * @param _id SalesLeads' ID
     */
    public SalesLead(int _id) {
        this.salesLeadID = _id;
    }

    /*
     * SalesLead constructor
     */
    public SalesLead() {
    }

    /*
     * SalesLead constructor
     * @param _id               SalesLead ID
     * @param _salesLeadDate    SalesLead Date
     * @param _sl_location      SalesLead Location
     * @param _sl_Email         SalesLead email address
     * @param _sl_firstName     SalesLead first name
     * @param _sl_lastName      SalesLead last name
     * @param _sl_phoneNumber   SalesLead phone number
     * @param _empID            Employee ID number
     */

    public SalesLead(int _id, String _salesLeadDate, String _sl_location, String _sl_firstName, String _sl_lastName, String _sl_phoneNumber, String _sl_Email, String _sl_empID) {
        this.salesLeadID = _id;
        this.salesLeadDate = _salesLeadDate;
        this.sl_location = _sl_location;
        this.sl_Email = _sl_Email;
        this.sl_firstName = _sl_firstName;
        this.sl_lastName = _sl_lastName;
        this.sl_phoneNumber = _sl_phoneNumber;
        this.sl_empID = _sl_empID;

    }

    /*
     * addSL method adds a new SalesLead
     *   The addSL method prompts user to enter
     *   Employee ID, SalesLead full name, date, phone number, and email,
     *   to be stored in the inventory.
     * @return a sl object
     */

    // add salesPeople id to know which one added a salesLea
    public SalesLead addSL(String _sl_empID) {
        SalesLead sl = new SalesLead(cCount++);

        System.out.println("Employee ID: " + _sl_empID);
        sl.setSL_empID(_sl_empID);

        System.out.println("Please enter location ( 'Abington' / 'UniversityPark' ) ");
        sl_location = Exception.testLocation(Exception.getInput());
        sl.setSL_location(sl_location);

        System.out.println("Please enter sales lead first name: ");
        sl_firstName = Exception.testAlpha(Exception.getInput());
        sl.setSl_firstName(sl_firstName);

        System.out.println("Please enter sales lead last name: ");
        sl_lastName = Exception.testAlpha(Exception.getInput());
        sl.setSl_lastName(sl_lastName);

        System.out.println("Please enter date: ");
        salesLeadDate = Exception.testDate(Exception.getInput());
        sl.setSl_Date(salesLeadDate);

        System.out.println("Please enter sales lead phone number:");
        sl_phoneNumber = Exception.testPhone(Exception.getInput());
        sl.setSl_phoneNumber(sl_phoneNumber);

        System.out.println("Please enter sales lead email: ");
        sl_Email = Exception.testEmail(Exception.getInput());
        sl.setSl_Email(sl_Email);

        sl.setSalesLeadID(cCount);


        return sl;
    }

    /*
     * Sales Lead ID getter
     * @return Sales Lead ID
     */

    public int getSalesLeadID() {
        return salesLeadID;
    }

    /*
     * Sales Lead ID setter
     * @param _salesLeadID
     */

    public void setSalesLeadID(int _salesLeadID) {
        this.salesLeadID = _salesLeadID;
    }

    /*
     * Sales Lead first name getter
     * @return String sl_firstName
     */

    public String getSl_firstName() {
        return sl_firstName;
    }


    /*
     * Sales Lead first name setter
     * @return String _sl_firstName
     */

    public void setSl_firstName(String _sl_firstName) {
        this.sl_firstName = _sl_firstName;
    }

    /*
     * Sales Lead last name getter
     * @return String sl_lastName
     */

    public String getSl_lastName() {
        return sl_lastName;
    }

    /*
     * Sales Lead last name setter
     * @return String _sl_lastName
     */

    public void setSl_lastName(String _sl_lastName) {
        this.sl_lastName = _sl_lastName;
    }

    /*
     * Sales Lead phone number getter
     * @return String sl_phoneNumber
     */

    public String getSl_phoneNumber() {
        return sl_phoneNumber;
    }

    /*
     * Sales Lead phone number setter
     * @return String _sl_phoneNumber
     */

    public void setSl_phoneNumber(String _sl_phoneNumber) {
        this.sl_phoneNumber = _sl_phoneNumber;
    }

    /*
     * Sales Lead email getter
     * @return String sl_Email
     */

    public String getSl_Email() {
        return sl_Email;
    }

    /*
     * Sales Lead email setter
     * @return String _sl_Email
     */

    public void setSl_Email(String _sl_Email) {
        this.sl_Email = _sl_Email;
    }

    /*
     * Sales Lead date getter
     * @return String salesLeadDate
     */

    public String getSl_Date() {
        return salesLeadDate;
    }

    /*
     * Sales Lead date setter
     * @return String _sl_Date
     */

    public void setSl_Date(String _sl_Date) {
        this.salesLeadDate = _sl_Date;
    }

    /*
     * Sales Lead employee ID setter
     * @return String _empID
     */

    private void setSL_empID(String _empID) {
        this.sl_empID = _empID;
    }

    /*
     * Sales Lead employee ID getter
     * @return String empID
     */

    private String getSL_empID() {
        return sl_empID;
    }

    /*
     * Sales Lead location setter
     * @return String _location
     */

    public void setSL_location(String _location) {
        this.sl_location = _location;
    }

    /*
     * Sales Lead location getter
     * @return String sl_location
     */

    public String getSl_location() {
        return sl_location;
    }

    /*
     * printSalesLead method prints list of SalesLeads' information, total number of SalesLeads
     * @param slList SalesLead ArrayList
     */

    public static void printSalesLead(ArrayList<SalesLead> slList) {
        for (SalesLead sales_lead : slList) {
            System.out.printf("%-5s | %-12s | %-15s | %-15s | %-14s | %-10s\n", sales_lead.getSalesLeadID(), sales_lead.getSL_empID(), sales_lead.getSl_firstName() + " " + sales_lead.getSl_lastName(), sales_lead.getSl_phoneNumber(), sales_lead.getSl_Email(), sales_lead.getSl_Date());
            // System.out.println(sales_lead.getSalesLeadID(), sales_lead.getSl_firstName(), sales_lead.getSl_lastName());
        }
    }

    /*
     * printSalesLeadByLocation method prints SalesLead that are of a certain location
     * @param slList SalesLead ArrayList
     * @param _location SalesLead's location
     */

    public static void printSalesLeadByLocation(ArrayList<SalesLead> slList, String _location) {
        for (SalesLead sl : slList) {
            if (sl.sl_location.equals(_location)) {
                System.out.printf("%-5s | %-12s | %-10s | %-10s | %-12s | %-10s\n", sl.getSalesLeadID(), sl.getSl_firstName(), sl.getSl_lastName(), sl.getSl_Email(), sl.getSl_phoneNumber(), sl.getSl_location(), sl.getSl_Date());
            }
        }
    }

}