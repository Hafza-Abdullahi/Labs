// Student Name 	: Oisin Cawley
// Student Id Number: 
// Date 			: Nov-2015
// Purpose 			: My first class implementation

public class Lab2q1 {
    public static void main(String args[]) {

    HotelRoom roomA = new HotelRoom();

    roomA.setRoomNumber(200);
    roomA.setRoomType("single");

    HotelRoom roomB = new HotelRoom();
    
    roomB.setRoomNumber(201);
    roomB.setRoomType("Double");

    System.out.println("A: room number is " + roomA.getRoomNumber() + " and it a " + roomA.getRoomType() + " room");
    

    System.out.println("B: room number is " + roomB.getRoomNumber() + " and it a " + roomB.getRoomType() + " room");
    }
}
