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
            throw new RuntimeException(e);
        }
    }
}
