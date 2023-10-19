public class diceDriver {
    public static void main(String[] args) {
        Dice myDice = new Dice();
        PairofDice doubleDice = new PairofDice();

        System.out.println("Single " + myDice.getFaceValue());
        System.out.println(doubleDice.getFaceValues());
        
    }
}
