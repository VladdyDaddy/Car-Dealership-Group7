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

public class Dealership {

    /**
     * Dealership name, address, and phone number
     * @author Team 7
     */
    private String name, address, phoneNumber;

    /**
     * The dealership unique identification number
     * @author Team 7
     */

    private int dealershipID;

    /**
     * Dealership Constructor requiring name, address, phone number
     * @param name         dealership name
     * @param address      dealership address
     * @param phoneNumber  dealership phone number
     * @author Team 7
     * @version 1.0
     * @since 2020-06-24
     */

    public Dealership(String name, String address, String phoneNumber) {}

    public Dealership() {
    }

    // setters and getters

    /**
     * @return dealership id getter
     */

    public int getDealershipID() {
        return dealershipID;
    }


    /**
     * @param _DealershipID setter
     */
    public void setDealershipID(int _DealershipID) {
        this.dealershipID = _DealershipID;
    }

    /**
     * @return dealership name getter
     */
    public String getName() {
        return name;
    }

    /**
     * @param _Name dealership name setter
     */
    public void setName(String _Name) {
        this.name = _Name;
    }

    /**
     * @return dealership address getter
     */

    public String getAddress() {
        return address;
    }

    /**
     * @param _Address dealership address setter
     */

    public void setAddress(String _Address) {
        this.address = _Address;
    }

    /**
     * @return dealership phone number getter
     */

    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param _PhoneNumber dealership phone number setter
     */

    public void setPhoneNumber(String _PhoneNumber) {
        this.phoneNumber = _PhoneNumber;
    }

    // list information for all dealerships

    /**
     * listDealerships prints dealership information
     * @param dealerList dealership array list
     * @author Team 7
     * @version 1.0
     * @since 2020-06-24
     */

    public void listDealerships(ArrayList<Dealership> dealerList) {
        System.out.println("Dealership Locations:");
        for (Dealership dealer : dealerList) {
            System.out.println();
            System.out.println("Dealership ID: " + dealer.getDealershipID());
            System.out.println("Name: " + dealer.getName());
            System.out.println("Address: " + dealer.getAddress());
            System.out.println("Phone Number: " + dealer.getPhoneNumber());
        }
    }
}
