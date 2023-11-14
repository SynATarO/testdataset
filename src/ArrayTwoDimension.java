public class ArrayTwoDimension {
    public static void main(String args[]){
        int[][] array;
        array = new int[2][3];

        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;
        
        System.out.print(array[0][0]);
        System.out.print(", ");
        System.out.print(array[0][1]);
        System.out.print(", ");
        System.out.print(array[0][2]);
        System.out.println();
        System.out.print(array[1][0]);
        System.out.print(", ");
        System.out.print(array[1][1]);
        System.out.print(", ");
        System.out.print(array[1][2]);
        System.out.println();
    }
}
