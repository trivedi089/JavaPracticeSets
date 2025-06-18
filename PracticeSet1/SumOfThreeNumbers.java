import java.util.*;

class SumOfThreeNumbers{

    public static void main(String[] args){

        System.out.println("Program to add three numbers...");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number");

        int a = sc.nextInt();

        System.out.println("Enter the second Number");
        int b=sc.nextInt();

        System.out.println("Enter the third Number");
        int c=sc.nextInt();

        int totalSum = a+b+c;

        System.out.printf("Total Sum is %d ",totalSum);
        

    }
}