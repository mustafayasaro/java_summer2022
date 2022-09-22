package day44_Collections;

import java.util.Deque;
import java.util.LinkedList;

public class C05_LinkedList_DequeDataTuru {
    public static void main(String[] args) {

        Deque<String> ll4 = new LinkedList();
        // double ended queue ==> yani iki tarafi da bas kabul edebiliyor
        ll4.add("Cavidan");
        ll4.add("Mesut");
        ll4.add("Selim");
        ll4.add("Tevfik");
        ll4.add("Selim");
        ll4.removeLastOccurrence("Selim"); // son kullanilan selim'i sil

        System.out.println(ll4); // [Cavidan, Mesut, Selim, Tevfik]
        System.out.println(ll4.pop()); // Cavidan  == pop LinkedList'in ilk elementini silip bize dondurdu
        System.out.println(ll4); // [Mesut, Selim, Tevfik]

        ll4.remove();
        System.out.println(ll4); // [Selim, Tevfik]
        ll4.removeFirst();
        System.out.println(ll4); // [Tevfik]
        ll4.removeLast();
        //Deque iki tarafli queue demektir
        // dolayisiyla her methodun first ve last'i var

        System.out.println(ll4); // []

    }
}
