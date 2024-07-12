import java.util.Scanner;

/**
 * This class is a driver class
 * It uses the Account class
 */
public class AccountTest {
    public static void main(String[] args) {
       Account account1 = new Account("Jane Mary", 50.00);
       Account account2 = new Account("Harry Potter", -7.53);

       System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
       System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

       Scanner input = new Scanner(System.in);

       System.out.print("\nEnter deposit amount for account 1: ");
       double depositAmount1 = input.nextDouble();
       System.out.printf("Adding %.2f to account1 balance: %n", depositAmount1);
       account1.deposit(depositAmount1);

       System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
       System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

       System.out.print("Enter deposit amount for account 2: ");
       double depositAmount2 = input.nextDouble();
       System.out.printf("Adding %.2f to account2 balance: %n", depositAmount2);
       account2.deposit(depositAmount2);

       System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
       System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

       System.out.println("How much would you like to withdraw?");
       double withdrawAmount1 = input.nextDouble();
       account1.withdraw(withdrawAmount1);

       System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());

    }
}