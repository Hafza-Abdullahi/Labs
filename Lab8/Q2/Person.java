package Q2;
public abstract class Person {

    private String name;

    public Person(String name){
        this.name = name;
    }

    //method
    public abstract String getDescription();

    //getter
    public String getName(){
        return name;
    }

    public String toString(){
        return "Person Name: " + name;
    }

}   

    
