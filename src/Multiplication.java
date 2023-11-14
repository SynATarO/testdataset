public class Multiplication {
    public static void main(String args[]){
        int[] array = {0,1,2};
        System.out.println("array[0]"+array[0]);
        System.out.println("array[1]"+array[1]);
        System.out.println("array[2]"+array[2]);
        multiplication(array);
        System.out.println("array[0]"+array[0]);
        System.out.println("array[1]"+array[1]);
        System.out.println("array[2]"+array[2]);
    }

    static void multiplication(int[] array){
        array[0] *= 10;
        array[1] *= 10;
        array[2] *= 10;
    }
}
