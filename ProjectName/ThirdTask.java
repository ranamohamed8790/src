package exercises;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        int x = 0;
        float y = 1;
        float z = 1000000;
        Scanner object = new Scanner(System.in);
        System.out.println("enter ur value ");
        float value = object.nextFloat();

        if (value == x) {
            System.out.println("Number = Zero.");
        } else if (value > z) {
            System.out.println("large.");
        } else if (value < y) {
            System.out.println("-ve and  small.");
        } else {
            System.out.println("+ve and  small.");

        }


    }
}
