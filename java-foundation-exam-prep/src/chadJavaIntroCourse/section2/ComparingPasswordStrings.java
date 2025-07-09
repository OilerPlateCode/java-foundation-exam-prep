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

        // TODO: learn compareTo():

    }
}
