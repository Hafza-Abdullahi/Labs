package Q1;
public class Sphere extends ThreeDShape{
    private int radius;
    public Sphere(String name, String colour, int radius)
  	{ 
  		super(name, colour);
		setRadius(radius);

  	} 

	//must include these methods (area from Shape and vol from ThreeDShape)
	@Override
	public double volume() {
        //V=4/3πr3
		return (4/3) * Math.PI * (radius * radius * radius);
	}

	@Override
	public double area() {
		//A=4πr^2
		return 4 * Math.PI * (radius * radius);
	}

	//setters
    public void setRadius(int radius) {
		this.radius = radius;
	}
   
	//getters 
	public int getRadius() {
		return radius;
	}

    //toString
	@Override
	public String toString() {
		return (super.toString() + "\nRadius = " + getRadius());
	}

   
}

	
