package Q1;

import java.util.Random;

public class Book extends LibraryItem implements LoanItem{
    
    private String author;
    private String title;
    private int numPages;
    Random random = new Random();
    private int price;

    public Book(String type, String id, String Author, String title, int numPages){
        super(type, id);
        setAuthor(Author);
        setTitle(title);
        setNumPages(numPages);
    }
    
    //must include method from LoanItem
    public void calculatePrice(){
        int randNum = random.nextInt(1, 12);    //generate random so not all books with same pages are same price
        price = ((numPages *  1/10) + randNum); 
        System.out.println("Books Price: " + price);

    }

    //setters
    public void setAuthor(String author){
        this.author = author;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setNumPages(int numPages){
        this.numPages = numPages;
    }

    //getters
    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;
    }
    public int getNumPages(){
        return numPages;
    }

    //toString 
    @Override
    //toString
    public String toString(){
        return super.toString() + "\nBook Author: " + author + "\nBook Title: " + title + "\nBook's No. Pages: " + numPages;

    }
}
