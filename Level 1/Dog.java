public class Dog {
    
    String breed;
    int age;
    double weight;

    public static int humanYears(int age){
        int humanYears = 0;

        if(age<=2){
            return humanYears = age*11;
        }
        else{
            return humanYears = 22 + (age-2)*5;  //After 2 year dog's each year is 5 human years
        }
    }

    public void print(){
        System.out.println("Dog breed : "+breed);
        System.out.println("Dog age : "+age);
        System.out.println("Dog weight : "+weight);
    }

    public static void main(String[] args) {
        
        Dog dog = new Dog();
        dog.breed = "German Shefard";
        dog.age = 5;
        dog.weight = 16;

        System.out.println("Dog age in human years : "+humanYears(dog.age));
        System.out.println();
        dog.print();
    }
}
