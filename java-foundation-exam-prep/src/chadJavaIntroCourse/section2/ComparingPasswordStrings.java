package chadJavaIntroCourse.section2;

import java.util.Scanner;

public class ComparingPasswordStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        String correctPassword = "MbuzuMbuzu";
        String otherCorrectPassword = new String("MbuzuMbuzu");

        System.out.println("password.compareTo(correctPassword) " + password.equals(correctPassword));
        System.out.println("password.compareTo(otherCorrectPassword) " + password.equals(otherCorrectPassword));
        System.out.println("password == correctPassword " + (password == correctPassword));
        System.out.println("password == otherCorrectPassword " + (password == otherCorrectPassword));

        String message = password.equals(otherCorrectPassword) ? "Correct Password" : "Wrong Password";
        String otherMessage = password == correctPassword ? "they match memory address" : "they don't match memory address";
        System.out.println(message);
        System.out.println(otherMessage);


        // TODO: learn compareTo():
    scanner.close();
    }
}
