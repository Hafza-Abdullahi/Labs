package Q2;

public class Employee extends Person {
    private double salary;

    public Employee(String name, double salary){
        super(name);
        setSalary(salary);

    }
    
    //abstract methods
    @Override
    public String getDescription(){
        return "An employee with a salary of " + salary;
    }

    //setter
    public void setSalary(double salary){
        this.salary = salary;
    }
     //getter
    public double getSalary(){
        return salary;
    }

    
    

}
