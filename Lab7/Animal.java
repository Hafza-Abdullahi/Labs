package Lab7;

public class Animal {
    private String type;
    private int age;
    private char gender;

    public Animal(String type, int age, char gender) {
        setType(type);
        setAge(age);
        setGender(gender);
    }

    //setters
    public void setType(String type) {
        this.type = type;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    //getters
    public String getType() {
        return type;
    }
    public int getAge() {
        return age;
    }
    public char getGender() {
        return gender;
    } 
    
    //methods
    //void for outputting a string instead of using return
    public void eat() {
        System.out.println("Animal is eating");
    }
    public void sleep() {
       System.out.println("Animal is sleeping");
    }
    public void makeSound() {
        System.out.println("A generic animal sound");
    }

    //toString 
    @Override
    public String toString() {
        return "Type: " + type + " Age: " + age + " Gender: " + gender;
    }
}