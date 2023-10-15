import java.lang.foreign.Addressable;

public class Employees {

    private static int empCounter = 999;
    private int employeeID;
    private String street,city,town;
    private String empAdress;
    private String type;
    private String employeeType;
    private String carInfo;
    

    //constructor, gives each emp unique number;
    public Employees() {
        empCounter++;
        employeeID = empCounter;
        empAdress = getEmployeeAddress();
        employeeType = getEmployeeType();
        
    }

    //employee has an adress (aggregation)
    class Address{
        String street,city,town;
        public Address(String street, String city, String town) {
            this.street = street;
            this.city = city;
            this.town = town;
        }
    }

    //getters and setters
    public void setEmployeeAddress(String street, String city, String town) {
        this.street = street;
        this.city = city;
        this.town = town;
    }
    public int getEmployeeID() {
        return employeeID;

    }
    public String getEmployeeAddress() {
        return street + ", " + city + ", " + town;
    }


    //employee is a staff/member
    public String setEmployeeType(String type) {
        type = type.toLowerCase();
        if(type.equals("manager")) {        //.equals() here instead of ==, == checks if both objects are in same memory location
            this.type = type;                       //where as .equals() compares the values
            carInfo = "Company Car";
            
        }
        //else if instead of if
        else if(type.equals("staff")) {
            this.type = type;
            carInfo = "None, Not a manager";
        }
        else {
            System.out.println("Please Enter either 'manager' or 'staff'");
        }

        return type;
    }

    //get employee type
    public String getEmployeeType() {
        return type;
    }

    //modify address
    public String modifyAddress(String street, String city, String town) {
        this.street = street;
        this.city = city;
        this.town = town;

        return street + ", " + city + ", " + town;
    }

    //Displaying info about each employee
    public String toString() {

        return "Employee Info\nNumber: " + employeeID + "\nAddress: " + getEmployeeAddress() + "\nEmployee Type: " + getEmployeeType() + "\nCar: " + carInfo+ "\n\n";
    }
}
    
