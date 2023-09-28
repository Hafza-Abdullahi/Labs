
public class HotelRoom {

    private Integer RoomNumber;
    private String RoomType;
    private Integer vacant;
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

    public Integer getVacant() {
        return vacant;
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

    public void setVacant(Integer vacant) {

        this.vacant = vacant;
    }

    public void setRate(Double rate) {

        this.rate = rate;
    }

    







}   