package Q2;

public class Car extends RoadVehicle implements ImportDuty{
	private String carType;
 
	@Override
	public void calculateDuty() {
		System.out.println("Car Tax: " + CARTAXRATE * 7);
	}
	 
 
	public Car(int wheels, int passengers, String carType) { 
		super(wheels, passengers);
		setType(carType);
	}
 
	public void setType(String carType)  {
		this.carType = carType;
	}
 
	public String getType() {
		return carType;
	}

	@Override
	public String toString(){
		return "\n---CAR---\n" + super.toString() + "\nCar Type: " + carType;
	}
}
