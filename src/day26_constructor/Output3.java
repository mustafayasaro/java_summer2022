package day26_constructor;

public class Output3 {
    int x = 5;

    public Output3() {
        System.out.print("-x" + x);
    }

    public Output3(int x) {
        this();
        System.out.print("-x" + x);
    }

    public static void main(String[] args) {
        Output3 obj1 = new Output3(4);
        Output3 obj2 = new Output3();

    }
}
