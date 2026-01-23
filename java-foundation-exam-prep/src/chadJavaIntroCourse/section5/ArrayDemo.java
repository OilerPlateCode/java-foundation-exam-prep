package chadJavaIntroCourse.section5;

public class ArrayDemo {
    public static void main(String[] args) {
        String[] plannedTrips = {
                "Lesotho",
                "Botswana",
                "Namibia",
                "Mozambique"
        };
        System.out.println("I have " + plannedTrips.length + " planned trips");
        for (int i = 0; i < plannedTrips.length; i++) {
            System.out.println("I plan to visit " + plannedTrips[i]);
        }
    }
}
