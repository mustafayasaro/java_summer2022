package day23_arrayList;

import java.util.*;


public class C08_equals {

    public static void main(String[] args) {

        List<String> urunler1 = new ArrayList<>();
        urunler1.add("Nutella");
        urunler1.add("Ikram");
        urunler1.add("Cekirdek");
        urunler1.add("Cay");


        List<String> urunler2 = new ArrayList<>();
        urunler2.add("Ikram");
        urunler2.add("Nutella");
        urunler2.add("Cekirdek");
        urunler2.add("Cay");

        System.out.println(urunler1.equals(urunler2)); // false


        Collections.sort(urunler1);
        Collections.sort(urunler2);
        System.out.println(urunler1.equals(urunler2)); // true




    }
}
