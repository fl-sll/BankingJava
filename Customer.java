package Week9;

public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String f, String l) {
        this.firstName = f;
        this.lastName = l;
        this.account = new Account(0.0);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return this.account;
    }
}
