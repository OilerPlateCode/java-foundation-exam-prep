package chadJavaIntroCourse.section5;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What size array do you want to fill?");
        int size = scanner.nextInt();



        int[] myDataArray = new int[size];

        // read each number and assign it to an array element
        for (int i = 0; i < myDataArray.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            myDataArray[i] = scanner.nextInt();
        }

        System.out.println();
        System.out.println("Before sorting: ");
        displayData(myDataArray);
        System.out.println();
        Arrays.sort(myDataArray);
        System.out.println("\nAfter sorting: ");
        displayData(myDataArray);
        scanner.close();
    }

    private static void displayData(int[] myDataArray) {
        for (int j : myDataArray) {
            System.out.print(j + " ");
        }
    }
}
