import java.util.Random;

public class PairofDice {

    private int[] faces = {1,2,3,4,5,6};
    Random number = new Random();
    private int faceValue;
    private int faceValue2;
  
    public PairofDice() {
        rollDice1();
        rollDice2();
    }
    
    //roll method
    public int rollDice1() {
        //generates a num between 0 and 5
        faceValue = faces[number.nextInt(6)];
        return faceValue;
    }
    public int rollDice2() {
        //generates another num between 0 and 5
        faceValue2 = faces[number.nextInt(6)];
        return faceValue2;
    }
    public String getFaceValues() {
        return "Dice1 Rolled on: " + faceValue + "\nDice2 Rolled on: " + faceValue2;
    }
}
