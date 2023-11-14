public class InitializeInventory {
    public static void main(String args[]) {
        int[] inventory = initilizeInventory(args);

        System.out.println("商品種類"+inventory.length);
    }

    static int[] initilizeInventory(String[] args) {
        int size = 5;
        if(args.length > 0) {
            size = Integer.parseInt(args[0]);
        }

        int[] inventory = new int[size];

        return inventory;
    }
}