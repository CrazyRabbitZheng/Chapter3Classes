/**
 * This class to practice bank account
 */
public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        if (balance > 0) {
            this.balance = balance;
        }
    }
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void withdraw(double amount) {
        if ((amount > 0) & (amount <= this.balance)) {
            this.balance -= amount;
        }
    }
}
