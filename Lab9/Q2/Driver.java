package Q2;

public class Driver {

    public static void main(String args[]){
        Car car1 = new Car(4, 5, "black");
        Hgv hgv1 = new Hgv(300, 4, 2);

        System.out.println(car1);
        System.out.println(hgv1);

        System.out.println();
        
        car1.calculateDuty();
        hgv1.calculateDuty();
    }
}