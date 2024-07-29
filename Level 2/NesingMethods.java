import java.util.Scanner;

public class NesingMethods {
    
    public static void volume(double length, double breadth, double height){
        
        System.out.println("\nVolume of cuboid : "+(length*breadth*height)+"cube.unit");
        
        //calling Area method
        area(length, breadth, height);
    }

    public static void area(double length, double breadth, double heigth){
        double area = 2*((length*breadth)+(breadth*heigth)+(heigth*length));
        System.out.println("Area of cuboid : "+area+"sq.unit");

        //calling Perimeter method
        perimeter(length, breadth, heigth);

    }

    public static void perimeter(double length, double breadth, double height){

        System.out.println("Perimeter of Cuboid : "+(4*(length*breadth*height)));
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Length : ");
        double length = scanner.nextDouble();
        System.out.println("Enter Breadth : ");
        double breadth = scanner.nextDouble();
        System.out.println("Enter Height : ");
        double heigth = scanner.nextDouble();

        volume(length, breadth, heigth);
        scanner.close();
    }
}
