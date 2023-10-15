

public class MyHr {

    private Offices office1;
    private Offices office2;
    private Offices office3;
    private static int empCounter = -1;
    private Employees newEmp;
    private Offices allOffices[] = new Offices[3];
    private Employees allEmployees[] = new Employees[5];

    //constructors
    public MyHr() {
        allOffices[0] = office1;    //pos 0 = office1
        allOffices[1] = office2;
        allOffices[2] = office3;
    }
    

    public void listOffices() {
        for(int i = 0; i < 3; i++) {
            System.out.print(allOffices[i]);
        }
    }



    //method to make new employee
    public void addEmployee(Employees newEmp) {
        empCounter++;
        if(empCounter < 5) {
            this.newEmp = newEmp;
            allEmployees[empCounter] = newEmp;
        }
        else {
            System.out.println("Max number ("+empCounter +") of employees reached" );
        }

    }

    public void listEmployees() {
        System.out.println();
        for(int i = 0; i < 5; i++) {
            System.out.print(allEmployees[i]);
        }

    }



}

