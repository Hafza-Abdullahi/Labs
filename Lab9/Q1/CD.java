package Q1;

import java.util.Random;

public class CD extends LibraryItem implements LoanItem{
    
    private String band;
    private String title;
    private int numTracks;

    Random random = new Random();
    private int price;

    public CD(String type, String id, String band, String title, int numTracks){
        super(type, id);
        setBand(band);
        setTitle(title);
        setNumTracks(numTracks);
    }
    //setters
    public void setBand(String band){
        this.band = band;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setNumTracks(int numTracks){
        this.numTracks = numTracks;
    }

    //must include method from LoanItem
    public void calculatePrice(){
        int randNum = random.nextInt(1, 67);    //generate random so not all books with same pages are same price
        price = ((numTracks * 8/10) + randNum) ; 
        System.out.println("CD Price: " + price);
    }

    //getters
    public String getBand(){
        return band;
    }
    public String getTitle(){
        return title;
    }
    public int getNumTracks(){
        return numTracks;
    }

    //toString 
    @Override
    //toString
    public String toString(){
        return super.toString() + "\nCD Band: " + band + "\nCD Title: " + title + "\nCD's No. Tracks: " + numTracks;
    }


}
