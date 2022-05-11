package Week9;
import java.util.Scanner;
import java.parseInt;

public class Driver {
    public static void main(String[] args) {
        Bank myBank = new Bank("Maju Bank");
        Scanner sc = new Scanner(System.in);

        myBank.addCustomer(Edward, Alvin);
        myBank.addCustomer(Hellow, World);

        boolean run = true;
        while (run) {
            System.out.println("Main Menu:");
            System.out.println("1. Add Customer");
            System.out.println("2. Access user account");
            System.out.println("3. Exit");

            switch (sc.nextLine()) {
                case "1":
                    System.out.println("Enter firstname:");
                    String fname = sc.nextLine();
                    System.out.println("Enter lastname:");
                    String lname = sc.nextLine();
                    myBank.addCustomer(fname, lname);
                    break;

                case "2":
                    System.out.println("Choose a customer");
                    myBank.getAllNames();
                    System.out.println("Please enter the number of the customer you want to access");
                    int cNumber = sc.nextInt();
                    Customer customer = myBank.getCustomer(cNumber);
                    System.out.println(customer.getFirstName() + " " + customer.getLastName());
                    System.out.println("Balance: " + customer.getAccount().getBalance());
                    accMenu(customer);
                    break;

                case "3":
                    run = false;
                    break;

                default:
                    System.out.println("Number unrecognized");
                    break;
            }
        }
    }

    public static void accMenu(Customer customer) {
        Customer thisCustomer = customer;
        boolean run = true;
        Scanner sc = new Scanner(System.in);

        while (run) {
            System.out.println("Account Menu");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposti");
            System.out.println("4. Exit");

            switch (sc.nextLine()) {
                case "1" :
                    System.out.println("The current balance is: " + thisCustomer.getAccount().getBalance());
                    break;
                
                case "2" :
                    System.out.println("Enter withdraw amount");
                    double wAmount = sc.nextDouble();
                    thisCustomer.getAccount().withdraw(wAmount);
                    break;
                
                case "3" :
                    System.out.println("Enter deposit amount");
                    double dAmount = sc.nextDouble();
                    thisCustomer.getAccount().deposit(dAmount);
                    break;
                
                case "4" :
                    run = false;
                    break;

                default :
                    System.out.println("Number unrecognized");
            }
        }
    }
}
