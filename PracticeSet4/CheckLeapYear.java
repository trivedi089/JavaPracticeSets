import java.nio.channels.Pipe.SourceChannel;
import java.util.*;

public class CheckLeapYear {
    public static void main(String[] args){
        System.out.println("Please enter the year you want to check : ");

        Scanner sc = new Scanner(System.in);
        int yearToCheck = sc.nextInt();

        if(yearToCheck%4==0){
            if(yearToCheck%100!=0){
                System.out.println("Its a leap year");
            }else if(yearToCheck%400==0){
                System.out.println("Its a leap year");
            }
            else
                System.out.println("Its not a leap year");
        }else
            System.out.println("Its not a leap year");
    }
}
