package PracticeSet4;
import java.util.*;

public class DayInWeek {
    public static void main(String[] args){

        System.out.println("Enter the number to check the day of week");

        Scanner sc = new Scanner(System.in);

        switch(sc.nextInt()){
            case 1 : 
                System.out.println("Its Monday");
                break;
            case 2 :
                System.out.println("Its Tuesday");
                break;
            case 3 : 
                System.out.println("Its wednesday");
                break;
            case 4 :
                System.out.println("Its Thursday");
                break;
            case 5 :
                System.out.println("Its Friday");
                break;
            case 6 :
                System.out.println("Its Saturday");
                break;
            case 7 :
                System.out.println("Its Sunday");
                break;
            default :
                break;
        }
    }
}
