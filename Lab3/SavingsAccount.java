package Lab3;

public class SavingsAccount {
    private static int number = 0;                      //static so it doesnt reset, it belongs to the class
    private int unique;
    private static double annualInterestRate = 0.04;
    private double savingsBalance;

    
    //constructor
    public SavingsAccount() {
        number++;
        unique = number;
        
    }

    //setters
    public void setSavingsBalance(Double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
    
    //getters
    public int getNumber() {
        return unique;

    }

    public double getInterestRate() {
        return annualInterestRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public double calculateMonthlyInterest() {
        return savingsBalance * annualInterestRate / 12;
    }

    //interest should be added to balance

    //modify interest, static method (belongs to class instead of an instance of class) can be accessed using classname.method()
    public static double modifyInterest(double newInterest) {
        return annualInterestRate = newInterest;
    }
}