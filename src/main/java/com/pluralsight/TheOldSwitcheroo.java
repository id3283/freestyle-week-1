package com.pluralsight;

public class TheOldSwitcheroo {
    public static void main(String[] args) {
        String menu = """
                Enter the number of the operation you want:
                1. Multiply
                2. Subtract
                3. Add
                """;
        System.out.println(menu);
        int menuChoice = 3;

        if (menuChoice == 1) {
            System.out.println("Multiply");
        } else if (menuChoice == 2) {
            System.out.println("Subtract");
        } else if (menuChoice == 3) {
            System.out.println("Add");
        } else {
            System.out.println("Invalid choice");
        }

        switch(menuChoice) {
            case 1 -> {
                System.out.println("we're gonna multiply... make babies");
            }
            case 2 -> {
                System.out.println("the operation is subtraction");
            }
            case 3 -> {
                System.out.println("addition");
            }
            default -> {
                System.out.println("That wasn't an option, numbskull");
            }
        }

    }
}
