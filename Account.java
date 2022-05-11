package Week9;
import java.util.LinkedList;

public class Account {
    private double balance;
    private LinkedList<String> history = new LinkedList<String>();

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public boolean deposit(double amt) {
        if (amt > 0) {
            this.balance += amt;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean withdraw(double amt) {
        if (amt <= this.balance) {
            this.balance -= amt;
            return true;
        }
        else {
            return false;
        }
    }

    public void showHistory() {
        System.out.println(history.toArray());
    }
}
