package chadJavaIntroCourse.section9;

public class TryCatchLamda {
    public static void main(String[] args) {
Calculate divide = (a,b) -> {
    return a/b;
};

int solution = divide.perform(10, 0);
System.out.println(solution);
    }
}

@FunctionalInterface
interface Calculate {
    int perform(int a, int b);
}
