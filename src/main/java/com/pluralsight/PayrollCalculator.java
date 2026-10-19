package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // get the name
        String name = getName(myScanner);

        // get the hours worked
        int hoursWorked = getHoursWorked(myScanner);

        // get the pay rate
        double payRate = getPayRate(myScanner);

        // calculate gross pay
        double grossPay = calculateGrossPay(payRate, hoursWorked);

        // calculate ot
        double overTimePay = calculateOt(hoursWorked, payRate);

        System.out.println("Yo, " + name + " your gross pay was " + grossPay + "and your over time was " + overTimePay);

        // print gross pay and ot
//
//        System.out.print("Enter your hours worked: ");
//        double hoursWorked = Double.parseDouble(myScanner.nextLine());
//
//        System.out.print("Enter your pay rate: ");
//        double payrate = Double.parseDouble(myScanner.nextLine());
//
//        //Calculating gross pay
//        double grossPay = hoursWorked * payrate;
//
//        // + Optional work
//        double otPayrate = 0;
//
//        if (hoursWorked > 40) {
//            double otHours = hoursWorked - 40;
//            otPayrate = (40 * payrate) + otHours * (payrate * 1.5);
//            System.out.println("Hello " + name + "! Your gross pay is: " + otPayrate + " with overtime!");
//        } else {
//            //Displaying info
//            System.out.println("Hello " + name + "! Your gross pay is: " + grossPay);
//        }
    }

    public static String getName(Scanner inputScanner) {
        // Prompting user for information
        System.out.print("Enter your name: ");
        String name = inputScanner.nextLine();
        return name;
    }

    public static int getHoursWorked(Scanner inputScanner) {
        System.out.println("Enter the hours worked (don't you exaggerate)");
        String userInput = inputScanner.nextLine();
        int hoursWorked = Integer.parseInt(userInput);
        return hoursWorked;
    }

    public static double getPayRate(Scanner theScanner) {
        System.out.println("Enter your pay rate (again, honesty is the best policy!)");
        String userPayRate = theScanner.nextLine();
        double payRate = Double.parseDouble(userPayRate);
        return payRate;
    }

    public static double calculateGrossPay(double payRate, int hours) {
        double grossPay = payRate * hours;
        return grossPay;
    }

    public static double calculateOt(double hoursWorked, double payRate) {
        double otHours = 0;

        if(hoursWorked > 40) {
            otHours = hoursWorked - 40;
        }
        double otPayRate = 1.5 * payRate;

        double otPay = otHours  * otPayRate;
        return otPay;
    }

}