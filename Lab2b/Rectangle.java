package Lab2b;

import javax.sound.sampled.ReverbType;

public class Rectangle {

    private Integer length;
    private Integer width;


    //neccesary constructor
    public Rectangle() {

    }

    //getters 
    public Integer getLength() {
        return length;
    }

    public Integer getWidth() {
        return width;
    }

    //setters, verify each number is bigger than 0.0 and less than or equal to 40
    public void setLength(Integer length) {
        if(length > 0.0 && length <= 40) {
            this.length = length;
        }

        else {
            System.out.println("Make sure you enter a number between bigger than 0.0 and less than 40");
        }
    }

    public void setWidth(Integer width) {
        if(width > 0.0 && width <= 40) {
            this.width = width;
        }

        else {
            System.out.println("Make sure you enter a number between bigger than 0.0 and less than 40");
        }
    }

    public String toString() {
        return "Length = " + length + " " + "Width = " + width;
    }

    //get area
    public Integer getArea() {
        return length * width;
    }

    //get perimeter
    public Integer getPerimeter() {
        return (length *2) + (width *2);
    }

    //print rectangle
    public String printRectangle() {

        for(int i = 0; i < width; i++) {

            System.out.print("*");

        }

        for(int i = 0; i < length; i++) {

            System.out.println("*");
            for(int x = 0; x < width; x++) {

                System.out.print(" ");
            }
            
            System.out.print("*");

        }

        for(int i = 0; i < width; i++) {

            System.out.print("*");

        }


        return " ";
    }

}