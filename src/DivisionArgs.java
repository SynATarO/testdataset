import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DivisionArgs {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("整数を入力");
        int number1 = Integer.parseInt(reader.readLine());
        System.out.println("整数を入力");
        int number2 = Integer.parseInt(reader.readLine());

        System.out.println(number1+"/"+number2+"=");

        int count = 0;
        while(true){
            number1 = subtract(number1,number2);
            if(number1<0){
                break;
            }
            count++;
        }
        System.out.println(count);
    }

    static int subtract(int number1, int number2){
        return number1 - number2;
    }
}
