package chadJavaIntroCourse.section4;

public class MethodSummation {
    public static void main(String[] args) {
        int num = 5;
        long otherNum = 6;
        System.out.println("the summation of " + num + " equals " + summation(1));
        System.out.println("the summation of " + num + " equals " + summation(2L));
        System.out.println("the summation of " + num + " equals " + summation(3));
        System.out.println("the summation of " + num + " equals " + summation(4L));
        System.out.println("the summation of " + num + " equals " + summation(num));
        System.out.println("the summation of " + num + " equals " + summation(otherNum));
        System.out.println("the summation of " + num + " equals " + summation(7));
        System.out.println("the summation of " + num + " equals " + summation(8L));
    }
    public static int summation(int num) {
        int result = 0;
        for (int i = 1; i <=num; i++) {
            result += i;
        }
        return result;
    }

    public static Long summation(long num) {
        return (num * (num + 1)) / 2;
    }
}

