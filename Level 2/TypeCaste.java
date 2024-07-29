import java.util.Scanner;

public class TypeCaste {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value of byte1 : ");
        byte b1 = scanner.nextByte();
        System.out.println("Enter value of byte2 : ");
        byte b2 = scanner.nextByte();

        int n1 = (int)b1;
        int n2 = (int)b2;

        System.out.println("Addtion of byte1 and byte2 after conveting in int :");
        System.out.println(n1+n2);

        scanner.close();
    }
}
