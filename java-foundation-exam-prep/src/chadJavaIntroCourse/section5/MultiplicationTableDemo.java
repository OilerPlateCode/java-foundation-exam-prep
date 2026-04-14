package chadJavaIntroCourse.section5;

import java.util.Scanner;

public class MultiplicationTableDemo {
    public static void main(String[] args) {
        // Prompt the user for the number of rows and columns
        System.out.print("How many rows? ");
        Scanner scanner = new Scanner(System.in);
        int numRows = scanner.nextInt();
        System.out.print("How many columns? ");
        int numColumns = scanner.nextInt();

        scanner.close();

        // initialize the table based on the number of rows and columns
        int[][] table = new int[numRows][numColumns];

        for (int row = 0; row < numRows; row++) {
            for (int column = 0; column < numColumns; column++) {
                table[row][column] = (row + 1) * (column + 1);
            }
        }
        System.out.println();
        for (int row = 0; row < numRows; row++) {
            for (int column = 0; column < numColumns; column++) {
                System.out.print(table[row][column] + "\t");
            }
            System.out.println();
        }
    }
}
