public class Student {

    String name;
    int age;
    int id;

    public void print(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }

    public static void main(String[] args) {
        
        Student student = new Student();
        student.name = "Vaibhav";
        student.age = 23;
        student.id = 101;

        student.print();
    }
}