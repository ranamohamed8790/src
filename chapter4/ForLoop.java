package chapter4;
import java.util.Scanner;
public class ForLoop {
    public static void main(String args[]) {
        String star = "*";
        for (int i = 0; i <= 5; i++) {
            System.out.println(star);
            star = star + "*";

        }
    }
}
