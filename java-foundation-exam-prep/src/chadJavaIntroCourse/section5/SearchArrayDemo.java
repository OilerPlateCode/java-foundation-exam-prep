package chadJavaIntroCourse.section5;

import java.util.Arrays;
import java.util.Scanner;

public class SearchArrayDemo {
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
        System.out.print("What number do you want to search?");
        int searchNumber = scanner.nextInt();

        Arrays.sort(myDataArray);
        int result = Arrays.binarySearch(myDataArray, searchNumber);
        boolean found = (result >= 0);
        if (found) {
            System.out.println("We Found the number " + searchNumber + " in the array");
        } else {
            System.out.println("We Don't Found the number " + searchNumber + " in the array");
        }
        scanner.close();
    }

    private static void displayData(int[] myDataArray) {
        for (int j : myDataArray) {
            System.out.print(j + " ");
        }
    }
}
