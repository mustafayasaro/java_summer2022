package day44_Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C03_LinkedList {

    public static void main(String[] args) {

        LinkedList<String> ll1 = new LinkedList();

        List<String> ll2 = new LinkedList();

        Queue<String> ll3 = new LinkedList();
        //

        Deque<String> ll4 = new LinkedList();
        // Eger bir LinkedList olustururken data turunu Deque secersen
        // Deque ozelliklerinin agir bastigi ama
        // LinkedList oldugu icin birbine bagli bir halay gibi olur

        ll2.add("Berk");
        ll2.add("Done");
        ll2.add("Enes");
        ll2.add("Ayse");
        System.out.println(ll2); // [Berk, Done, Enes, Ayse]

        System.out.println(ll2.remove(3)); // Ayse
        //Eger listesmiz Integer elemenlerden olusuyorsa
        // direkt sayi yazarsak index olarak kabl ederdi
        System.out.println(ll2.remove("Enes")); // true
        System.out.println(ll2.isEmpty()); // false

        ll2.set(1,"Serap");
        System.out.println(ll2); // [Berk, Serap]

        ll1.add("Berk");
        ll1.add("Ismail");
        System.out.println(ll1); // [Berk, Ismail]

        ll2.retainAll(ll1);
        // ll2'deki tum elementleri ll1 ile karsilastirir
        // ll1'de olmayanlari siler. ortak olanlari yazdirir


        System.out.println(ll2); // [Berk]


        System.out.println(ll2.hashCode()); // 2066939
        ll2.add("Fatih");
        System.out.println(ll2.hashCode()); // 131726141


        /*
          LinkedList
             Halaya benzer, birbirine bagli. Ekleme ve cikarmada rahat, arama yaparken yavas.
             Ilk eleman her zaman head'dir. Head'te data yoktur, sadece adress vardir.
             Son eleman(tail) null'i point eder.
             Her elemanin icinde data ve adress kismi olmak uzere iki kisim vardir.
             Tum elemanlar pointer'lar/adress'ler kullanilarak birbirine baglanir.
             Her eleman node olarak adlandirilir.
         */
    }

}
