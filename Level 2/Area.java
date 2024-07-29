public class Area {
    
    public static double areaRectangle(Rectangle rectangle){
        return rectangle.len * rectangle.breadth;
    }

    public static double areaTriangle(Triangle triangle){
        return (triangle.base * triangle.heigth)/2;
    }
    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle();
        rectangle.len = 20;
        rectangle.breadth = 15;
        double rectangleArea = areaRectangle(rectangle);

        Triangle triangle = new Triangle();
        triangle.base = 10;
        triangle.heigth = 8;
        double triangleAngle = areaTriangle(triangle);

        System.out.println("Area of Rectangle : "+rectangleArea+" sq.units");
        System.out.println("Area of Triangle : "+triangleAngle+" sq.units");

    }
}

class Triangle{

    int base;
    int heigth;
}

class Rectangle{

    int len;
    int breadth;
}
