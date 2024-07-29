public class Furniture {
    
    String type;
    String material;
    double price;

    public double discount(){
        double discount = 0;
        if (material.equalsIgnoreCase("wood")) {
           return discount = 0.2 * price;
        }
        else
        {
            return discount = 0.1 * price;
        }
    }

    public void print(){
        System.out.println("Furniture type : "+type);
        System.out.println("Furniture material : "+material);
        System.out.println("Furniture Price : "+(price - discount()));
    }

    public static void main(String[] args) {
        
        Furniture furniture = new Furniture();
        furniture.type = "Sofa";
        furniture.material = "wood";
        furniture.price = 12000;

        furniture.print();
    }
}
