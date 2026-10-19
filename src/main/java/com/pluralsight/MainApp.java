package com.pluralsight;

public class MainApp {

    public static void main(String[] args) {
        addAndDisplay(2, 3);
    }

    public static void addAndDisplay(int num1, int num2) {
        int sum = num1 + num2;
        System.out.printf("%d + %d = %d%n", num1, num2, sum);
    }
}
