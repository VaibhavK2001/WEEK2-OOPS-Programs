public class Phone {
    
    String make;
    String model;
    int ram;
    
    public Phone(String make, String model, int ram){
        this.make = make;
        this.model = model;
        this.ram = ram;
    }

    public static double calculatePrice(Phone phone){
        double basePrice = 0;
        switch (phone.make.toLowerCase()) {
            case "moto":
                basePrice += 600;
                break;
            case "apple":
                basePrice += 700;

            case "samsung":
                basePrice += 700;
            
            case "vivo":
                basePrice += 600;

            case "mi":
                basePrice += 500;
            
            default:
                basePrice += 500;
                break;
        }

        if (phone.model.equalsIgnoreCase("edge")) {
            basePrice += 200;
        }else if (phone.model.equalsIgnoreCase("iphone")) {
            basePrice += 300;
        }else if (phone.model.equalsIgnoreCase("galaxy")) {
            basePrice += 250;
        }else if (phone.model.equalsIgnoreCase("Y200")) {
            basePrice +=200;
        }else if (phone.model.equalsIgnoreCase("note")) {
            basePrice+= 150;
        }else{
            basePrice += 100;
        }

        basePrice += phone.ram * 0.2;

        return basePrice;
    }

    public void print(){
        System.out.println("Phone Make : "+make);
        System.out.println("Phone Model : "+model);
        System.out.println("Phone Ram : "+ram+"GB");
    }


    public static void main(String[] args) {
        
        Phone phone = new Phone("moto", "Onefusion", 6);
        phone.print();
        System.out.println("\nPhone Price : "+calculatePrice(phone));

    }
}

