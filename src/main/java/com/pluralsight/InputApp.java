package com.pluralsight;

import java.util.Scanner;

public class InputApp {
    static final Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("What do you want to do (1-add, 2= subtract) ?");

        int command = myScanner.nextInt();
        if (command == 1) {
            doAdd();
        } else if (command == 2) {
            doSubtract(myScanner);
        } else {
            System.out.printf("%d -- Invalid command!", command);
        }

    }

    public static void doAdd() {
        System.out.print("Enter 1st number: ");
        double num1 = myScanner.nextDouble();

        System.out.print("Enter 2nd number: ");
        double num2 = myScanner.nextDouble();

        double sum = num1 + num2;
        System.out.printf("%.2f + %.2f = %f", num1, num2, sum);
    }

    public static void doSubtract(Scanner scanner) {
        System.out.print("Enter 1st number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter 2nd number: ");
        double num2 = scanner.nextDouble();

        double difference = num1 - num2;
        System.out.printf("%.2f - %.2f = %f", num1, num2, difference);
    }
}
