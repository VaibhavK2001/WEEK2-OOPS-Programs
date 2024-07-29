public class Computer {
    
    String processor;
    int ram;
    int storage;

    public double calculatePrice(String processor, int ram, int storage){

        double basePrice = 0;

        switch (processor.toLowerCase()) {
            case "intel":
                basePrice += 55000;    
                break;
            
            case "ryzen":
                basePrice += 50000;
                break;

            default:
                basePrice += 45000;
                break;
        }

        if (ram == 4) {
            basePrice += 5000;
        }else if (ram == 8) {
            basePrice += 7000;
        }else if (ram == 16) {
            basePrice += 10000;
        }


        if (storage == 256) {
            basePrice += 1000;
        }else if (storage == 512) {
            basePrice += 2000;
        }else if (storage == 1) {
            basePrice += 4000;
        }

        return basePrice;
    } 

    public void print(){
        System.out.println("Computer Processor : "+processor);
        System.out.println("Computer Ram : "+ram);
        System.out.println("Computer Storage : "+storage);
    }

    public static void main(String[] args) {
        
        Computer computer = new Computer();
        computer.processor = "ryzen";
        computer.ram = 8;
        computer.storage = 512;

        computer.print();
        double price = computer.calculatePrice(computer.processor, computer.ram, computer.storage);
        System.out.println("Computer Price : "+price);
    }
}
