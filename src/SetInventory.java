public class SetInventory {
    public static void main(String args[]) {
        int[] inventory = {1,0,3,2,4};

        System.out.println("更新前の商品0の個数"+inventory[0]);

        int[] items = {0,2};

        updateInventory(inventory, items);

        System.out.println("更新後の商品0の個数"+inventory[0]);
    }

    static void updateInventory(int[] inventory, int[] items) {
        inventory[items[0]] += items[1];
    }
}