package chadJavaIntroCourse.section4;

public class MethodFactorials {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("The factorial for " + num + " is " + factorial(5));

    }
    public static int factorial(int num) {
        if (num == 0) return 1;
        else {
            return num * factorial(num - 1);
        }
    }
}
