import java.util.Scanner;

/**
 * This class is a driver class
 * It uses the Account class
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Mary");
        Account account2 = new Account("Harry Potter");

        System.out.printf("account1 name: %s\n", account1.getName());
        System.out.printf("account2 name: %s\n", account2.getName());
    }
}