package chadJavaIntroCourse.section9;

import java.util.function.Predicate;

public class GreetingLamda {
    public static void main(String[] args) {
        GreetingImpl greetingImpl = new GreetingImpl();
        greetingImpl.greeting();

        Greeting lambda = () -> System.out.println("Hello Lambda");
        lambda.greetings();

        Farewell farewell = (f) -> System.out.println(f);
        farewell.goodBye("cheerios");

        StringEndings exclaimationMark = (s) -> s + "!";
        System.out.println(exclaimationMark.perform("Completes the punctuation"));

        StringCompare compare = (s1, s2) -> {
            if (s1.length() > s2.length()) {
                return s1;
            }
            return s2;

        };

        System.out.println(compare.getLongest("OilerplateCode", "Mbuzulwane Gindindza"));

        Predicate<Integer> lessThan100 = i -> (i < 100);
        boolean result = lessThan100.test(55);
        System.out.println(result);
        System.out.println("=====================Predicate===============");
        Predicate<Integer> greaterThan100 = i -> i > 100;
        Predicate<Integer> lessThan150 = (i) -> i < 150;
        boolean otherResult = lessThan150.or(greaterThan100).test(105);
        System.out.println(otherResult);
    }
}

interface Farewell {
    void goodBye(String n);
}

interface Greeting {
    void greetings();
}

// Tells other Devs not to add more methods to this interface
@FunctionalInterface
interface StringEndings {
    String perform(String s);
}

@FunctionalInterface
interface StringCompare {
    String getLongest(String a, String b);
}

 class GreetingImpl {
    public void greeting() {
        System.out.println("Eita");
    }
}
