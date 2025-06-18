import java.util.*;

public class StringToLowercase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the string which needs to be converted to Lower case");

        String toLowercase = sc.next();

        System.out.printf("Lower case string will be %s", toLowercase.toLowerCase());
    }
}
