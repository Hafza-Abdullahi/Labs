package Q2;
/*polymorphic array = an array of example, Person 
but contains both employee and/ or students*/
public class TestPerson {
    public static void main(String args[]) {

        Employee emp1 = new Employee("Sara", 120000.00);
        Student stu1 = new Student("Brian", "Media Studies");

        Person[] everyone = new Person[2];

        everyone[0] = emp1;
        everyone[1] = stu1;

        for(int i = 0; i < 2; i++) {
            System.out.println(everyone[i].getName());
            System.out.println(everyone[i].getDescription());
        }
    }
}
