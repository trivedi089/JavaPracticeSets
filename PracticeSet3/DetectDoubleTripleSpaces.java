import java.util.*;

public class DetectDoubleTripleSpaces{
    public static void main(String[] args){
        System.out.println("Enter the sentense : ");

        Scanner sc = new Scanner(System.in);

        String targetLine = sc.nextLine();

        if(targetLine.contains("  ")||targetLine.contains(".  ")){
            System.out.println("It contains double or triple space");
        }else{
            System.out.println("It does not carry any double or triple space");
        }
    }
}