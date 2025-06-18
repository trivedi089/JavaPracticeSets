import java.util.*;

public class ComparisonWithGivenNumber {
    public static void main(String[] args){

        System.out.println("Enter the number you want to compare with 100");

        Scanner sc = new Scanner(System.in);

        int valueToCompare = sc.nextInt();

        if(valueToCompare>100){
            System.out.println("Your number is greater than 100");
        }else if(valueToCompare<100){
            System.out.println("Your number is less than 100");
        }else{
            System.out.println("Number is equal to 100");
        }
    }
}
