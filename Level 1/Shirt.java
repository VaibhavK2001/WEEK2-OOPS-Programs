public class Shirt {
    
    String size;
    String color;
    double price;

    public double calculateDiscount(char size, double price){
        
        double discount=0;
        if (size == 's' || size == 'S') {
            discount = (15*price)/100;
        }else if (size == 'm' || size == 'M') {
            discount = (20*price)/100;
        }else if ((size == 'l' || size == 'L')) {
            discount = (25*price)/100;
        }else
        {
            discount = (10*price)/100;
        }

        return discount;
    }

    public void print(double discount){
        System.out.println("Shirt size : "+size);
        System.out.println("Shirt color : "+color);
        System.out.println("Shirt Price : "+price);
        System.out.println("Shirt Price(Discounted) : "+(price-discount));
    }

    public static void main(String[] args) {
        
        Shirt shirt = new Shirt();
        shirt.color = "Black";
        shirt.size = "L";
        shirt.price = 500;  

        char s = shirt.size.charAt(0);
        double discount = shirt.calculateDiscount(s, shirt.price);

        shirt.print(discount);
    }
}
