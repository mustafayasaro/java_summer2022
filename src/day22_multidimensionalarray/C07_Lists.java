package day22_multidimensionalarray;

import java.util.*;


public class C07_Lists {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        /*
        List primitive data turunu kabul etmez  (int, boolean, char...)
         */

        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(7);
        System.out.println(sayilar); //  [5, 3, 7]
        /*
        Sadece add kullanirsak Java sona ekler
         */

        sayilar.add(2, 10); // indexi 2 olan yere 10 elementini ekle
        System.out.println(sayilar); // [5, 3, 10, 7]

        /*
        add(index, element) istedigimiz elementi istedigimiz indexe yerlestirir
        add methodu eski elementleri silmez veya update etmez yeni element ekler
         */



    }
}
