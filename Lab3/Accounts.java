// Student Name 	: Hafza Abdullahi
// Student Id Number: C00286249
// Date 			: Sept 20223
// Purpose 			: Savings account
package Lab3;

public class Accounts {

    public static void main(String args[]) {
    SavingsAccount saver1 = new SavingsAccount();
    SavingsAccount saver2 = new SavingsAccount();

    saver1.setSavingsBalance(2000.00);
    saver2.setSavingsBalance(3000.00);    

    //calculations
    System.out.println("This month for saver " + saver1.getNumber() + " : " + saver1.calculateMonthlyInterest());
    System.out.println("This month for saver " + saver2.getNumber() + " : " + saver2.calculateMonthlyInterest());
    
    //next month calcs
    SavingsAccount.modifyInterest(0.05);
    
    System.out.println("Next month for saver " + saver1.getNumber() + " : " + saver1.calculateMonthlyInterest());
    System.out.println("Next month for saver " + saver2.getNumber() + " : " + saver2.calculateMonthlyInterest());
    
    
    
    

    }
}