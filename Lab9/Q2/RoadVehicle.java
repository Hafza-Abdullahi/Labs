package Q2;
public class RoadVehicle implements ImportDuty{
	private int wheels;	    //How many wheels it has
	private int passengers; //How many passengers it can carry
 

	//implemented methods
	@Override
	public void calculateDuty() {
		//to be overidden by subclasses
	}
	public RoadVehicle(int wheels, int passengers) { 
		setWheels(wheels);
		setPass(passengers);
	}
 
	public void setWheels(int wheels) {
		this.wheels = wheels;
		}
 
	public int getWheels() {
		return wheels;
		}
 
	public void setPass(int passengers) {
		this.passengers = passengers;
		}
 
	public int getPass() {
		return passengers;
		}

	public String toString(){ 
		return "Wheels: " + wheels + "\npassengers: " + passengers;
	}

	
}
