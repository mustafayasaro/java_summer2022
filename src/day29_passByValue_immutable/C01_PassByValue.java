package day29_passByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C01_PassByValue {

    public static void main(String[] args) {

        /*
        4 elemanli bir array olusturalim sonra ayr bir method'da
        bu arrayin 2. ve 4. elemanlarini 100'den kucuk rastgele
        bir sayi ile degistirelim ve yeni halini dondurelim
         */
        int[] arr = {5, 7, 8, 10};
        elemanDegistir(arr);
        System.out.println("main method'un icinde diger method calistiktan sonra : " + Arrays.toString(arr));
        // main method'un icinde diger method calistiktan sonra : [5, 63, 8, 53]
    }
    public static void elemanDegistir(int[] arr) {

        Random rnd = new Random();
        arr[1] = rnd.nextInt(100); // iceriye almasini istedigimiz max degeri yazariz ve 0-100 arasinda bir deger atar
        arr[3] = rnd.nextInt(100); // iceriye almasini istedigimiz max degeri yazariz ve 0-100 arasinda bir deger atar

        System.out.println("method'un icinde diger method calistiktan sonra : " + Arrays.toString(arr));
        // method'un icinde diger method calistiktan sonra : [5, 34, 8, 74]
        /*
        primitive data turleri stack memory'de depolanir
        non primitive'ler heap 'de depolanir
        Array' ler heap'de olur fakat referanslari stack memory'dedir
        Array'ler ya primitive ya da non-primitiv data turlerinin referanslarini bulundurur
        Biz objeyi degil elemanlari degistirdigimiz icin degisim kalici olur
        yani metod'da yaptigimiz degisikligi main method'da yazdirsak bile degismis hali gelir
         */
    }
}
