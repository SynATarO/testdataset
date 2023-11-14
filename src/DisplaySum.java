public class DisplaySum{
    public static void mian(String args[]){
        int sum;
        sum = add(10, 20);
        System.out.println("="+sum);
    }

    static int add(int x, int y){
        System.out.print(x+"+"+y);
        int sum = x + y;
        return sum;
    }
}