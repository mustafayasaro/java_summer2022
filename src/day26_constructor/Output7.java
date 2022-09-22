package day26_constructor;

public class Output7 {
    int x;
    static int y;

    public Output7(int i) {
        x += i;
        y += i;
    }

    public static void main(String[] args) {
        new Output7(2);
        Output7 obj1 = new Output7(3);
        System.out.println(obj1.x + ", " + obj1.y);  // 3, 5

        //x static variable olmadigi icin her yeni olusturulan obje icin degeri base degerindedir
        // y static oldugu icin her hangi bir obje y degerini degistirirse diger objeler icinde degisir

    }
}
