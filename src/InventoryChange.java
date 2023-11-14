import java.io.BufferedReader;
import java.io.IOError;
import java.io.InputStreamReader;

public class inventoryChange {
    public static void main(String args[]) {
        int[] items = inventoryChange();

        System.out.println(""+items[0]+""+items[1]);

    }
    static int[] inventoryChange() throws Exception { 
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("商品番号？");
        int itemNumber = Integer.parseInt(reader.readLine());

        System.out.println("個数増減？");
        int itemChange = Integer.parseInt(reader.readLine());

        int[] items = new int[2];
        items[0] = itemNumber;
        items[1] = itemChange;

        return items;
    }
}