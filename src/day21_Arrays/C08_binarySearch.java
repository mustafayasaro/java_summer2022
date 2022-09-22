package day21_Arrays;

import day11_stringManupulation.C03_contains;

import java.util.Arrays;

public class C08_binarySearch {

    public static void main(String[] args) {

        /*
        binarySearch() Java da eleman aramanin kisa yoludur
        Ancak binarySearch'un calisabilmesi icin once
        array'in sirali hale getirilmesi gerekir
        Eger siralama yapmadan binarysearch yaparsaniz
        yanlis sonuc bulur veya sonuc bulamayiz
         */

        String [] harfler  = {"Y", "B", "D", "G", "O"};

        String arananHarf = "Y";

        // bize integer dondurur == index
        /*
        binarysearch bize aradigimiz elemanin indexini dondurur
        Integer dondurecegi icin ya bir degere atamaliyiz ya da direkt yazdirmmaliyiz
        Array sirali olmadigi icin arama sonucunu dogru bulmayabilir
        emin olmak icin once sort yapmaliyiz
         */

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler)); //[B, D, G, O, Y]
        System.out.println(Arrays.binarySearch(harfler, arananHarf)); // 4






    }
}
