package com.pluralsight;

public class StaticCling {

    public static void main(String[] args) {
        int b = 1;

        int result = myMax(b, 7);
        System.out.println(result);
    }

    /**
     * Print the max of two numbers
     *
     * @param a the first number to compare
     * @param b the second number to compare
     */
    static int myMax(int a, int b) {
//        int a = 1;

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

}