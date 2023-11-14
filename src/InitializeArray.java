public class InitializeArray{
    public static void main(String args[]){
        int[] array = {0,1,2}; 
        display(array);
        initialize(array,-1);
        display(array);
    }

    static void display(int[] array){
        System.out.print("{");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            if(i < array.length - 1){
                System.out.print(",");
            }
        }
    }

    static void initialize(int[] array, int value){
        for(int i = 0; i < array.length; i++){
            array[i] = value;
        }
    }
}