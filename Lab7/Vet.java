package Lab7;

public class Vet{
    private String name;
    public Vet(String name) {
        setName(name);
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    //getter
    public String getName() {
        return name;
    }

    //methods
    public void vaccinate(Animal myAnimal){
        System.out.println(name + " is vaccinating..."); //this message is printed regadless of dog/cat or other animal
        if(myAnimal instanceof Dog ) {  //checks if this instance of Animal is a Dog, returns true/false
            System.out.println("Dog has been vaccinated" + "\n" + myAnimal);
        }
        else if(myAnimal instanceof Cat ) {
            System.out.println("Cat has been vaccinated" + "\n" + myAnimal);
        }
        
    }
}
