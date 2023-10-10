package Lab3;

public class driver {

    public static void main(String args[]) {

        

        BankCustomer mary = new BankCustomer("mary", "emmet");
        
        SavingsAccount acc1 = mary.addAccount();
        SavingsAccount acc2 = mary.addAccount();
        SavingsAccount acc3 = mary.addAccount();
        SavingsAccount acc4 = mary.addAccount();
        SavingsAccount acc5 = mary.addAccount();
        
        acc1.setSavingsBalance(20324.00);
        System.out.println(acc1 + "\n" + acc2 + "\n" + acc3 + "\n" + acc4  + "\n" + acc5);
        System.out.println(acc5.getNumber());

        


        
      
       


    }

    
}