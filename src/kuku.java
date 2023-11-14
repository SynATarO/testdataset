public class kuku {
    public static void main(String args[]) {
        int[][] array = new int[6][7];

        for(int i=0; i<6; i++){
            for(int j=0; j<7; j++){
                array[i][j] = (i+1)*(j+1);
            }
        }

        for(int i=0; i<6; i++){
            for(int j=0; j<7; j++){
                System.out.print(array[i][j]);
                System.out.print(",");
            }
            System.out.println();
        }
    }
}
