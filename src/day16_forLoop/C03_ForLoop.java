package day16_forLoop;

public class C03_ForLoop {

    public static void main(String[] args) {

        /*
        10-30 dahil sayilarini aralarinda virgul olarak yazdiriniz
         */

        for (int i = 10; i <= 30; i++) {
            if (i < 30) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
        }

    }
}
