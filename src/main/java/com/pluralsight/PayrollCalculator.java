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