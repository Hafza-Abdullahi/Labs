// Student Name 	: Hafza Abdullahi
// Student Id Number: C00286249
// Date 			: Sept 20223
// Purpose 			: My first class implementation

public class Lab2q3 {
    public static void main(String args[]) {

    HotelRoom roomC = new HotelRoom(202,"Single", 0, 90.0);
    
    HotelRoom roomF = new HotelRoom(222, "Single", 1, 89.0);
    System.out.println("Room C details: " + roomC);
    
    roomC.isOccupied();
    System.out.println(roomF.isOccupied());
    



    }

}
