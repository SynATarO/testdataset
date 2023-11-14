public class DisplayArgument {
    public static void main(String args[]) {
        displayPlusTen(10);
    }

    static void displayPlusTen(int argument) {
        argument += 10;
        System.out.println("argument="+argument);
    }
}
