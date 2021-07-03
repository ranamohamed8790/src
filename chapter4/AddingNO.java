package chapter4;

import java.util.Scanner;

public class AddingNO {
    public static void main(String args[]) {
        int enterednumber = 4;
        int total = 0;
        Scanner obj = new Scanner(System.in);
        for (int i = 0; i < enterednumber; i++) {
            System.out.println("What is ur Number");
            int number = obj.nextInt();
            total = total + number;
            System.out.println(total);


        }

    }
}
