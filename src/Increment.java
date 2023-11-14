public class Increment {
    public static void main(String args[]){
        int x = 1;
        int y = 2;
        System.out.println("1: x=" + x + " y=" + y);
        increment(x, y);
        System.out.println("3: x=" + x + " y=" + y);
    }

    static void increment(int x, int y){
        x += y;
        System.out.println("2: x=" + x + " y=" + y);
    }
}
