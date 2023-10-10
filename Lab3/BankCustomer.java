package Lab3;
public class BankCustomer {
    private String name;
    private String address;
    private static int noOfAccs = 0;
    private SavingsAccount account;
    private static SavingsAccount[] allAccounts = new SavingsAccount[3];
    private BankCustomer bCustomer;
    private SavingsAccount tempAccount;
    private double balance = 0.00;
    private double totalBalance = 0.00;
    
    //constructor
    public BankCustomer(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    //addaccount method, count keeps track of accounts made
    //void bcs its not returning anything 
    public void addAccount(SavingsAccount account) {    //savings account is created in the parameter
        if(noOfAccs < 3) {
            this.account = account;
            allAccounts[noOfAccs] = account;
            noOfAccs++;
        }
        else {
            System.out.println("MAXIMUM NUMBER OF ACCOUNTS REACHED");
        }
    }
    
    //method for balance
    public double balance() {
        for(int i = 0; i < noOfAccs; i++) {
            tempAccount = allAccounts[i];                          //storing actual account since it holds different types of data
            balance = tempAccount.getSavingsBalance();      //getting balance
            totalBalance += balance;                        //adding to total balance
        }
        return totalBalance;
    }

    //summary method
    public void summary() {
        System.out.println("\u0009\u0009ALL ACCOUNTS");
        for(int i = 0; i < noOfAccs; i++) {
            System.out.println("\n" + allAccounts[i]);
        }
    }

    //displaying customer info
    public String toString() {
        return "\nCustomer Name: " + name + "  " + "Address: " + address + "\n";
    }
}