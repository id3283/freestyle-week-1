package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String sizePrompt = """
                Choose sandwich size:
                1: Regular: base price $5.45
                2: Large: base price $8.95
                """;
        System.out.println(sizePrompt);

        String sizeInput = myScanner.nextLine();
        int size = Integer.parseInt(sizeInput);

        double price = -1;

        if (size == 1) {
            price = 5.45;
        }
        if (size == 2) {
            price = 8.95;
        }
        if (price == -1) {
            System.out.println("Invalid size selected. Exiting.");
            System.exit(1);
        }

        System.out.println("Enter your age (don't lie, Dave):");
        String ageInput = myScanner.nextLine();
        int age = Integer.parseInt(ageInput);

        double discountRate = 0.0;

        if (age <= 17) {
            discountRate = 0.10; // 10% discount for students
        }
        if (age >= 65) {
            discountRate = 0.20; // 20% discount for old people
        }
        double finalPrice = price - (price * discountRate);

        System.out.printf("The cost of your sandwich is: $%.2f%n", finalPrice);
    }
}