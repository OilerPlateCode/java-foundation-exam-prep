package chadJavaIntroCourse.section9;

public class GreetingLamda {
    public static void main(String[] args) {
        GreetingImpl greetingImpl = new GreetingImpl();
        greetingImpl.greeting();
    }

}

 class GreetingImpl {
    public void greeting() {
        System.out.println("Eita");
    }
}
