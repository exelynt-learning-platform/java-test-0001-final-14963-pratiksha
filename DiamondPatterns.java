package com.exelynt;

public class DiamondPatterns {

    public static void main(String[] args) {

        int rows = 5;

        // Upper part of diamond
        for (int i = 0; i < rows; i++) {

            // spaces
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            // stars
            if (i == 0) {
                System.out.print("*");
            } else {
                System.out.print("*" + " ".repeat(2 * (i - 1)) + "*");
            }

            System.out.println();
        }

        // Lower part of diamond
        for (int i = rows - 2; i >= 0; i--) {

            // spaces
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            if (i == 0) {
                System.out.print("*");
            } else {
                System.out.print("*" + " ".repeat(2 * (i - 1)) + "*");
            }

            System.out.println();
        }
    }
}