import java.util.Scanner;

public class Calculator {

    public static void input(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number 1 : ");
        int a = scanner.nextInt();
        System.out.println("Enter number 2");
        int b = scanner.nextInt();

        System.out.println(a+" + "+b+" = "+add(a, b));

        scanner.close();
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        
        input();
    }
}
