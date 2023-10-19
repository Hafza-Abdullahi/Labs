package lab6;

public class Person {
	   // Variables
	   private String name;
	   private String address;
	   
	   // Constructors
	   public Person(String name, String address) {
	      this.name = name;
	      this.address = address;
	   }
	   
	   // Getters & Setters
	   public String getName() {
	      return name;
	   }
	   public String getAddress() {
	      return address;
	   }
	   public void setAddress(String address) {
			this.address = address;
	   }
	   //toString
	   public String toString() {
	      return name + "(" + address + ")";
	   }

	   //class Student
	   class Student{
			private int numCourses;
			//these two arrays are parrallel arrays
			private String[] courses;
			private int[] grades;

			//constructor
			public Student(String name, String address) {
				setName();
				setAddress();
			}

			//toString
			public String toString() {
				return "Student name: " + getName() + "\nStudent Address: "  + getAddress();
			}

	   }
	}
