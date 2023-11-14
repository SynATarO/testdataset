public class Calculation {
    public static void main(String args[]){
        int number1=5, number2=10, c=0;
        char operator = '+';
        c = calculation(number1, number2, operator);

        System.out.println(number1+""+operator+""+number2+"="+c);
    }

    static int calculation(int a, int b, char operator){
        int result = 0;
        if(operator == '+'){
            result = a + b;
        }else if(operator == '-'){
            result = a - b;
        }
        
        return result;
    }
}
