package chadJavaIntroCourse.section8;

public class ExceptionHandlingWithNumbers {


    public static void main(String[] args) {
        String numberString = "12";
        String notNumberString = "twelve";

        int numberInt = Integer.parseInt(numberString);

        System.out.println(numberInt);

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
}
