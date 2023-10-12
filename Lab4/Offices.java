public class Offices {
    private static int officeCounter = 99;
    private int officeNumer;
    private int room1,room2,room3;

    //initial constrictor
    public Offices() {
        officeCounter++;
        officeNumer = officeCounter;
        room1 = officeNumer;
        officeCounter++;
        officeNumer = officeCounter;
        room2 = officeNumer;
        officeCounter++;
        officeNumer = officeCounter;
        room3 = officeNumer;

    }

    public String getRoomNumber() {
        return room1 + " " + room2+ " " +room3;
    }

    public String toString() {
        return "Office Rooms: " + room1 + " " + room2 +" " + room3;
    }

    

}
