package Q1;
public class Circle extends TwoDShape{
    private double radius;
    public Circle(String name, String colour, double radius)
  	{ 
  		super(name, colour);
		setRadius(radius);

  	} 

	//must include this method
	@Override
	public double area() {

		return Math.PI * (radius * radius);
	}

	//setters
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//getters 
	public double getRadius() {
		return radius;
	}

	//toString
	@Override
	public String toString() {
		return (super.toString() + "\nRadius = " + getRadius());
	}

}
