package day15_Overloading_ForLoop;

public class C05_ForLoop {
    /*
    Nelirli bir kosul saglandigi surece tekrarlanmasi gereken isler icin
    kullanilan kod bloklarina LOOP(dongu) denir.
    Tekrar sayisi belirli olan durumlarda for loop kullanilmasi tercih edilir
     */
    public static void main(String[] args) {

        /*
        1'den 5'e kadar (5 dahil) olam tamsayilari toplayin
         */

        int toplam = 0;

        for (int i = 1; i <= 5; i++) {
            toplam += i;
        }
        System.out.println("toplam : " + toplam);
        //10 dahil 20 dahil aaradaki sayilari toplayiniz

        toplam = 0;
        for (int i = 10; i <= 20; i++) {
            toplam += i;
        }
        System.out.println("toplam = " + toplam);

        /*
        30 dahil 50 dahi aradaki  cif sayilari toplayin
         */

        toplam = 0;

        for (int i = 30; i <= 50; i += 2) {
            toplam += i;
        }
        System.out.println("30-50 arasi cif sayilarin toplami = " + toplam);


        toplam = 0;
        for (int i = 30; i <= 50; i++) {
            if (i % 2 == 0) {
                toplam += i;
            }
        }
        System.out.println("30-50 arasi cif sayilarin toplami = " + toplam);


        /*
        1500 ile 1600 (siniirlar dahil) arassinda 7 ile bolunebilen sayilarin toplami kactir
         */

        toplam = 0;
        for (int i = 1500; i <= 1600; i++) {
            if (i % 7 == 0) {
                toplam += i;
            }
        }
        System.out.println("1500 ile 1600 (siniirlar dahil) arassinda 7 ile bolunebilen sayilarin toplami : " + toplam);

    }

}
