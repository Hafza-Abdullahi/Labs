// Student Name 	: Hafza Abdullahi
// Student Id Number: C00286249
// Date 			: Sept 20223
// Purpose 			: My first class implementation

public class Lab2q2 {
    public static void main(String args[]) {

    HotelRoom roomA = new HotelRoom();

    roomA.setRate(100.0);
    roomA.setVacant(true);

    HotelRoom roomB = new HotelRoom();
    
    roomB.setRate(80.0);
    roomB.setVacant(false);    
    
    System.out.println("A: room number is " + roomA.getVacant() + " meaning its occupied and the rate is " + roomA.getRate());
    

    System.out.println("A: room number is " + roomB.getVacant() + " meaning its vacant and the rate is " + roomB.getRate());

    }
}
