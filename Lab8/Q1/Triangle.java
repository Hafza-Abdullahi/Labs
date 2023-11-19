package Q1;
public class Triangle extends TwoDShape {
    private double base;
    private double height;
    
    public Triangle(String name, String colour, double base, double height) {
        super(name, colour);
        setBase(base);
        setHeight(height);
    }

    //must include this method
	@Override
	public double area() {
        //A = 1/2 × b × h

		return (0.5) * base * height;   //0.5 instead of 1/2 bcs 1/2 = 0 as an int
	}

	//setters
    public void setBase(double base) {
		this.base = base;
	}
    public void setHeight(double height) {
		this.height = height;
	}
	
	//getters 
	public double getBase() {
		return base;
	}
    public double getHeight() {
		return height;
	}

    //toString
	@Override
	public String toString() {
		return (super.toString() + "\nHeight = " + getHeight() + "\nBase = " + getBase());
	}


}
