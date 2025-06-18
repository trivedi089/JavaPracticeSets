import java.util.*;

public class EncryptingGrade {
    public static void main(String[] args){
        
        System.out.println("Enter the value to encrypt : ");

        Scanner sc = new Scanner(System.in);
        int originalValue = sc.nextInt();
        int encryptedValue = originalValue+8;
        int decryptedValue = encryptedValue-8;
        System.out.printf("Encrypted value is %d ", encryptedValue);

        System.out.printf("Decrypted value is %d ", decryptedValue);
        
    }
}
