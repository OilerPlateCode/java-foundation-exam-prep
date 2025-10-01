package chadJavaIntroCourse.section9;

import java.util.function.Function;

public class PrintVowels {
    public static void main(String[] args) {
        Function<String, Integer> countVowelsFunction = Vowels::countVowels;
        System.out.println(countVowelsFunction.apply("umbrella"));
    }
}

 class Vowels {
    public static int countVowels(String s) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : s.toCharArray()) {
            if(vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}
