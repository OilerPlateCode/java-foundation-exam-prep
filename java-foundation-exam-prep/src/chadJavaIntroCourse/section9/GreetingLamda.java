package chadJavaIntroCourse.section9;

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
            } else {
                return s2;
            }
        };

        System.out.println(compare.getLongest("OilerplateCode", "Mbuzulwane Gindindza"));
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
