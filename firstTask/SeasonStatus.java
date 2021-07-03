package firstTask;
import java.util.Scanner;
public class SeasonStatus {
    public static void main (String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Whats is and adjective");
        String adjective = obj.nextLine();
        System.out.println("tell us the season name");
        String season  = obj.nextLine();
        System.out.println("Whats is and wholeNumber");
        int wholeNumber = obj.nextInt();
        System.out.print("On a " + adjective + " "+ season + " day, " +
                "i drink a min "+ wholeNumber + " cups of coffee" );
    }
}
