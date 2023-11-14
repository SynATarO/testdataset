import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;   

public class FiveArgs {
    public static void main(String args[]) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[5];

        for(int i=0; i<array.length; i++){
            System.out.println("入力"+(i+1)+":");
            array[i] = reader.readLine();
        }

        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
