public class myHrDriver {
    public static void main(String[] args) {

        Employees bob = new Employees();
        Employees mary = new Employees();
        bob.address("a","b","c");

        System.out.println(bob.getEmployeeAddress());
        System.out.println(bob.getEmployeeID());
        System.out.println(mary.getEmployeeID());
        bob.setEmployeeType("manAGER");
        System.out.println(bob.getEmployeeType());

        System.out.println(bob.getManagerInfo());

    }
}