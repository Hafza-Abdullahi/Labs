
public class Offices {
    private static int counter = 99;
    private int roomNumber;
    private int room1,room2,room3,room4 = 0;
    
    

    //initial constrictor       
    //rooms here dont match the public toString for some reason
    public Offices() {
        counter++;  //100
        roomNumber = counter;   // roomnumber = 100
        room1 = roomNumber;     // room1 = 100
        counter++;              //101
        roomNumber = counter;
        room2 = roomNumber;
        counter++;
        roomNumber = counter;
        room3 = roomNumber;
    }

    public String toString() {
        return "OfficeRooms: " + room1 + " " + room2 + " " + room3;
    }
}
