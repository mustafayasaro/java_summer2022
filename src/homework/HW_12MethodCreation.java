package homework;

public class HW_12MethodCreation {
    /*
    Kullanicidan bir sayi alin.
    Bu sayinin tek mi  cift mi oldugunu
    sifirdan buyuk mu kucuk mu oldugunu
    ayrica 100'den buyukse  birler, onlar ve yuzler basamagindaki
    rakamlarin toplamini, 100'den kucukse sadece birler basamagini yazdiran
    3 method yazin
     */

    public static void main(String[] args) {
        int sayi = 200;

        tekMiCiftMi(sayi);
        sifirdanBuyukMu(sayi);
        yuzdenBuyukse(sayi);

    }

    private static void yuzdenBuyukse(int sayi) {
        if (sayi > 100) {
            int temp = sayi;
            int birler ;
            int toplam = 0;
            birler = sayi % 10;
            sayi /= 10;
            toplam += birler;

            birler = sayi % 10;
            sayi /= 10;
            toplam += birler;

            birler = sayi % 10;
            sayi /= 10;
            toplam += birler;

            System.out.println(temp + " sayisinin rakamlar toplami : " + toplam);

        } else {
            int temp = sayi;
            int birler = sayi % 10;
            System.out.println(temp + " sayisinin birler basamagi : " + birler);
        }
    }

    private static void sifirdanBuyukMu(int sayi) {
        if (sayi > 0) {
            System.out.println(sayi + " sayisi sifiran buyuk");
        } else if (sayi < 0) {
            System.out.println(sayi + " sayisi sifiran kucuk");
        } else {
            System.out.println("Girdiginiz sayi : 0");
        }
    }

    public static void tekMiCiftMi(int sayi) {
        if (sayi % 2 == 0) {
            System.out.println("Girdiginiz sayi cift sayiyidir.");
        } else {
            System.out.println("Girdiginiz sayi tek sayidir.");
        }
    }

}
