public class Dice {
    public static void main(String args[]) {
        int dice1, dice2, dice3;

        dice1 = roll();
        dice2 = roll();
        dice3 = roll();

        System.out.println("dice1="+dice1);
        System.out.println("dice2="+dice2);
        System.out.println("dice3="+dice3);
    }

    static int roll() {
        int dice = (int)(Math.random()*6)+1;
        return dice;
    }
}
