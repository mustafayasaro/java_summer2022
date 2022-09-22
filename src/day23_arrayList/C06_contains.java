package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_contains {

    public static void main(String[] args) {

        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        System.out.println(urunler.contains("Ikram")); // ture
        System.out.println(urunler.contains("Hobby")); // false

        List<String> urunler2 = new ArrayList<>();
        urunler2.add("Nutella");
        urunler2.add("Ikram");

        urunler.containsAll(urunler2); // true

        urunler2.add("Hobby");
        urunler.containsAll(urunler2); // false

        System.out.println(urunler.get(3)); // Cay

        int arr[] = new int[5];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= arr.length; i++) {
            list.add(i);
        }
        System.out.println(list); //[1, 2, 3, 4, 5]


    }
}
