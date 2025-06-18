import java.util.*;

public class LetterTemplate{

    public static void main(String[] args){
        
        System.out.println("Letter template is : Dear <|name|>, Thanks a lot");

        System.out.println("Please enter your goodname ");

        Scanner sc = new Scanner(System.in);

        String name = sc.next();

        System.out.printf("Dear %s, Thanks a lot\n", name);

    }
}