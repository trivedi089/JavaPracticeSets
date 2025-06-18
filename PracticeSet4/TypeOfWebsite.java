import java.util.*;

public class TypeOfWebsite{
    public static void main(String[] args){
        System.out.println("Pleas enter the website : ");

        Scanner sc = new Scanner(System.in);

        String email = sc.next();

        if(email.endsWith(".com")){
            System.out.println("Commercial Website");
        }else if(email.endsWith(".org")){
            System.out.println("Organisational Website");
        }else if(email.endsWith(".in")){
            System.out.println("Indian Website");
        }else
            System.out.println("it is unclassified");
       
    }
}