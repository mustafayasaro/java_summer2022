package day20_arrays;

import java.util.Arrays;

public class C03_ArraysLength {
    public static void main(String[] args) {

        /*
        Iki sekilde array olusturabiliriz
         */
        /* 1 */  int sayilar[] = {1, 2, 3};
        /* 2 */  String harfler[] = new String[4];

        System.out.println("Sayilar arrayinin uzunlugu : " + sayilar.length); //3

        /*
        String length methodunda () parantez var arrayin lengthinde yok
        String isim = "Java";
        isim.length();
         */


        System.out.println("harfler arrayiin uzunlugu : " + harfler.length); // 4

        System.out.println(Arrays.toString(harfler));//[null, null, null, null]


        /*
        harfler arrayinin son elementini yazdiralim
         */

        System.out.println(harfler[harfler.length-1]);//null

        System.out.println(harfler[5]);// ArrayIndexOutOfBoundsException

    }
}
