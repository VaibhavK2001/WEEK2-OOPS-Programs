public class TV {
    
    String brand;
    double size;
    double price;

   
    public static double calculatePrice(double size, double price){
        double discount =0;
        if (size < 24) {
            discount = (5*price)/100;       // 5% of Discount 
            return discount;
        }else{
            discount = (10*price)/100;
            return discount;                // 10% of Discount
        }
    }

    public void printTV(){
        System.out.println("TV Brand : "+brand);
        System.out.println("TV size : "+size);
        System.out.println("TV Price : "+price);
    }
    
    public static void main(String[] args) {
        TV tv = new TV();
        tv.brand = "OnePlus";
        tv.price = 45000;
        tv.size = 20;
        
       tv.printTV();
        System.out.println("TV Price(Discounted) : "+(tv.price-calculatePrice(tv.size,tv.price)));
    }
}
