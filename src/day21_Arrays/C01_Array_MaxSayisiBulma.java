package day21_Arrays;

public class  C01_Array_MaxSayisiBulma {

    /*
    Verilen bir integer arraydeki en buyuk sayiyi yazdiran bir method olusturun
     */
    public static void main(String[] args) {

        int [] sayilar = {3,5,7,1,4,9,5,2};

        maxSayiyiYazdir(sayilar);
    }
    public static void maxSayiyiYazdir(int[] sayilar) {

        int maxSayi  = sayilar[0];
        for (int i = 1; i < sayilar.length; i++) { // baslangici 1'den yapariz zaten 0. indexteki
                                                   // elemani en buyugu olarak kabul ettik
                                                   // bu for loop dongusunde ise 0. indexteki elemani alip
                                                   // tek tek diger elemanlarla karsilastiriyoruz
            if (sayilar[i] > maxSayi){
                maxSayi = sayilar[i];
            }
        }
        System.out.println("Array'deki en buyuk sayi " + maxSayi); //Array'deki en buyuk sayi 9
    }
}
