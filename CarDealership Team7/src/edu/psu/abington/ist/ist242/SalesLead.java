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

public class SalesLead extends Users{
    /*
     * Sales Lead unique identification number
     */
    protected int salesLeadID;
    protected String sl_location, sl_empID;
    protected String salesLeadDate;
    int cCount;


    // Constructors
    /**
     * SalesLead constructor requiring sales lead ID
     *
     * @param _id       SalesLeads ID
     * @author          Team 7
     * @version         1.0
     * @since           2020-06-24
     */
    public SalesLead(int _id) {
        this.salesLeadID = _id;
    }

    /*
     * SalesLead constructor
     */
    public SalesLead() {
        super();
    }

    /**
     * SalesLead constructor
     * @param _id               SalesLead ID
     * @param _salesLeadDate    SalesLead Date
     * @param _sl_location      SalesLead Location
     * @param _sl_Email         SalesLead email address
     * @param _sl_firstName     SalesLead first name
     * @param _sl_lastName      SalesLead last name
     * @param _sl_phoneNumber   SalesLead phone number
     * @param _sl_empID         SalesLead Employee ID number
     * @author                  Team 7
     * @version                 1.0
     * @since                   2020-06-24
     */

    public SalesLead(int _id, String _salesLeadDate, String _sl_location, String _sl_firstName, String _sl_lastName, String _sl_phoneNumber, String _sl_Email, String _sl_empID) {
        this.salesLeadID = _id;
        this.salesLeadDate = _salesLeadDate;
        this.sl_location = _sl_location;
        this.email = _sl_Email;
        this.firstName = _sl_firstName;
        this.lastName = _sl_lastName;
        this.phoneNumber = _sl_phoneNumber;
        this.sl_empID = _sl_empID;

    }

    /**
     * addSL method adds a new SalesLead
     * <p>
     *   The addSL method prompts user to enter
     *   Employee ID, SalesLead full name, date, phone number, and email,
     *   to be stored in the inventory.
     * </p>
     * @param _sl_empID saleslead employee ID
     * @return a sl object
     * @author Team 7
     * @version 1.0
     * @since 2020-06-24
     */

    // add salesPeople id to know which one added a salesLea
    public SalesLead addSL(String _sl_empID) {
        SalesLead sl = new SalesLead(cCount+=1);

        System.out.println("Employee ID: " + _sl_empID);
        sl.setSL_empID(_sl_empID);

        System.out.println("Please enter location ( 'Abington' / 'UniversityPark' ) ");
        sl_location = Exception.testLocation(Exception.getInput());
        sl.setSL_location(sl_location);

        System.out.println("Please enter sales lead first name: ");
        firstName = Exception.testAlpha(Exception.getInput());
        sl.setSl_firstName(firstName);

        System.out.println("Please enter sales lead last name: ");
        lastName = Exception.testAlpha(Exception.getInput());
        sl.setSl_lastName(lastName);

        System.out.println("Please enter date: ");
        salesLeadDate = Exception.testDate(Exception.getInput());
        sl.setSl_Date(salesLeadDate);

        System.out.println("Please enter sales lead phone number:");
        phoneNumber = Exception.testPhone(Exception.getInput());
        sl.setSl_phoneNumber(phoneNumber);

        System.out.println("Please enter sales lead email: ");
        email = Exception.testEmail(Exception.getInput());
        sl.setSl_Email(email);

        sl.setSalesLeadID(cCount);


        return sl;
    }

    /**
     * getSalesLeadID for SalesLead
     *
     * @return  Sales Lead ID
     */
    public int getSalesLeadID() {
        return salesLeadID;
    }

    /**
     * setSalesLeadID for SalesLead
     * @param _salesLeadID   SalesLead ID
     */
    public void setSalesLeadID(int _salesLeadID) {
        this.salesLeadID = _salesLeadID;
        cCount+=1;
    }

    /**
     * getSl_firstName for SalesLead
     *
     * @return    string sl_firstName
     */
    public String getSl_firstName() {
        return firstName;
    }

    /**
     * setSl_firstName for SalesLead
     *
     * @param _sl_firstName   SalesLead First Name
     */
    public void setSl_firstName(String _sl_firstName) {
        this.firstName = _sl_firstName;
    }

    /**
     * getSl_LastName for SalesLead
     *
     * @return    string sl_lastName
     */
    public String getSl_lastName() {
        return lastName;
    }

    /**
     * setSl_lastName for SalesLead
     *
     * @param _sl_lastName   SalesLead Last Name
     */
    public void setSl_lastName(String _sl_lastName) {
        this.lastName = _sl_lastName;
    }

    /**
     * getSl_phoneNumber for SalesLead
     *
     * @return     string SalesLead
     */
    public String getSl_phoneNumber() {
        return phoneNumber;
    }

    /**
     * setSl_phoneNumber for SalesLead
     *
     * @param _sl_phoneNumber   SalesLead Phone Number
     */
    public void setSl_phoneNumber(String _sl_phoneNumber) {
        this.phoneNumber = _sl_phoneNumber;
    }

    /**
     * getSl_Email for SalesLead
     *
     * @return  String sl_Email
     */
    public String getSl_Email() {
        return email;
    }

    /**
     * setSl_Email for SalesLead
     *
     * @param _sl_Email   SalesLead Email
     */
    public void setSl_Email(String _sl_Email) {
        this.email = _sl_Email;
    }

    /**
     * getSl_Date for SalesLead
     *
     * @return    String sl_Date
     */
    public String getSl_Date() {
        return salesLeadDate;
    }

    /**
     * setSl_Date for SalesLead
     *
     * @param _sl_Date   SalesLead Date
     */
    public void setSl_Date(String _sl_Date) {
        this.salesLeadDate = _sl_Date;
    }

    /**
     * setSL_empID for SalesLead
     *
     * @param _empID   Emp. ID
     * @return     string _empID
     */
    private void setSL_empID(String _empID) {
        this.sl_empID = _empID;
    }

    /**
     * getSL_empID for SalesLead
     *
     * @return    String sl_empID
     */
    private String getSL_empID() {
        return sl_empID;
    }

    /**
     * setSL_location for SalesLead
     *
     * @param _location   SalesLead ID
     */
    public void setSL_location(String _location) {
        this.sl_location = _location;
    }

    /**
     * getSl_location for SalesLead
     *
     * @return      String Sl_location
     */
    public String getSl_location() {
        return sl_location;
    }

    /**
     * printSalesLead method prints list of SalesLeads' information, total number of SalesLeads
     * @param slList SalesLead ArrayList
     * @author Team 7
     * @version 1.0
     * @since 2020-06-24
     */
    public static void printSalesLead(ArrayList<SalesLead> slList) {
        for (SalesLead salesLead : slList) {
            System.out.printf("%-5s | %-12s | %-15s | %-15s | %-14s | %-10s | %-16s \n", salesLead.getSalesLeadID(), salesLead.getSL_empID(), salesLead.getSl_firstName() + " " + salesLead.getSl_lastName(), salesLead.getSl_phoneNumber(), salesLead.getSl_Email(), salesLead.getSl_Date(),salesLead.getSalesLeadID());
            // System.out.println(sales_lead.getSalesLeadID(), sales_lead.getSl_firstName(), sales_lead.getSl_lastName());
        }
    }

    /**
     * printSalesLeadByLocation method prints SalesLead that are of a certain location
     * @param slList SalesLead ArrayList
     * @param _location SalesLead's location
     * @author Team 7
     * @version 1.0
     * @since 2020-06-24
     */
    public static void printSalesLeadByLocation(ArrayList<SalesLead> slList, String _location) {
        for (SalesLead sl : slList) {
            if (sl.sl_location.equals(_location)) {
                System.out.printf("%-5s | %-12s | %-10s | %-10s | %-12s | %-10s | %-16s \n", sl.getSalesLeadID(), sl.getSl_firstName(), sl.getSl_lastName(), sl.getSl_Email(), sl.getSl_phoneNumber(), sl.getSl_location(), sl.getSl_Date(), sl.getSalesLeadID());
            }
        }
    }

}