import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TicketSales {
    public static void main(String args[])throws IOException{
        switch(checkOld()){
            case 0:
                System.out.println("\\0");
                break;
            case 1:
                System.out.println("\\800");
                break;
            case 2:
                System.out.println("\\1600");
                break;
            case 3:
                System.out.println("\\800");
                break;
        }
    }

    static int checkOld() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("年齢を入力");
        int age = Integer.parseInt(reader.readLine());
        
        if(age<3){
            System.out.println("3歳未満は無料");
            return 0;
        }else if(age<16){
            System.out.println("15歳以下は子供料金");
            return 1;
        }else if(age>59){
            System.out.println("60歳以上はシニア料金");
            return 3;
        }

        System.out.println("大人料金");
        return 2;
    }
}
