package chadJavaIntroCourse.section2;

public class ComparingStrings {
    public static void main(String[] args) {
        // there are 2 ways of comparing strings
        // use == (compares the memory address
        String s1 = "Hello";
        String s2 = "Hello";
        boolean result = (s1 == s2);


        System.out.println("s1 == s2 is " +  result); //s1 == s2 is true

        String s3 = new String("Hello");
        String s4 = new String("hello");
        boolean result3 = (s1 == s3);
        System.out.println("s1 == s3 is " +  result3); // false different memory address

        // .equals to compare the contents
        System.out.println("s1.equals(s2) " + s1.equals(s2));
        System.out.println("s1.equals(s3) " + s1.equals(s3));
        System.out.println("s2.equals(s3) " + s2.equals(s3));
        System.out.println("s3.equals(s1) " + s3.equals(s1));
        System.out.println("s4.equals(s3) " + s4.equals(s3));
        System.out.println("s4.equals(s1)" + s4.equals(s1));
        System.out.println("s2.equals(s4) " + s2.equals(s4));
        System.out.println("s4.equals(s2) with ignoredCase " + s4.equalsIgnoreCase(s2));
        System.out.println("s3.equalsIgnoreCase(s4) " + s3.equalsIgnoreCase(s4));
    }
}

// When java creates String using String literal (without the new keywork)
 // it leverages a technique known as String interning
// is the string literal already exists in the String pool, it will reuse the String reference:
// that is why s1 == s2 is true
//        System.out.println("s1 == s2 is " +  s1 == s2); // false - does not print the string it does the maths ("s1 == s2" + 1 (s1 == s2Hello == s2)
//        System.out.println("s1 == s2 is " +  s1);
