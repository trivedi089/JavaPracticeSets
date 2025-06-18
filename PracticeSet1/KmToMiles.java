import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args){
        System.out.println("Welcome to Kilometer to Mile converter...");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value in KM");
        float km = sc.nextFloat();

        System.out.printf("%f Kilometer to mile value is %f",km,0.67*km);
    }
}
