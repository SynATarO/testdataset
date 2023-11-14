public class DisplayInventory {
    public static void main(String args[]) {
        int[] inventory = {1,0,3,2,4};

        getInventory(inventory);

    }

    static void getInventory(int[] inventory) {
        for (int i = 0; i < inventory.length; i++) {
            System.out.println("商品 "+i+" 個数 ="+inventory[i]);
        }
    }
}