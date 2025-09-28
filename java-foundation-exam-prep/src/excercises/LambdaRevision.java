package excercises;

public class LambdaRevision {
    public static void main(String[] args) {
        PassportStamp passportStamp = (d) -> System.out.println(d);
        passportStamp.trip("Heading to Namibia Next");
    }
}

interface PassportStamp {
    void trip(String destination);
}
