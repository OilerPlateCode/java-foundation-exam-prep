package chadJavaIntroCourse.section3;

public class BreakContinue {
    public static void main(String[] args) {
        for(int x = 0; x < 10; x++) {
            if(x == 5) {
                break;
            }
            System.out.println(x);
        }
        System.out.println("What we observed from the break os it stops when the condition is met");
        System.out.println("This is the continue");

        for(int x = 0; x < 10; x++) {

            if (x == 4) {
                continue;
            }
            System.out.println(x);
        }

        System.out.println("What we observed from the continue is that it skips the number it is at");
        System.out.println("Now we use greater and less than");

        for(int x = 0; x < 10; x++) {
            if (x < 3) {
                continue;
            }
            System.out.println(x);
        }
        System.out.println("BREAK");
        for(int x = 0; x < 10; x++) {
            if (x > 6) {
                break;
            }

            System.out.println(x);
        }
    }
}