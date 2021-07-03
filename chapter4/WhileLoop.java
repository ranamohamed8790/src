package chapter4;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int hoursPerRate = 15;
        int totalWorkingHrs = 40;

        System.out.println("What is Your Total Working Hours?");
        Scanner object = new Scanner(System.in);
        Double HrsWorked = object.nextDouble();

        /**while (HrsWorked > totalWorkingHrs) {
            System.out.println("Sorry The Total Working Hours " +
                    "should be from 1 o 40, Please Try gain");
            HrsWorked = object.nextDouble();
        }*/
        while(HrsWorked > totalWorkingHrs || HrsWorked < 1){
            System.out.println("Invalid entry. Yours hours must be between 1 and 40. Try again.");
            HrsWorked = object.nextDouble();
        }
        Double salary = hoursPerRate * HrsWorked;
        System.out.println("your salary of Total Worked hrs = " + salary + " $");
    }
}