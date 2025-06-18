import java.util.*;

public class CalculatingMarksGPA {

    public static void main(String[] args){

        System.out.println("Here you can find your GPA marks...");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks in Subject 1 : ");
        float marks1 = sc.nextFloat();

        System.out.println("Enter marks in Subject 2 : ");
        float marks2 = sc.nextFloat();

        System.out.println("Enter marks in Subject 3 : ");
        float marks3 = sc.nextFloat();

        Float totalMarks = marks1+marks2+marks3;

        Float gpaMarks = totalMarks/30;

        System.out.printf("Your GPA marks is %f", gpaMarks);

    }
    
}
