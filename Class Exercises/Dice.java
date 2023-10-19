import java.util.Random;

public class Dice {

    private int[] faces = {1,2,3,4,5,6};
    Random number = new Random();
    private int faceValue;


    public Dice() {
        rollDice();
        rollDice();
        rollDice();
        
    }
    
    //roll method
    public int rollDice() {
        //generates a num between 0 and 5
        faceValue = faces[number.nextInt(6)];
        return faceValue;
    }

    public String getFaceValue() {
        return "Dice Rolled on: " + faceValue;
    }
}