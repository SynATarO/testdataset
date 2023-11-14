import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CheckAdult {
    public static void main(String args[]) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("年齢を入力");
        int age = Integer.parseInt(reader.readLine());
        
        if(age>19){
            adult();
        }else{
            child();
        }
    }

    static void adult(){
        System.out.println("成人です");
    }

    static void child(){
        System.out.println("未成年です");
    }
}
