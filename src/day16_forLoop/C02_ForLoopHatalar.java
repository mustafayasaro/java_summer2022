package day16_forLoop;

public class C02_ForLoopHatalar {

    public static void main(String[] args) {


        /*
        Baslangic noktasindan sonra
        bitis sartina yaklasmiyorsak sonsuz loop olusur
         */
     /*   for (int i = 0; i > -10  ; i--) {
            System.out.println(i);
    }   */

        /*
        Eger ilk deger icin bile bitis sarti saglamiyorsa
        for loop calismaz
        ama loop bofy''si hicbir zaman devreye girmez (calismaz)
         */
        for (int i = 0; i > 5; i++) {
            System.out.println(i);
        }


    }
}
