import java.util.Scanner;

public class Circle {
    
    double radius;

    public static void area(double radius){
        System.out.println("Area of Cicle is : "+3.14*(Math.pow(radius, 2)));
    }

    public static void circumference(double radius){
        System.out.println("Circumference of Circle is : "+2*3.14*radius);
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius of circle : ");
        double radius = scanner.nextDouble();

        area(radius);
        circumference(radius);

        scanner.close();
    }
}
