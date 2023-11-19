package Q2;

public class Student extends Person{
    private String course;
    public Student(String name, String course) {
        super(name);
        setCourse(course);
    }

    //abstract methods
    @Override
    public String getDescription(){
        return "A Student studying " + course;
    }

    //setters
    public void setCourse(String course) {
        this.course = course;
    }
    //getter
    public String getCourse(){
        return course;
    }
    
    /*add more info to the Person toString that only applies to Student
    @Override 
    public String toString(){
        return super.toString() + " is studying " + course;
    }*/
}
