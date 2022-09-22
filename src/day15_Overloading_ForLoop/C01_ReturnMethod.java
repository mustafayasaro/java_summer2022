package day15_Overloading_ForLoop;

public class C01_ReturnMethod {
    public static void main(String[] args) {

        /*
        Verilen iki sayiyi carpip sonucu bize donduren bir method olusturun
         */

        /*
        donduren > return method
        yazdiran > void method u kullanilir
         */


        int sayi1 = 10;
        int sayi2 = 5;
        int sonuc = carpGetir(sayi1, sayi2);

        /*
        olusturulan her variable kendii methodunda gecerlidir
        sonuc variable'i gibi
         */
    }
    public static int carpGetir(int sayi1, int sayi2) {
        int sonuc  = sayi1 * sayi2;
        System.out.println(sonuc);
        return sonuc;
    }
}
