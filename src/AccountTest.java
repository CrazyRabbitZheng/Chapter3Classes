import java.util.Scanner;

/**
 * This class is a driver class
 * It uses the Account class
 */
public class AccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account myAccount = new Account();
        System.out.printf("Initial name is %s\n", myAccount.getName());

        System.out.println("Please enter name ");
        String theName = sc.nextLine();
        myAccount.setName(theName);
        System.out.printf("%nAccount name is %s\n", myAccount.getName());
    }
}