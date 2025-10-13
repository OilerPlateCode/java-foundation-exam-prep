package chadJavaIntroCourse.section4;

public class MethodSummation {
    public static void main(String[] args) {
        System.out.println(summation(5));
    }
    public static int summation(int num) {
        int result = 0;
        for (int i = 1; i <=num; i++) {
            result += i;
        }
        return result;
    }
}

