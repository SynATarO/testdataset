public class DisplayArgs {
    public static void main(String args[]) {
        System.out.println("コマンドライン引数の数="+args.length);
        for(int i=0; i<args.length; i++) {
            System.out.println(i+"番目の引数"+args[i]);
        }
    }
}
