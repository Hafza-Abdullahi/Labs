package Lab7;

 //subclass
public class Cat extends Animal {

    public Cat(String type, int age, char gender) {
        super(type, age, gender);
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }
    @Override
    public void sleep() {
        System.out.println("cat is sleeping");
    }
    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }
    
    
}  
