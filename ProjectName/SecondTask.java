package exercises;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);

        System.out.println("What is ur 1st number? ");
        Double number1 = object.nextDouble();

        System.out.println("What is ur 2nd number? ");
        Double number2 = object.nextDouble();

        System.out.println("What is ur 3rd number? ");
        Double number3 = object.nextDouble();

        if (number1 > number2 && number1 > number3) {
            System.out.println("number1 is greatest value");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("number2 is greatest value");
        } else if (number3 > number1 && number3 > number2) {
            System.out.println("number3 is greatest value");
        }
    }
}
// edit the task to do best performance 