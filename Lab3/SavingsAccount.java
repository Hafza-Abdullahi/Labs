package Lab3;

public class SavingsAccount {
    private static int number = 0;                      //static so it doesnt reset, it belongs to the class
    private int unique;
    private static int annualInterestRate;

    
    //constructor
    public SavingsAccount() {
        number++;
        unique = number;
        
    }
    
    //getter
    public int getNumber() {
        return unique;

    }

}