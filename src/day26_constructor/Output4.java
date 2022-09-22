package day26_constructor;

public class Output4 {

    int x = 3;
    int y = 5;

    public Output4() {
        x += 1;
        System.out.println("-x" + x);
    }
    public Output4(int i) {
        this();
        this.y = i;
        x += y;
        System.out.println("-x" + x);
    }
    public Output4(int i, int i2) {
        this(3);
        this.x -= 4;
        System.out.println("-x" + x);
    }

    public static void main(String[] args) {
        Output4 obj1 = new Output4(4, 3);

        /*
            output : -x4
                     -x7
                     -x3
         */
    }
}
