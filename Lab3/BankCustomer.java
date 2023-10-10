package Lab3;


public class BankCustomer {
    private String name;
    private String address;
    private static int count = 0;
    private SavingsAccount account;
    private static SavingsAccount[] allAccounts = new SavingsAccount[2];
    
  
    //constructor
    public BankCustomer(String name, String address) {

        this.name = name;
        this.address = address;

        
    }
    //array to store objects

    //addaccount method, count keeps track of accounts made
    public SavingsAccount addAccount() {
        if(count < 3) {
            SavingsAccount account = new SavingsAccount();
            this.account = account;
            count++;
            allAccounts[0] = account;
        
        }
        else {
            System.out.println("Maximum Number of accounts reached");
        }
        return account;
    }
    
    
    

    

    
    //displaying customer info
    public String toString() {

        return "Name: " + name + "  " + " Address: " + address;
    }

    
    

    




    

}