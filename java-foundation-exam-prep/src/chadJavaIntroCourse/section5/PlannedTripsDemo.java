package chadJavaIntroCourse.section5;

import java.util.Scanner;

public class PlannedTripsDemo {
    public static void main(String[] args) {
        int numberOfTrips;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of trips: ");
        numberOfTrips = sc.nextInt();
        String[] tripTypes = new String[numberOfTrips];
        String tripType;

        for (int i = 0; i < numberOfTrips; i++) {
            System.out.print("Enter trip type: ");
            tripType = sc.next();
            tripTypes[i] = tripType;
        }

        for (String trip : tripTypes) {
            System.out.println("I want to go " + trip);
        }

        sc.close();
    }
}
