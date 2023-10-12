public class Employees {

    private static int employeeID = 999;
    private int unique;
    private String street,city,town;
    private String empAdress;
    private String type;
    private String employeeType;
    private String companyCar;

    //constructor, gives each emp unique number;
    public Employees() {
        employeeID++;
        unique = employeeID;
        empAdress = getEmployeeAddress();
        employeeType = getEmployeeType();
        if(employeeType == "manager") {
            //
        }
        
    }

    //employee has an adress
    public String address(String street, String city, String town) {
        this.street = street;
        this.city = city;
        this.town = town;

        return street + ", " + city + ", " + town;
    }

    

    public String setManager(String companyCar) {
        this.companyCar = companyCar;
        return companyCar;
        
    }

    //getters and setters
    public int getEmployeeID() {
        return unique;

    }

    public String getEmployeeAddress() {
        return street + ", " + city + ", " + town;
    }

    public String getManagerInfo() {
        return companyCar;
    }
    //employee is a staff/member
    public String setEmployeeType(String type) {
        type = type.toLowerCase();
        if(type.equals("manager")) {        //.equals() here instead of ==, == checks if both objects are in same memory location
            this.type = type;                       //where as .equals() compares the values
        }
        //else if instead of if
        else if(type.equals("staff")) {
            this.type = type;
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
}
