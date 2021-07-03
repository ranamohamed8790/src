package chapter3;
import java.util.Scanner;
public class NestedIf {
    public static void main(String[] args) {
        int havingSalary = 3000;
        int havingYears = 2;
        Scanner object = new Scanner(System.in);
        System.out.println("what is your Salary?");
        Double salary = object.nextDouble();
        System.out.println("what is your Years of Experience?");
        Double years = object.nextDouble();
        if (salary >= havingSalary){
            if (years >= havingYears){
              System.out.println("Nice, you can take a loan");
            }
            else {
                System.out.println("Your Experience should be "
                        + havingYears + " Years."); }
                 }
        else {
            System.out.println("Your Salary  should be " +
                    havingSalary + "  $.");
             }

        }
    }