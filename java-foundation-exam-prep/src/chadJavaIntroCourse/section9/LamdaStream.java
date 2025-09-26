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

        countriesToVisit.forEach((country) -> {
            System.out.println("I want to visit " + country);
        });
    }
}
