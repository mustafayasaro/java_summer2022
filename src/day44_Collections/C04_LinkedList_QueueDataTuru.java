package day44_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedList_QueueDataTuru {

    public static void main(String[] args) {

        Queue<String> ll3 = new LinkedList<>();
        ll3.add("Adem");
        ll3.add("Zeynep");
        ll3.add("Hpolat");
        ll3.add("Kadir");

        /*
        Queue kuyruk demektir, sira onemlidir
        gelem sona gelir, giden bastan gider

        yemek kyrugu gibi gelen kuyrugun sonuna gelir, giden basan eksilir
         */

        System.out.println(ll3); // [Adem, Zeynep, Hpolat, Kadir]

        System.out.println(ll3.remove()); // Adem
        System.out.println(ll3); // [Zeynep, Hpolat, Kadir]

        System.out.println(ll3.remove("Hpolat")); // true
        System.out.println(ll3); // [Zeynep, Kadir]


        System.out.println(ll3.element()); //  Zeynep
        // queue'nun en basindaki adami getiriyor ama silmiyor

        System.out.println(ll3.peek()); //  Zeynep
        System.out.println(ll3); // [Zeynep, Kadir]

        Queue<String> ll4 = new LinkedList();
        System.out.println(ll4.peek()); // null
        // System.out.println(ll4.element()); // NoSuchElementException

        // peek ve element silmeden ilk elementi bize dondurur
        // aralarindaki fark bos bir list olursa
        // peek> nuul , element > exception firlatir

        ll3.offer("Ahmet");
        ll3.offer("Sefa");
        System.out.println(ll3); // [Zeynep, Kadir, Ahmet, Sefa] >> sona ekledi

        System.out.println(ll3.poll()); // Zeynep >> hem siliyor hem bize getiriyor
        System.out.println(ll3); // [Kadir, Ahmet, Sefa]

        // ll4 bos bir liste
       // System.out.println(ll4.remove()); // NoSuchElementException
        System.out.println(ll4.poll()); // null

    }
}
