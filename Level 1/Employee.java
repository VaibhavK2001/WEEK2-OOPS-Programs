public class Employee {
    
    String name;
    double salary;
    int id;

    public double empSal(double sal){
        return sal * 12;
    }

    public void print(){
        System.out.println("Employee Name : "+name);
        System.out.println("Salary : $"+salary);
    }

    public static void main(String[] args) {
        
        Employee employee = new Employee();

        
        employee.name = "Vaibhav Kumbhar";
        employee.salary = 1200;
        
        employee.print();
    // System.out.println("Annual Salary : $"+employee.empSal(employee.salary));
    
    }
}
