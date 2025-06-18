import java.util.*;

public class Greet {
    public static void main(String[] args){
        System.out.println("Please enter your name : ");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.printf("Hello %s, have a good day", name);
    }
}
