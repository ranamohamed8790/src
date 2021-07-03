package exercises;
/*
Write a Java program to get a number from
the user and print whether it is positive or negative
*/
import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        int y = 0;
        Scanner object = new Scanner(System.in);
        System.out.println("What is Your Number? ");
        int x = object.nextInt();

        if (x > y) {
            System.out.println("the entered number  is Positive ");
        }
        else {
            System.out.println(" the entered number is negative ");
        }
    }
}