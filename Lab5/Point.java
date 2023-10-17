package Lab5;

public class Point {
    
    protected int x;
    protected int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //gettters and setters
    public void set_xPoint(int x) {
        this.x = x;
    }
    public void set_yPoint(int y) {
        this.y = y;
    }

    public int get_xPoint() {
        return x;
    }
    public int get_yPoint() {
        return y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    
    //subclass Circle
    public static class Circle{     //used static otherwise "No enclosing instance of type is accessible" error is thrown
        
        private int radius;
        public Circle(int x, int y, int radius) {
            this.radius = radius;
        }

        //getter and setters
        public void setRadius(int radius) {
            this.radius = radius;
        }
        
        public int getRadius() {
            return radius;
        }

        public String toString() {
            return "Radius: " + radius;
        }

    }

    

    }

