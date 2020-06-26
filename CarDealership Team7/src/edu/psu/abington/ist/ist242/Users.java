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

public class Users {
    public String firstName, lastName, email, phoneNumber, spEmail, spPhoneNumber;

    /**
     * Users Constructor
     *
     * @param _firstName     first name
     * @param _lastName      last name
     * @param _email         email
     * @param _phoneNumber   phoneNumber
     * @param _spEmail       Salesperson email
     * @param _spPhoneNumber Salesperson Phone
     * @author Team 7
     * @version 1.0
     * @since 2020-06-24
     */
    public Users(String _firstName, String _lastName, String _email, String _phoneNumber, String _spEmail, String _spPhoneNumber) {
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.email = _email;
        this.phoneNumber = _phoneNumber;
        this.spEmail = _spEmail;
        this.spPhoneNumber = _spPhoneNumber;
    }

    public Users() {

    }

    /**
     * getFirstName for Customer/Salesperson
     *
     * @return string
     * @author Team 7
     * @version 1.0
     * @since 2020-06-24
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * setFirstName for Customer/Salesperson
     *
     * @param _FirstName First Name of Customer/Salesperson
     * @author Team 7
     * @version 1.0
     * @since 2020-06-24
     */
    public void setFirstName(String _FirstName) {
        this.firstName = _FirstName;
    }

    /**
     * getLastName for Customer/Salesperson
     *
     * @return string
     * @author Team 7
     * @version 1.0
     * @since 2020-06-24
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * setLastName for Customer/Salesperson
     *
     * @param _LastName Last Name of Customer/Salesperson
     * @author Team 7
     * @version 1.0
     * @since 2020-06-24
     */
    public void setLastName(String _LastName) {
        this.lastName = _LastName;
    }

    /**
     * getEmail for Customer/Salesperson
     *
     * @return string
     * @author Team 7
     * @version 1.0
     * @since 2020-06-24
     */
    public String getEmail() {
        return email;
    }

    /**
     * setEmail for Customer/Salesperson
     *
     * @param _email Email
     * @author Team 7
     * @version 1.0
     * @since 2020-06-24
     */
    public void setEmail(String _email) {
        this.email = _email;
    }

    /**
     * getPhoneNumber for Customer/Salesperson
     *
     * @return string
     * @author Team 7
     * @version 1.0
     * @since 2020-06-24
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * setPhoneNumber for Customer/Salesperson
     *
     * @param _PhoneNumber Phone Number
     * @author Team 7
     * @version 1.0
     * @since 2020-06-24
     */
    public void setPhoneNumber(String _PhoneNumber) {
        this.phoneNumber = _PhoneNumber;
    }

    /**
     * getSpEmail for Customer/Salesperson
     *
     * @return string
     * @author Team 7
     * @version 1.0
     * @since 2020-06-24
     */
    public String getSpEmail() {
        return spEmail;
    }

    /**
     * setSpEmail for Salesperson
     *
     * @param _empEmail Email
     * @author Team 7
     * @version 1.0
     * @since 2020-06-24
     */
    public void setSpEmail(String _empEmail) {
        this.spEmail = _empEmail;
    }

    /**
     * getSpPhoneNumber for Salesperson
     *
     * @return string
     * @author Team 7
     * @version 1.0
     * @since 2020-06-24
     */
    public String getSpPhoneNumber() {
        return spPhoneNumber;
    }

    /**
     * getFirstName for Customer/Salesperson
     *
     * @param _spPhoneNumber Phone Number
     * @author Team 7
     * @version 1.0
     * @since 2020-06-24
     */
    public void setSpPhoneNumber(String _spPhoneNumber) {
        this.spPhoneNumber = _spPhoneNumber;
    }
}