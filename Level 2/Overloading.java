public class Overloading {

    public void area(int length, int breadth){
        System.out.println("Area of Rectangle : "+(length*breadth));
    }

    public void area(int length){
        System.out.println(("Area of Sqaure : "+(2*length)));
    }

    public void area(double rad){
        double area = 3.13*rad*rad;
        System.out.println("Area of Circle : "+area);
    }
    public static void main(String[] args) {
        
        Overloading obj = new Overloading();
        obj.area(23,3);
    }
}
