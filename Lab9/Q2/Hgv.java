package Q2;

public class Hgv extends RoadVehicle implements ImportDuty{
	private int cargo;

	public Hgv(){ 	
		this(0,0,0);	
	}

	@Override
	public void calculateDuty() {
		System.out.println("HGV Tax: " + HGVTAXRATE * 7);
	}

	public Hgv(int c, int w, int p){ 
		super(w, p);
		setCargo(c);
	}

	public void setCargo(int size){
		cargo = size;
		}

	public int getCargo(){
		return cargo;
		}	

	public String toString(){
		return "\n---HGV---\n" + super.toString() + "\nCargo: " + cargo;
	}
}
