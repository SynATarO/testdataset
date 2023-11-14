import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FinalCheck {
    public static void main(String args[]) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("終了しますか？(y/n)");
        String answer = reader.readLine();
        if(answer.equals("y")){
            System.out.println("終了します");
            return;
        }
        System.out.println("処理を続行します");
    }
}
