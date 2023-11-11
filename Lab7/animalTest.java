package Lab7;

public class animalTest {
    public static void main (String args[])
	{
		//dog
		Animal dog = new Dog("Poodle", 4, 'M');
		System.out.println(dog);
		dog.eat();
		dog.sleep();
		dog.makeSound();
		
		System.out.println();
		
		//cat
		Animal cat = new Cat("Tom", 2, 'F');
		System.out.println(cat);
		cat.eat();
		cat.sleep();
		cat.makeSound();
        
		System.out.println();

		//vet 
		Vet vet1 = new Vet("Brian");

		vet1.vaccinate(dog);
		System.out.println();
		vet1.vaccinate(cat);
		
		}
}

