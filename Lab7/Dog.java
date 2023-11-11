package Lab7;

 //subclass
public class Dog extends Animal {

    public Dog(String type, int age, char gender) {
        super(type, age, gender);       //super refers to superclass parent objects, used to access these vars
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }
    
}  
