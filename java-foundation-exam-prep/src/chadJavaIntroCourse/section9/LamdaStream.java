package chadJavaIntroCourse.section9;

import java.util.ArrayList;
import java.util.List;

public class LamdaStream {
    public static void main(String[] args) {
        List<String> countriesToVisit = new ArrayList<>();
        countriesToVisit.add("Mozambique");
        countriesToVisit.add("Lesotho");
        countriesToVisit.add("Zimbabwe");
        countriesToVisit.add("Namibia");

        for (String country : countriesToVisit) {
            System.out.println("I am yet to visit " + country);
        }

        System.out.println(" classic ==== for loop ==");
        for (int i = 0 ; i < countriesToVisit.size(); i++) {
            System.out.println("I should plan a visit to " + countriesToVisit.get(i));
        }
        System.out.println(" Lambda ");
        countriesToVisit.forEach((country) -> {
            System.out.println("I want to visit " + country);
        });
    }
}
