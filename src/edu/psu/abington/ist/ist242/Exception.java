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

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {

    /*
     * getInput method prompts user for an input
     *  This method is used inside the addCustomer method to
     *  ask for customer information and then through setters
     * @return input
     */
    public static String getInput() {
        Scanner scnr = new Scanner(System.in);
        String input = scnr.nextLine();
        return input;
    }


    /*
     * testAlpha method tests if input contains alpha characters
     *  This method consists of a try and catch block
     *  to assure user input contains only alpha characters.
     * @param alphaCharacter user input
     * @return a String of alpha characters
     * @throws InputMismatchException if string tested does not contain
     *alpha characters
     */
    public static String testAlpha(String alphaCharacter) {
        try {

            if (alphaCharacter.matches("^[a-zA-Z]*$")) {
                return alphaCharacter;
            } else {
                throw new InputMismatchException("not alpha");
            }

        } catch (InputMismatchException notAnAlpha) {
            System.out.println("Invalid input. Please try again.");
            return testAlpha(getInput());

        }

    }

    /*
     * testEmail method tests if input matches an email format
     *  This method consists of a try and catch block
     *  to assure user input follows a standard email format.
     * @param email user input
     * @return an email address
     * @throws InputMismatchException if string tested does not match
     *email format
     */
    public static String testEmail(String email) {
        try {

            if (email.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$")) {
                return email;
            } else {
                throw new InputMismatchException("invalid");
            }


        } catch (InputMismatchException notAnEmail) {
            System.out.println("Invalid input. Please try again.");
            return testEmail(getInput());

        }
    }

    /*
     * testPhone method tests if input matches a phone number format
     *  This method consists of a try and catch block
     *  to assure user input follows a standard phone number format.
     * @param phone user input
     * @return a phone number
     * @throws InputMismatchException if input tested does not match
     *phone number format
     */

    public static String testPhone(String phone) {
        try {

            if (phone.matches("^[a-zA-Z0-9]*$")) {
                return phone;
            } else {
                throw new InputMismatchException("invalid");
            }


        } catch (InputMismatchException notAnEmail) {
            System.out.println("Invalid input. Please try again.");
            return testPhone(getInput());

        }
    }

    /*
     * testDouble method tests if input is a double
     *  This method consists of a try and catch block
     *  to assure user input for setting an auto part price
     *  is a double.
     * @param price user input
     * @return a price
     * @throws InputMismatchException if input tested is not a double
     */
    public static String testDouble(String price) {
        try {

            if (price.matches("\\d*$")) {
                return price;
            } else {
                throw new InputMismatchException("not price");
            }

        } catch (InputMismatchException notAnAlpha) {
            System.out.println("Invalid input. Please try again.");
            return testDouble(getInput());

        }

    }

    /*
     * testInt method tests if input matches numeric characters
     *  This method consists of a try and catch block
     *  to assure user input contains digits only.
     * @param input user input
     * @return integer
     * @throws InputMismatchException if input tested is not an integer
     */
    public static String testInt(String input) {
        try {
            if (input.matches("\\d*$")) {
                return input;
            } else {
                throw new NumberFormatException("not an integer");
            }
        } catch (NumberFormatException notAnInt) {
            System.out.println("Invalid input. You did not enter an integer number. Please try again. \n");
            return testInt(getInput());
        }


    }

    /*
     * testAlphaNumeric method tests if input matches alphanumeric characters
     *  This method consists of a try and catch block
     *  to assure user input contains alphanumeric characters only.
     * @param input user input
     * @return alphanumeric string
     * @throws InputMismatchException if input tested is not alphanumeric
     */
    public static String testAlphaNumeric(String input) {
        try {
            if (input.matches("^[a-zA-Z0-9]*$")) {
                return input;
            } else {
                throw new NumberFormatException("not alphanumeric");
            }
        } catch (NumberFormatException notAnInt) {
            System.out.println("Invalid input. You did not enter alphanumeric characters. Please try again. \n");
            return testAlphaNumeric(getInput());
        }
    }

    /*
     * testDate method tests if input contains numbers
     *  This method consists of a try and catch block
     *  to assure user input contains only numbers in a date format.
     * @param date user input
     * @return number
     * @throws InputMismatchException if string tested does not contain
     *numbers
     */
    public static String testDate(String date) {
        try {

            if (date.matches("[0-9]+[/]+[\\d]+[/]+[\\d]*$")) {
                return date;
            } else {
                throw new InputMismatchException("invalid");
            }


        } catch (InputMismatchException notAnEmail) {
            System.out.println("Invalid input. Please try again.");
            return testDate(getInput());

        }
    }

    /*
     * testLocation method tests if input is only either "Abington" or "University Park"
     *  This method consists of a try and catch block
     *  to assure user input is only either "Abington" or "UniversityPark".
     * @param  input user input
     * @return input "Abington" or "UniversityPark"
     * @throws InputMismatchException if string tested does not contain
     * "Abington" or "UniversityPark"
     */
    public static String testLocation(String input) {
        try {
            if ((input.matches("Abington")) || (input.matches("UniversityPark"))) {
                return input;
            } else {
                throw new InputMismatchException("invalid");
            }
        } catch (InputMismatchException LocationNotFound) {
            System.out.println("Invalid input. Enter only either 'Abington' or 'UniversityPark'. Please try again. \n");
            return testLocation(getInput());
        }
    }

}