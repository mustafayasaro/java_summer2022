package day45_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C02_CollectionsDaataTuru {
    public static void main(String[] args) {
        /*
        Collections elmas icerisinde <dataTurunu> Object secmemiz durumunda
        Collections'a farkli data turlerinde objeler koymamiza izin verir
        bu depolama acisindan bize esneklik saglar
        Ancak islem yaparken tum objeleri Object tanimladigimizdan
        cok fazla casting yapmamiz gerekebilir
         */


        List<String> liste = new ArrayList<>();
        // liste.add(5);
        // liste.add('a');
        // liste.add(true);

        List<Object> list = new ArrayList<>();
        list.add(5);
        list.add('a');
        list.add(true);
        list.add("Ali");
        System.out.println(list); // [5, a, true, Ali]
        list.set(0,(Integer)list.get(0)+5);
        // data turu Object oldugu icin matematiksel islem yapamayiz
        // onun icin casting yapariz
        // Object bir Non primitive oldugu icin
        // int'in wrapper class'i olan INTEGER'i kullanarak casting yapariz
        System.out.println(list); // [10, a, true, Ali]

        list.set(3, list.get(3) + " Can");
        System.out.println(list);

        list.set(2,(!(Boolean)list.get(2)));
        System.out.println(list);

        Set<Object> set1 = new HashSet<>();
        set1.add(5);
        set1.add('a');
        set1.add(true);
        set1.add("Ali");


    }
}
