public class myHrDriver {
    public static void main(String[] args) {

        Employees bob = new Employees();
        Employees mary = new Employees();
        Offices science = new Offices();
        MyHr test = new MyHr();

        bob.address("a","b","c");
        bob.setEmployeeType("sTaff");
        
        mary.setEmployeeType("manaGeR");
        test.listOffices();
        science.getRoomNumber();
        
        



    }

    
}