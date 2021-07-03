package chapter3;
import java.util.Scanner;
public class MoreCases {
    public static void main(String[] args) {
        int havingSalary = 3000;
        int havingYears = 2;
        System.out.println("what is your Salary?");
        Scanner object = new Scanner(System.in);
        Double salary = object.nextDouble();
        System.out.println("what is your Years of Experience?");
        Double years = object.nextDouble();

        if(salary >= havingSalary && years >= havingYears ){
            System.out.println("Nice, you will take the loan successfully");
        }
        /**else if (salary >= havingSalary && years < havingYears){
            System.out.println("Sorry, your Exp Years should be "
                    + havingYears + " Years.");
        }
        else if (salary < havingSalary && years >= havingYears){
            System.out.println("Sorry, your Salary should be "
                    + havingSalary + " $.");
        }**/
        else {
            System.out.println("Sorry, your Salary should be "
                    + havingSalary + " $." + "and Your Exp years should be "
            + havingYears + " Years.");
        }
    }
}