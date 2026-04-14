package chadJavaIntroCourse.section5;

import java.util.Arrays;
import java.util.Scanner;

public class FillArrayDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What size array do you want to fill?");
        int size = scanner.nextInt();

        System.out.println("What number do you want to fill the array with?");
        int number = scanner.nextInt();

        int[] array = new int[size];

        Arrays.fill(array, number);
        System.out.println();
        for (int j : array) {
            System.out.print(j + " ");
        }
        scanner.close();
    }
}
