package chadJavaIntroCourse.section9;

public class GreetingLamda {
    public static void main(String[] args) {
        GreetingImpl greetingImpl = new GreetingImpl();
        greetingImpl.greeting();

        Greeting lambda = () -> System.out.println("Hello Lambda");
        lambda.greetings();

        Farewell farewell = (f) -> System.out.println(f);
        farewell.goodBye("cheerios");
    }

}

interface Farewell {
    void goodBye(String n);
}

interface Greeting {
    void greetings();
}

 class GreetingImpl {
    public void greeting() {
        System.out.println("Eita");
    }
}
