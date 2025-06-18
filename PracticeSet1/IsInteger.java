import java.util.*;

public class IsInteger {
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Pls provide the input : ");

        if(sc.hasNextInt()){
            System.out.printf("Given value %d is an integer", sc.nextInt());
        }else{
            System.out.println("Given value is not an integer ");
        }

    }
}
