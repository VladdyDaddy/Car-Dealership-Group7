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

public class Inventory {

    /*
     * Protected Data Members
     * vehicle and parts ArrayLists
     */
    protected ArrayList vehicleList;
    protected ArrayList partsList;


    /*
     * Constructor Method creates ArrayLists named vehicleList, partsList
     */
    public Inventory() {
        vehicleList = new ArrayList<Vehicle>();
        partsList = new ArrayList<Parts>();
    }
}

class Parts {

    /*
     * part unique identification number
     */
    private int partID;

    /*
     * part name, location
     */
    private String name, location;

    /*
     * part price
     */
    private double price;

    /*
     * part category
     */
    private PartsCategory partCategory;

    /*
     * Counter that initializes parts ID
     */
    int cCount = 00001;


    /*
     * Parts Constructor
     */

    public Parts() {

    }

    /*
     * Parts Constructor
     * @param _partsID
     */
    public Parts(int _partsID) {

    }

    /*
     * Parts Constructor
     * @param _partID
     * @param _partCategory
     * @param _name
     */

    public Parts(int _partID, PartsCategory _partCategory, String _name) {
        this.name = _name;
        this.partCategory = _partCategory;
        this.partID = _partID;

    }

    /*
     * addParts method adds parts to inventory
     * The addParts method prompts user to enter
     * a Parts name, category, and price to be stored
     * in the inventory.
     * @return parts object of the Parts class
     */

    public Parts addParts() {
        Parts parts = new Parts(cCount++);
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter part name: ");
        name = Exception.testAlpha(Exception.getInput());
        parts.setPartName(name);

        parts.setCategory();

        System.out.println("Please enter part price: ");
        price = Double.parseDouble(Exception.getInput());
        parts.setPrice(price);

        System.out.println("Please enter location: ");
        location = Exception.testAlpha(Exception.getInput());
        parts.setLocation(location);

        parts.setPartID(cCount);

        return parts;
    }

    /*
     * Parts ID getter
     */

    public int getPartID() {
        return partID;
    }

    /*
     * Parts ID setter
     */

    public void setPartID(int randomID) {
        this.partID = randomID;
    }

    /*
     * Parts Category getter
     */
    public PartsCategory getPartCategory() {
        return partCategory;
    }

    /*
     * Part location setter
     */

    public void setLocation(String _location) {
        this.location = _location;
    }

    /*
     * Part location getter
     */

    public String getLocation() {
        return location;
    }

    /*
     * Parts name getter
     */
    public String getPartName() {
        return name;
    }

    /*
     * Parts name setter
     */

    public void setPartName(String anyName) {
        this.name = anyName;
    }


    /*
     * Parts price getter
     */
    public double getPrice() {
        return price;
    }

    /*
     * Parts price setter
     */

    public void setPrice(double _price) {
        this.price = _price;
    }

    /*
    Parts category setter
    */

    public void setCategory(PartsCategory _category) {
        this.partCategory = _category;
    }

    public PartsCategory getCategory() {
        return partCategory;
    }

    /*
     * setCategory method sets category type for an auto part
     * This method asks user to enter a category type predetermined by the
     * PartsCategory enum
     * @return part Category
     */

    public PartsCategory setCategory() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Parts Type ('electronic', 'engine', 'interior', 'exterior', 'control'): ");
        partCategory = PartsCategory.valueOf(input.next().toLowerCase());
        return partCategory;
    }


    /*
     * printPartsByLocation method prints parts that are of a specific dealership
     * @param partsList parts Array List
     * @param _location parts location
     */
    public void printPartsByLocation(ArrayList<Parts> partsList, String _location) {
        for (Parts parts : partsList) {
            if (parts.location.equals(_location)) {
                System.out.printf("%-10s | %-10s | %-10s | %-10s | %-10s \n", parts.getPartID(), parts.getPartName(), parts.getPrice(), parts.getPartCategory(), parts.getLocation());
            }
        }
    }
}

enum PartsCategory {electronic, engine, interior, exterior, control}


class Vehicle {

    public Vehicle(String vin_) {

        NumDoors numOfDoors;

    }

    public Vehicle() {

    }

    /*
     * addCar method adds a new car to the inventory
     * The addCar method prompts user to enter
     * a car VIN, model, maker, year, color, and price,
     * to be stored in the inventory.
     * @return a Car object
     */

    public Vehicle addCar() {
        Vehicle car = new Vehicle();
        Scanner scnr = new Scanner(System.in);


        System.out.println("Enter Dealership ID: ");
        car.setDealershipID(scnr.nextInt());

        System.out.println("Please enter location: ");
        location = Exception.testAlpha(Exception.getInput());
        car.setVLocation(location);

        System.out.println("Please enter VIN number: ");
        vin = Exception.testAlphaNumeric(Exception.getInput());
        car.setVin(vin);

        System.out.println("Please enter car model: ");
        model = Exception.testAlpha(Exception.getInput());
        car.setModel(model);

        System.out.println("Please enter car maker: ");
        maker = Exception.testAlpha(Exception.getInput());
        car.setMaker(maker);

        System.out.println("Please enter car year: ");
        String _year = Exception.testInt(Exception.getInput());
        year = Integer.parseInt(_year);
        car.setYear(year);

        car.setNumOfDoors();

        car.setDrivetrain();

        System.out.println("Please enter car color: ");
        color = Exception.testAlpha(Exception.getInput());
        car.setColor(color);

        System.out.println("Please enter car price: ");
        String _price = Exception.testDouble(Exception.getInput());
        price = Double.parseDouble(_price);
        car.setPrice(price);

        return car;
    }

    /*
     * printCarsByLocation method prints cars that are of a specific dealership
     *
     * @param carList   car Array List
     * @param _location vehicle location
     */
    public static void printCarByLocation(ArrayList<Vehicle> carList, String _location) {
        for (Vehicle car : carList) {

            // cannot use super.color from a non static context, so added String color to Car class

            if (car.location.equals(_location)) {
                System.out.printf("%-10s | %-10s | %-12s | %-10s | %-10s | %-10s | %10s | %-10s \n", car.getVin(), car.getYear(), car.getMaker(), car.getModel(), car.getNumOfDoors(), car.getDrivetrain(), car.getVLocation(), car.getPrice());
            }
        }
    }

    /*
     * Vehicle Identification Number
     */
    protected String vin;


    /*
     * Dealership ID
     */
    protected int dealership_id;

    /*
     * Vehicle name, location
     */
    protected String name, location;

    /*
     * Vehicle price
     */
    protected double price;

    /*
     * Dealership unique identification number
     */
    protected int dealershipID;

    /*
     * Vehicle maker, model, and color
     */

    protected String maker, model, color;

    /*
     * year
     */
    protected int year;

    protected Wheeldrive wheeldrive;

    protected NumDoors numDoors;


    /*
     * Vehicle price getter
     * @return price
     */

    public double getPrice() {
        return price;
    }

    /*
     * Vehicle price setter
     * @param _price Price
     */

    public void setPrice(double _price) {
        this.price = _price;
    }

    /*
     * VIN getter
     * @return VIN
     */

    public String getVin() {
        return vin;
    }

    /*
     * VIN setter
     * @param _Vin VIN
     */

    public void setVin(String _Vin) {
        this.vin = _Vin;
    }

    /*
     * Vehicle name setter
     * @param _name name
     */
    public void setName(String _name) {
        this.name = _name;
    }

    /*
     * Vehicle name getter
     * @return name
     */

    public String getName() {
        return name;
    }

    /*
     * Model getter
     * @return model
     */
    public String getModel() {
        return model;
    }

    /*
     * Model setter
     * @param _Model model
     */
    public void setModel(String _Model) {
        this.model = _Model;
    }

    /*
     * Maker getter
     * @return maker
     */

    public String getMaker() {
        return maker;
    }

    /*
     * Maker setter
     * @param _Maker maker
     */
    public void setMaker(String _Maker) {
        this.maker = _Maker;
    }

    /*
     * Color getter
     * @return color
     */
    public String getColor() {
        return color;
    }

    /*
     * Color setter
     * @param _Color color
     */

    public void setColor(String _Color) {
        this.color = _Color;
    }

    /*
     * Vehicle year getter
     * @return
     */

    public int getYear() {
        return year;
    }

    /*
     * Vehicle year setter
     * @param _Year year
     */
    public void setYear(int _Year) {
        this.year = _Year;
    }

    /*
     * Dealership ID setter
     * @param _dealershipID dealership ID
     */
    public void setDealershipID(int _dealershipID) {
        this.dealershipID = _dealershipID;
    }


    /*
     * Dealership ID getter
     * @return Dealership ID
     */
    public int getDealershipID() {
        return dealershipID;
    }

    /*
     * setVLocation sets vehicle location
     * @param _location
     */

    public void setVLocation(String _location) {
        this.location = _location;
    }

    /*
     * Location getter
     */

    public String getVLocation() {
        return location;
    }

    public Wheeldrive getDrivetrain() { return wheeldrive; }

    /*
     * Wheeldrive setter
     * @param _wheeldrive wheeldrive
     */

    public void setDrivetrain(Wheeldrive _wheeldrive){ this.wheeldrive =_wheeldrive;}

    /*
     * Vehicle number of doors setter
     * @param _numDoors number of doors
     */
    public void setNumOfDoors(NumDoors _numDoors) { this.numDoors = _numDoors; }


    /*
     * Vehicle number of doors getter
     * @return number of doors
     */
    public NumDoors getNumOfDoors() { return numDoors; }

    public NumDoors setNumOfDoors() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of doors ('two' / 'four'): ");
        numDoors = NumDoors.valueOf(input.next().toLowerCase());
        return numDoors;
    }


    public Wheeldrive setDrivetrain() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter drivetrain ('two' / 'four'): ");
        wheeldrive = Wheeldrive.valueOf(input.next().toLowerCase());
        return wheeldrive;
    }


}