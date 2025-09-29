package excercises;

public class LambdaRevision {
    public static void main(String[] args) {
        PassportStamp passportStamp = (d) -> System.out.println(d);
        passportStamp.trip("Heading to Namibia Next");

        PreviousTrip prviousTrip = System.out::println;
        prviousTrip.trip("Went to Botswana Last");
    }
}

interface PassportStamp {
    void trip(String destination);
}

interface PreviousTrip {
    void trip(String destination);
}
