package day21_Arrays;

import java.util.Arrays;

public class C06_ArrayaElemanEkleme {

    public static void main(String[] args) {

        /*
        C05'deki methodu kullanarak array'e eleman ekleme
         */

        String [] takimListesi = {"Suleyman" , "Osman"};
        String eklenecekler = "Talha";

        takimListesi = C05_ArrayaElementEkle.elemanEkle(takimListesi,eklenecekler);

        System.out.println(Arrays.toString(takimListesi));

    }
}
