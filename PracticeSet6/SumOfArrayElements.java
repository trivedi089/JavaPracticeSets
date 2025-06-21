import java.util.*;

public class SumOfArrayElements {
    
    public static void main(String[] args){

        float[] Numbers = new float[5];

        Scanner sc = new Scanner(System.in);

        float sumOfArray = 0;

        for(int i=0;i<5;i++){
            Numbers[i]=sc.nextFloat();
            sumOfArray+=Numbers[i];
        }

        System.out.printf("Sum of elements of array is %,.2f",sumOfArray);

    }   
}
