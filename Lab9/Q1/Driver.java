package Q1;
public class Driver {
    
    public static void main(String args[]) {
         
        LoanItem[] items = new LoanItem[2];
        Book harryPotter = new Book("Book", "HP23", "J.K Rowling", "Harry Potter", 125);
        CD bts = new CD("CD", "bt12", "BTS", "wings", 34);

        items[0] = harryPotter;
        items[1] = bts;
       
        System.out.println(harryPotter);
        System.out.println(bts);
        System.out.println();

        for(int i= 0; i < 2; i++) {
            items[i].calculatePrice();
        }
        
    }
}
