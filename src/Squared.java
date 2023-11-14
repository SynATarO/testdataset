public class Squared {
    public static void main(String args[]) {
        int[][] table = new int[9][9];
        for(int b=0; b<table.length; b++){
            table[b][0] = b+1;
            for(int n=1; n<table[b].length; n++){
                table[b][n] = table[b][n-1] * (b+1);
            }
        }

        for(int b=0; b<table.length; b++){
            for(int n=0; n<table[b].length; n++){
                System.out.print(table[b][n] + ", ");
            }
            System.out.println();
        }
    }
}
