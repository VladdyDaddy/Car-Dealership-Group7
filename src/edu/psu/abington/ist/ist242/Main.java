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

public class Main {

    public static void main(String[] args) {

        /*
         * Array List that stores objects of the Customers class
         */

        ArrayList<Customers> cList = new ArrayList<>();

        /*
         * Array List that stores objects of the Salepersons class
         */

        ArrayList<Salesperson> spList = new ArrayList<>();

        /*
         * Customer object
         */

        Customers cust = new Customers();


        /*
         * Dealership class objects
         */

        Dealership dealer1 = new Dealership();
        dealer1.setDealershipID(1);
        dealer1.setName("Car Dealership Abington");
        dealer1.setAddress("123 St Ave Town, PA 12345");
        dealer1.setPhoneNumber("123456789");

        Dealership dealer2 = new Dealership();
        dealer2.setDealershipID(2);
        dealer2.setName("Car Dealership UniversityPark");
        dealer2.setAddress("456 St Ave Town, PA 54321");
        dealer2.setPhoneNumber("987654321");

        ArrayList<Dealership> dealerList = new ArrayList<>();
        dealerList.add(dealer1);
        dealerList.add(dealer2);


        ArrayList<SalesLead> slList = new ArrayList<>();

        ArrayList<Vehicle> carList = new ArrayList<>();

        ArrayList<Parts> partsList = new ArrayList<>();
        ArrayList<Transaction> transList = new ArrayList<>();

        // objects for each class for adding them to arrayLists

        Vehicle car = new Vehicle();
        Inventory inv = new Inventory();
        Parts parts = new Parts();
        Dealership deal = new Dealership();
        Salesperson sp = new Salesperson();
        SalesLead sl = new SalesLead();
        Transaction tran = new Transaction();


        //Salesperson

        /*
         * Creating Sales persons to add to sales person list
         * @param EmpID             Employee ID number
         * @param EmpEmail          Employee email address
         * @param EmpFirstName      Employee first name
         * @param EmpLastName       Employee last name
         * @param PhoneNumber       Employee phone number
         * @param Location          Location that employee is at
         */

        Salesperson sp1 = new Salesperson();
        sp1.setEmpID("ABC1");
        sp1.setSpEmail("jbond123@gmail.com");
        sp1.setSpFirstName("James");
        sp1.setSpLastName("Bond");
        sp1.setSpPhoneNumber("215-111-1111");
        sp1.setSpLocation("Abington");
        spList.add(sp1);

        Salesperson sp2 = new Salesperson();
        sp2.setEmpID("DEF2");
        sp2.setSpEmail("pparker456@gmail.com");
        sp2.setSpFirstName("Peter");
        sp2.setSpLastName("Parker");
        sp2.setSpPhoneNumber("267-222-2222");
        sp2.setSpLocation("UniversityPark");
        spList.add(sp2);

        Salesperson sp3 = new Salesperson();
        sp3.setEmpID("GHI3");
        sp3.setSpEmail("tonystark789@gmail.com");
        sp3.setSpFirstName("Tony");
        sp3.setSpLastName("Stark");
        sp3.setSpPhoneNumber("215-333-3333");
        sp3.setSpLocation("Abington");
        spList.add(sp3);


        // Vehicles

        /*
         * Creating Cars to add to Car list in inventory
         * @param Color         Color of car
         * @param Year          Year of car
         * @param Model         Model of car
         * @param Maker         Maker of car
         * @param Price         Price of car
         */

        Vehicle car1 = new Vehicle("1A2B3C");
        carList.add(car1);
        car1.setColor("Black");
        car1.setYear(2018);
        car1.setModel("M4");
        car1.setMaker("BMW");
        car1.setNumOfDoors(NumDoors.two);
        car1.setDrivetrain(Wheeldrive.two);
        car1.setVLocation("Abington");
        car1.setPrice(50000);

        Vehicle car2 = new Vehicle("1A4K5L");
        carList.add(car2);
        car2.setColor("Blue");
        car2.setYear(2019);
        car2.setModel("RS4");
        car2.setMaker("Audi");
        car2.setNumOfDoors(NumDoors.four);
        car2.setDrivetrain(Wheeldrive.four);
        car2.setVLocation("UniversityPark");
        car2.setPrice(45000);

        Vehicle car3 = new Vehicle("2B6F9S");
        carList.add(car3);
        car3.setColor("Red");
        car3.setYear(2020);
        car3.setModel("C63S");
        car3.setMaker("Mercedes-Benz");
        car3.setNumOfDoors(NumDoors.two);
        car3.setDrivetrain(Wheeldrive.four);
        car3.setVLocation("Abington");
        car3.setPrice(47000);

        Vehicle car4 = new Vehicle("3D1G7T");
        carList.add(car4);
        car4.setColor("White");
        car4.setYear(2021);
        car4.setModel("Supra");
        car4.setMaker("Toyota");
        car4.setNumOfDoors(NumDoors.two);
        car4.setDrivetrain(Wheeldrive.two);
        car4.setVLocation("UniversityPark");
        car4.setPrice(55000);

        Vehicle car5 = new Vehicle("6H3M2X");
        carList.add(car5);
        car5.setColor("Yellow");
        car5.setYear(2021);
        car5.setModel("M340i");
        car5.setMaker("BMW");
        car5.setNumOfDoors(NumDoors.four);
        car5.setDrivetrain(Wheeldrive.four);
        car5.setVLocation("Abington");
        car5.setPrice(52000);


        //Parts
        /*
         * Creating parts to add to part list
         * @param PartName      Name of part
         * @param PartID        Parts ID number
         * @param Category      Category part belongs to
         * @param Price         Price of part
         * @param Location      Dealership part is located at
         */

        Parts p1 = new Parts();
        partsList.add(p1);
        p1.setPartName("O2 Sensor");
        p1.setPartID(4671);
        p1.setCategory(PartsCategory.electronic);
        p1.setPrice(43.50);
        p1.setLocation("Abington");

        Parts p2 = new Parts();
        partsList.add(p2);
        p2.setPartName("Head Gasket");
        p2.setPartID(5671);
        p2.setCategory(PartsCategory.engine);
        p2.setPrice(55.50);
        p2.setLocation("UniversityPark");

        Parts p3 = new Parts();
        partsList.add(p3);
        p3.setPartName("Seat Belt");
        p3.setPartID(6671);
        p3.setCategory(PartsCategory.interior);
        p3.setPrice(75.00);
        p3.setLocation("UniversityPark");

        Parts p4 = new Parts();
        partsList.add(p4);
        p4.setPartName("Headlights (pair)");
        p4.setPartID(7771);
        p4.setCategory(PartsCategory.exterior);
        p4.setPrice(400.00);
        p4.setLocation("Abington");

        Parts p5 = new Parts();
        partsList.add(p5);
        p5.setPartName("Brakes (single)");
        p5.setPartID(8581);
        p5.setCategory(PartsCategory.control);
        p5.setPrice(32.75);
        p5.setLocation("Abington");


        /*
         * Creating Customers to add to Customer List
         * @param FirstName     customer first name
         * @param LastName      customer last name
         * @param CustID        customers ID number
         * @param PhoneNumber   customers phone number
         * @param CustEmail     customers email address
         * @param DealershipID  customers dealership
         */

        //Customer's information

        Customers cust1 = new Customers();
        Customers cust2 = new Customers();
        Customers cust3 = new Customers();
        Customers cust4 = new Customers();
        Customers cust5 = new Customers();

        cust1.setFirstName("Mohammad");
        cust1.setLastName("Khan");
        cust1.setCustID(00001);
        cust1.setPhoneNumber("(123)-456-7890");
        cust1.setCustEmail("mak93@psu.edu");
        cust1.setDealershipID(1);
        cList.add(cust1);

        cust2.setFirstName("Joe");
        cust2.setLastName("Oakes");
        cust2.setCustID(00002);
        cust2.setPhoneNumber("(321)-456-7890");
        cust2.setCustEmail("jxo@psu.edu");
        cust2.setDealershipID(2);
        cList.add(cust2);

        cust3.setFirstName("Meetkumar");
        cust3.setLastName("Patel");
        cust3.setCustID(00003);
        cust3.setPhoneNumber("(215)-987-6543");
        cust3.setCustEmail("mmp5752@psu.edu");
        cust3.setDealershipID(1);
        cList.add(cust3);

        cust4.setFirstName("Nina");
        cust4.setLastName("Sudheesh");
        cust4.setCustID(00004);
        cust4.setPhoneNumber("(222)-456-7890");
        cust4.setCustEmail("nus688@psu.edu");
        cust4.setDealershipID(2);
        cList.add(cust4);

        cust5.setFirstName("Therese");
        cust5.setLastName("Quiambao");
        cust5.setCustID(00005);
        cust5.setPhoneNumber("(333)-456-7890");
        cust5.setCustEmail("tqq5018@psu.edu");
        cust5.setDealershipID(1);
        cList.add(cust5);

        /*
         * Creating Transactions to Transaction List
         * @param TransactionId     Transaction ID number
         * @param Subtotal          Cost without tax
         * @param TotalPrice        Total Cost with tax
         * @param PaymentType       How the customer paid
         * @param Commission        Percentage of money that goes to sales lead
         * @param Commission ID     Commission ID
         */

        Transaction tran1 = new Transaction();
        tran1.setTransactionId(1);
        tran1.setSubTotal(19999);
        tran1.setTotalPrice(21198.94);
        tran1.setPaymentType(PaymentType.cash);
        tran1.setCommission(1999.90);
        tran1.setCommissionID("ABC1");
        transList.add(tran1);

        Transaction tran2 = new Transaction();
        tran2.setTransactionId(2);
        tran2.setSubTotal(28000);
        tran2.setTotalPrice(29680);
        tran2.setPaymentType(PaymentType.credit);
        tran2.setCommission(2800);
        tran2.setCommissionID("DEF2");
        transList.add(tran2);

        Transaction tran3 = new Transaction();
        tran3.setTransactionId(3);
        tran3.setSubTotal(40000);
        tran3.setTotalPrice(42400);
        tran3.setPaymentType(PaymentType.credit);
        tran3.setCommissionID("GHI3");
        tran3.setCommission(4000);
        transList.add(tran3);

        /*
         * Creating Sales Leads to add information for Sales Lead list
         * @param SalesLeadID       Sales Lead's ID number
         * @param Sl_firstName      Sales Leads first name
         * @param Sl_lastName       Sale Leads last name
         * @param Sl_phoneNumber    Sales Leads phone number
         * @param Sl_Email          Sales Leads email
         * @param Sl_Date           Sales Leads date joined
         * @param Sl_location       Sales Leads location
         */

        SalesLead s1 = new SalesLead();
        s1.setSalesLeadID(0);
        s1.setSl_firstName("John");
        s1.setSl_lastName("Doe");
        s1.setSl_phoneNumber("1234567890");
        s1.setSl_Email("johndoe@gmail.com");
        s1.setSl_Date("01/01/2020");
        s1.setSL_location("Abington");
        slList.add(s1);

        SalesLead s2 = new SalesLead();
        s2.setSalesLeadID(1);

        SalesLead s3 = new SalesLead();
        s3.setSalesLeadID(2);

        SalesLead s4 = new SalesLead();
        s4.setSalesLeadID(3);

        SalesLead s5 = new SalesLead();
        s5.setSalesLeadID(4);


        // Menu options

        final char CUST_CODE = '1';
        final char CUST_PRNT = '2';
        final char SL_CODE = '3';
        final char SL_PRNT = '4';
        final char SP_CODE = '5';
        final char SP_PRINT = '6';
        final char ADD_VEHICLE = '7';
        final char ADD_PARTS = '8';
        final char INV_CODE = '9';
        final char TRAN_CODE = '0';
        final char TRANLIST_CODE = 'T';

        // list dealerships
        final char DEAL_CODE = 'D';

        final char EXIT_CODE = 'Q';


        char userAction;

        final String PROMPT_ACTION = "\n 1 - Add Customer\n 2 - Print Customers\n 3 - Add Sales Lead \n 4 - Print Sales Lead \n 5 - Add Salesperson \n 6 - Print Salesperson\n 7 - Add Vehicle\n 8 - Add Parts\n 9 - List Inventory\n 0 - Add Transaction\n T - Print Transactions\n D - List Dealerships\n Q - Quit\n ";


        // prompt user

        System.out.println("DEALERSHIP MAIN MENU");
        userAction = getAction(PROMPT_ACTION);

        while (userAction != EXIT_CODE) {
            Scanner input = new Scanner(System.in);
            switch (userAction) {
                case CUST_CODE:

                    cList.add(cust.addCustomer());


                    break;
                case CUST_PRNT:
                    System.out.println("1 - Car Dealership Abington \n2 - Car Dealership UniversityPark");
                    int dealership = input.nextInt();

                    switch (dealership) {
                        case 1:
                            System.out.printf("%-10s | %-12s |  %-12s | %-12s | %-10s \n", "ID", "First Name", "Last Name", "Email", "Phone Number");
                            Customers.printCustByDealershipID(cList, 1);
                            break;
                        case 2:
                            System.out.printf("%-10s | %-12s |  %-12s | %-12s | %-10s \n", "ID", "First Name", "Last Name", "Email", "Phone Number");
                            Customers.printCustByDealershipID(cList, 2);
                            break;
                    }

                    break;
                case SP_CODE:

                    spList.add(sp.addSalesperson());


                    break;
                case SP_PRINT:
                    System.out.println("\n 1- Salespersons List");
                    int salesperson = input.nextInt();

                    switch (salesperson) {
                        case 1:
                            System.out.printf("%-10s | %-10s | %-15s | %-10s | %-14s\n", "First Name", "Last Name", "Location", "Phone Number", "Email");
                            Salesperson.printSalesperson(spList);
                    }
                    break;

                case SL_PRNT:

                    System.out.println("\n 1 - Print Sales Lead list \n 2 - Print Sales Lead by Location");
                    int print = input.nextInt();

                    // to do - print salesperson id as well
                    switch (print) {
                        case 1:
                            System.out.printf("%-5s | %-12s | %-15s | %-15s | %-14s | %-10s\n", "ID", "Employee ID", "Name", "Phone Number", "Email", "Date Added");
                            SalesLead.printSalesLead(slList);
                            break;
                        case 2:
                            System.out.println("Enter Location \n 1 - Abington \n 2 - UniversityPark ");
                            int location = input.nextInt();
                            System.out.printf("%-5s | %-12s | %-10s | %-10s | %-12s | %-10s | %-10s\n", "ID", "First Name", "Last Name", "Email", "Phone Number", "Location", "Date Added");
                            if (location == 1) {
                                SalesLead.printSalesLeadByLocation(slList, "Abington");
                            } else if (location == 2) {
                                SalesLead.printSalesLeadByLocation(slList, "UniveristyPark");
                            }
                            break;

                    }
                    break;

                case SL_CODE:
                    System.out.println("Enter your employee id: ");
                    String emp_id = input.next();
                    slList.add(sl.addSL(emp_id));

                    break;

                case INV_CODE:
                    String inv_type = getType();
                    System.out.println("\n Enter location \n 'Abington' \n 'UniversityPark':");
                    String _location = input.nextLine();
                    switch (inv_type) {
                        case "car":
                            car.printCarByLocation(carList, _location);

                            break;

                        case "parts":
                            parts.printPartsByLocation(partsList, _location);

                            break;
                    }
                    break;

                case TRAN_CODE:
                    transList.add(tran.addTransaction());

                    break;

                case TRANLIST_CODE:
                    tran.listTransactions(transList);

                    break;
                case ADD_PARTS:
                    partsList.add(parts.addParts());

                    break;

                case ADD_VEHICLE:

                    System.out.println("Enter Vehicle Type ('car':): ");
                    inv_type = input.nextLine().toLowerCase();

                    switch (inv_type) {
                        case "car":
                            carList.add(car.addCar());
                            break;
                    }
                    break;

                case DEAL_CODE:
                    deal.listDealerships(dealerList);

                    break;
            }

            userAction = getAction(PROMPT_ACTION);
        }
    }

    /*
     * gets user input
     * @param prompt a char
     * @return a char
     */

    public static char getAction(String prompt) {

        Scanner scnr = new Scanner(System.in);
        String answer = "";
        System.out.println(prompt);
        answer = scnr.nextLine().toUpperCase() + " ";
        char firstChar = answer.charAt(0);
        return firstChar;
    }

    /*
     * gets type of inventory item
     * @return a String
     */

    public static String getType() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter Vehicle Type ('car'/'parts'): ");
        String type = scnr.nextLine().toLowerCase();
        return type;
    }
}