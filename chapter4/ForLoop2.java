package chapter4;

public class ForLoop2 {
    public static void main(String args[]) {
        int factorial=1;
        for (int i = 1; i <= 5; i++) {
            factorial = factorial * i;
        }
        System.out.println( "factorial of 5 = " + factorial);

    }
}
