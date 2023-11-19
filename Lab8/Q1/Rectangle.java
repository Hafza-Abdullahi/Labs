package Q1;
public class Rectangle extends TwoDShape{
    private double length;
	private double width;
    public Rectangle(String name, String colour, double length, double width)
  	{ 
  		super(name, colour);
		setLength(length);
        setWidth(width);

  	} 

	//must include this method
	@Override
	public double area() {

		return length * width;
	}

	//setters
    public void setLength(double length) {
		this.length = length;
	}
    public void setWidth(double width) {
		this.width = width;
	}
	
	//getters 
	public double getLength() {
		return length;
	}
    public double getWidth() {
		return width;
	}

	//toString
	@Override
	public String toString() {
		return (super.toString() + "\nLength = " + getLength() + "\nWidth = " + getWidth());
	}

}
