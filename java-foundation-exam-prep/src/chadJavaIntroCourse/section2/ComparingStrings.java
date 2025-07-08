package chadJavaIntroCourse.section2;

public class ComparingStrings {
    public static void main(String[] args) {
        // there are 2 ways of comparing strings
        // use == (compares the memeory address
        String s1 = "Hello";
        String s2 = "Hello";

        System.out.println("s1 == s2 is " +  s1 == s2); // false - does not print the string it does the maths ("s1 == s2" + 1 (s1 == s2Hello == s2)
        System.out.println("s1 == s2 is " +  s1);
        System.out.println("s1 == s2 is " +  (s1 == s2)); //s1 == s2 is  false
        // .equals to compare the contents
    }
}
