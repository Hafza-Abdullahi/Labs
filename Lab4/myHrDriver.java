

public class myHrDriver {
    public static void main(String[] args) {
        
        Employees mary1 = new Employees();
        Employees mary2 = new Employees();
        Employees mary3 = new Employees();
        Employees mary4 = new Employees();
        Employees mary5 = new Employees();
        Employees mary6 = new Employees();

        MyHr test = new MyHr();
        Offices science = new Offices();
        Offices computing = new Offices();
        Offices sports = new Offices();

        //ADDING Employees
        test.addEmployee(mary1);
        test.addEmployee(mary2);
        test.addEmployee(mary3);
        test.addEmployee(mary4);
        test.addEmployee(mary5);
        test.addEmployee(mary6);


      
        
        test.listOffices();         //List offices and room numbers not linked? science offfice rooms are not same when its stored in Office array
        System.out.println();
        System.out.println(science);
        System.out.println(computing);
        System.out.println(sports);
        test.listEmployees();
        
        
       
        
        



    }

    
}