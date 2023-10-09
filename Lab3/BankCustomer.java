package Lab3;

import java.lang.reflect.Array;

public class BankCustomer {
    private String name;
    private String address;
    private static int count = 0;
    public SavingsAccount accName;

  
    //constructor
    public BankCustomer(String name, String address) {

        this.name = name;
        this.address = address;
        
    }
    //array to store objects
    static SavingsAccount[] allAccounts = new SavingsAccount[2];

    public static SavingsAccount addAccount() {
        SavingsAccount accName = new SavingsAccount();
        return accName;
    }

    

    

    public String toString() {

        return "Name: " + name + "  " + "Address: " + address;
    }

    




    

}