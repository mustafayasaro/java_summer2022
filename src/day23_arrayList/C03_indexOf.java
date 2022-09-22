package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {

    public static void main(String[] args) {

        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        System.out.println(urunler); // [Nutella, Ikram, Cekirdek, Cay]
        System.out.println(urunler.indexOf("Ikram")); // 1
        System.out.println(urunler); // [Nutella, Ikram, Cekirdek, Cay]
        // indexof metodu bize bilgi donduren bir methoddur listemizi degistirmez

        System.out.println(urunler.lastIndexOf("Ikram")); //  1
        /*
        indexof methodu urunu aramaya 0.indexten,
        lastIndexOf methodu ise son indexten baslar

        arama bitip urun bulundugunda,
        ikisi de bulunan urunun indexini dondurur
         */
        urunler.add("Ikram");

        System.out.println(urunler); // [Nutella, Ikram, Cekirdek, Cay, Ikram]
        System.out.println(urunler.indexOf("Ikram")); // 1

        System.out.println(urunler.lastIndexOf("Ikram")); // 4

        System.out.println(urunler.indexOf("Rulokat")); // -1



    }
}
