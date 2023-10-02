import javax.sound.midi.Track;

public class HotelRoom {

    private Integer RoomNumber;
    private String RoomType;
    private boolean occupied;
    private Double rate;

    //necessary constructor no args
    public HotelRoom() {
        
    }

    //getters

    public Integer getRoomNumber() {
        return RoomNumber;
    }

    public String getRoomType() {
        return RoomType;
    }

    public boolean getVacant() {
        return occupied;
    }

    public Double getRate() {
        return rate;
    }


    //setters

    public void setRoomType(String RoomType) {

        this.RoomType = RoomType;
    }

    public void setRoomNumber(Integer RoomNumber) {

        this.RoomNumber = RoomNumber;
    }

    public void setVacant(boolean occupied) {

        this.occupied = occupied;
    }

    public void setRate(Double rate) {

        this.rate = rate;
    }

    //second constructor
    public HotelRoom( Integer RoomNumber, String RoomType, boolean occupied, Double rate) {
        
        this.RoomNumber = RoomNumber;
        this.RoomType = RoomType;
        this.occupied = occupied;
        this.rate = rate;

        }
    
    //tostring to avoid getting hash values
    public String toString() {
        
        return RoomNumber + " " + RoomType + " " + occupied + " " + rate;
    }

    //false = empty, true = occupied
    public boolean isOccupied() {

        return occupied;

    }


    String noDoubleBooking = " ";
    public String setOccupied() {

        //true if statement is first bcs if its false we want to change it to true
        if ( occupied == true) {
            
            noDoubleBooking = " No Double Booking";
        }

        //if its empty, change to occupied and print status
        if( occupied == false) {

            occupied = true;
            noDoubleBooking = " Room is not booked, booking now...";

            
        }

        //return roomnumber and status, wether it was booked already or its now booked
        return RoomNumber + ": " + noDoubleBooking;
        
    }

}
