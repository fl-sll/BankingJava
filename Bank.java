package Week9;
import java.util.LinkedList;

public class Bank {
    private int numberOfCustomers;
    private String bankName;
    private LinkedList<Customer> customer = new LinkedList<Customer>();

    public Bank(String bName) {
        this.bankName = bName;
    }

    public void addCustomer(String f, String l) {
        Customer cust = new Customer(f, l);
        this.numberOfCustomers += 1; 
        this.customer.add(cust);
    }

    public int getNumOfCustomers() {
        return this.numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        this.customer.get(index);
    }

    public void getAllNames() {
        for (int i = 0; i < customer.size(); i++) {
            System.out.println(i + ". " + customer.get(i).getFirstName() + " " + customer.get(i).getLastName());
        }
    }

    public String getbName() {
        return this.bankName;
    }
}
