package chadJavaIntroCourse.section5;

import java.util.Scanner;

public class CalculateTotalKMDriven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of trips: ");
        int numberOfTrips = scanner.nextInt();
        float[] kmDriven = new float[numberOfTrips];

        for (int i = 0; i < numberOfTrips; i++) {
            System.out.println("Enter a KM driven amount: ");
            kmDriven[i] = scanner.nextFloat();
        }

        System.out.println("We drove a total of: " + calculateTotal(kmDriven));
        scanner.close();
    }

    private static float calculateTotal(float[] numberOfTrips) {
        float totalAmout = 0;
        for (float distance: numberOfTrips) {
            totalAmout += distance;
        }
        return totalAmout;
    }

}
