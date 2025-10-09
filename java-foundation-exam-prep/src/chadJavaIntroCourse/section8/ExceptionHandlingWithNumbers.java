package chadJavaIntroCourse.section8;

public class ExceptionHandlingWithNumbers {


    public static void main(String[] args) {
        String numberString = "12";
        String notNumberString = "twelve";

        int numberInt = Integer.parseInt(numberString);

        System.out.println(numberInt);
        parseString(null);
        parseString("one");
        parseString("2");
        try {
            int notNumberInt = Integer.parseInt(notNumberString);
            System.out.println(notNumberInt);

        } catch (IllegalArgumentException e) {
            System.out.println("Should pass in a String that is inty");
            System.out.println(e);
            System.out.println(e.getMessage());
//            throw new RuntimeException(e);

        }
    }

    public static void parseString(String numberString) {
        try {
            System.out.println(numberString.length());
            int numberInt = Integer.parseInt(numberString);
            System.out.println(numberInt);
        }
        catch (NumberFormatException | NullPointerException e) {
            System.out.println("Should pass in a String that is an int");
        }

        catch (Exception e) {
            System.out.println("Eyyyyyy ==== Something went wrong"); // TODO add scenarios that hit this
        }
    }
}
