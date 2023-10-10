// Student Name 	: Hafza Abdullahi
// Student Id Number: C00286249
// Date 			: Sept 2023
// Purpose 			: Bank Acc
package Lab3;
public class BankDriver {

    public static void main(String args[]) {
    SavingsAccount account1 = new SavingsAccount();
    SavingsAccount account2 = new SavingsAccount();
    SavingsAccount account3 = new SavingsAccount();
    SavingsAccount account4 = new SavingsAccount();

    account1.setSavingsBalance(2000.00);
    account2.setSavingsBalance(3000.00);
    account3.setSavingsBalance(12200.00);
    account4.setSavingsBalance(7800.00);

    //making a bank customer
    BankCustomer mary = new BankCustomer("mary", "Carlow");
    
    //adding their accounts
    mary.addAccount(account1);
    mary.addAccount(account2);
    mary.addAccount(account3);

    //test if MAX NUMBER comes up
    mary.addAccount(account3);

    //account info
    System.out.println();
    System.out.println("Total Balance: " + mary.balance());
    System.out.println();
    mary.summary();

    
    
   

    

    
    
    
    
    

    }
}