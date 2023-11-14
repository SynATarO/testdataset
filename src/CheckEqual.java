public class CheckEqual{
    public static void main(String args[]){
        int[] array1 = {1,2,3};
        int[] array2 = {1,2,3};

        boolean result = checkEqual(array1, array2);

        System.out.println("equals(a,b)" + result);
    }

    static boolean checkEqual(int[] array1, int[] array2){
        boolean equals = true;

        if(array1.length != array2.length){
            equals = false;
        }else{
            for(int i = 0; i < array1.length; i++){
                if(array1[i] != array2[i]){
                    equals = false;
                    break;
                }
            }
        }

        return equals;  
    }
}