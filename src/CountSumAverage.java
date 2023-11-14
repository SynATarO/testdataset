public class CountSumAverage {
    public static void main(String args[]){
        int[][] array = {{0,8,7,8,5,4,7,3,7,9},{5,6,9,5,0,3,2,4,3},{5,9,1,8,6,5,5,2,7,1,8},{7,6,2,2,6,9,6,3},{5,9,7,1,2,7,9,5,7,1,5,9},{8,6,6,2,4,7,9,8,1,1},{6,6,2,0,7,8,2,2,4},{1,8,9,8,7,1,3,8,8,8,1},{7,0,1,8,1,9,0,7,2,0,9,1,8},{7,7,5,7,0,8,5}};
        
        int sum = 0;
        int count = 0;

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j]+",");
                sum += array[i][j];
                count++;
            }
            System.out.println();
        }
        System.out.println("要素の合計 = "+sum);
        System.out.println("要素の平均 = "+count);
    }
}
