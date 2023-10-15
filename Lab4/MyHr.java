

public class MyHr {

    
    private Offices office1;
    private Offices office2;
    private Offices office3;
    private static int empCounter = -1;
    private Employees newEmp;
    private static Offices allOffices[] = new Offices[3];
    private static Employees allEmployees[] = new Employees[5];
    private static Employees[] personnelList = new Employees[2];
    private static int personnelCount = 0;

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

    //method to assign employee to an office
    public void assignEmployee(Employees emp) {

        if(personnelCount >2) {
            System.out.println("Two Employees already assigned to this office");
        }
        else if(personnelCount <= 2) {
            personnelList[personnelCount] = emp;
            personnelCount++;
        }
        
    }


}

