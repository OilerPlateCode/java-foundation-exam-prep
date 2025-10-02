package chadJavaIntroCourse.section9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Neo", "Nyambose", "Hlamarisa", "Tinyiko", "Molebatse", "Amo");

        List<String> result = names.stream()
                .filter(s -> s.length() >= 6)
                .map(String::toUpperCase)
                .collect(Collectors.toList()); // transform back to list as it was now a stream

        result.forEach(System.out::println);
    }
}
