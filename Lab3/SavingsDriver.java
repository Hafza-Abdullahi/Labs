// Student Name 	: Hafza Abdullahi
// Student Id Number: C00286249
// Date 			: Sept 2023
// Purpose 			: Bank Acc
package Lab3;
public class SavingsDriver {

    public static void main(String args[]) {
    SavingsAccount account1 = new SavingsAccount();
    SavingsAccount account2 = new SavingsAccount();
    SavingsAccount account3 = new SavingsAccount();
    SavingsAccount account4 = new SavingsAccount();

    account1.setSavingsBalance(2000.00);
    account2.setSavingsBalance(3000.00);
    
    //calculations
    System.out.println("This month for Account " + account1.getNumber() + " : " + account1.calculateMonthlyInterest());
    System.out.println("This month for Account " + account2.getNumber() + " : " + account2.calculateMonthlyInterest());
    
    //next month calcs
    SavingsAccount.modifyInterest(0.05);
    
    System.out.println("Next month for Account " + account1.getNumber() + " : " + account1.calculateMonthlyInterest());
    System.out.println("Next month for Account " + account2.getNumber() + " : " + account2.calculateMonthlyInterest());
    }
}