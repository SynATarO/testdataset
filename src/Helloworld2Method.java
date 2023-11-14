public class Helloworld2Method {
    public static void main(String args[]) {
        helloworld();
    }

    static void helloworld(){
        hello();
        world();
    }

    static void hello() {
        System.out.println("Hello");
    }

    static void world() {
        System.out.println(", World!");
    }
}