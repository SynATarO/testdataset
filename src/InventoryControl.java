import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InventoryControl {
    public static void main(String args[]) throws Exception{
        int[] inventory  = {0,0,0,0,0};

        updateInventory(inventory);

        displayInventory(inventory);
    }

    static void updateInventory(int[] inventory) throws Exception {

        int[] items = inputChange();

        changeInventory(inventory, items);
    }

    static int[] inputChange() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] items = new int[2];

        System.out.println("商品番号？");
        items[0] = Integer.parseInt(reader.readLine());

        System.out.println("個数増減？");
        items[1] = Integer.parseInt(reader.readLine());

        return items;
    }

    static void displayInventory(int[] inventory) {
        for (int i = 0; i < inventory.length; i++) {
            System.out.println("商品 "+i+" 個数 ="+inventory[i]);
        }
    }

    static void changeInventory(int[] inventory, int[] items) {
        inventory[items[0]] += items[1];
    }


}
