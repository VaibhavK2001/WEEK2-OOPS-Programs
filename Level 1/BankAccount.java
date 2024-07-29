import java.util.Scanner;

public class BankAccount {
    
    double balance;
    long accountNumber;

    public double deposite(double balance, double amount){
        return balance + amount;
    }

    public double withdraw(double amount, double balance){
        if (balance > amount) {
            System.out.println("Amount withdraw succesfully");
            return balance - amount;
        }
        else{
            System.out.println("Insuficient Balance");
            return balance;
        }
    }
        public static void main(String[] args) {

        BankAccount account = new BankAccount();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Account Number : ");
        account.accountNumber = scanner.nextLong(); 
        System.out.println("Enter Amount to deposite : ");
        double amount = scanner.nextDouble();
        account.balance = account.deposite(account.balance, amount);
        System.out.println("Available Balance : $"+account.balance);

        System.out.println("\nEnter amount to withdraw : ");
        double withdraw = scanner.nextDouble();

        account.balance = account.withdraw(withdraw, account.balance);
        System.out.println("Available Balance : $"+account.balance);
        
        scanner.close();
    }
}
