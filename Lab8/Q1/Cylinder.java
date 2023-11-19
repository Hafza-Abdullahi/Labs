package Q1;
public class Cylinder extends ThreeDShape{
    private int radius;
    private int height;
    public Cylinder(String name, String colour, int radius, int height)
  	{ 
  		super(name, colour);
		setRadius(radius);
        setHeight(height);

  	} 

	//must include these methods (area from Shape and vol from ThreeDShape)
	@Override
	public double volume() {
        //V=πr^2h
		return Math.PI * (radius * radius) * height;
	}

	@Override
	public double area() {
		//A=2πrh+2πr^2
		return 2 * (Math.PI * radius * height) + 2 * (Math.PI * radius * radius);
	}

	//setters
    public void setRadius(int radius) {
		this.radius = radius;
	}
    public void setHeight(int height) {
		this.height = height;
	}
	
	//getters 
	public int getRadius() {
		return radius;
	}
    public int getHeight() {
		return height;
	}

	//toString
	@Override
	public String toString() {
		return (super.toString() + "\nRadius = " + getRadius() + "\nHeigth = " + getHeight());
	}

}

	
