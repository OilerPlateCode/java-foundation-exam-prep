package excercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLambdas {
    public static void main(String[] args) {
        List<String> suvs = new ArrayList<>();
        suvs.add("Fortuner");
        suvs.add("Everest");
        suvs.add("M-UX");
        suvs.add("Pajero Sport");

        suvs.forEach(System.out::println);
    }
}
