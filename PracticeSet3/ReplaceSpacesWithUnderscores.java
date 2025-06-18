import java.util.*;

public class ReplaceSpacesWithUnderscores{

    public static void main(String[] args){

        System.out.println("Pls Enter the String to remove spaces : ");

        Scanner sc = new Scanner(System.in);

        String inputValue = sc.nextLine();

        String outputValue = inputValue.replace(" ", "_");

        System.out.printf("After replacing spaces with underscore : %s ", outputValue);
    }
}