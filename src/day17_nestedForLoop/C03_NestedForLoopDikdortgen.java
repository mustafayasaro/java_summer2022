package day17_nestedForLoop;

public class C03_NestedForLoopDikdortgen {

    public static void main(String[] args) {
        /*
        Verilen en ve boy degerine gore
         *'lardan olusan bir dikdortgen olusturali
        en = 3   boy = 4

        ****
        ****
        ****
         */

        int en = 3;
        int boy = 4;


        for (int i = 1; i <= en ; i++) {  // outer loop ==dis loop
                                                 // inner loop  = icerdeki loop
            for (int j = 1; j <= boy; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
