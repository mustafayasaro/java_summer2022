package day29_passByValue_immutable;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValue {

    public static void main(String[] args) {

        /*
        Bir list olusturalim iki ayri method'dan birinde sadece elemanlari
        degistirelim

        digerinde yeni bir list atayip ayni sayida yeni elman ekleyelim

        ve her iki method call'dan sonra kendi list'imizi kontrol edelim
         */

        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Veli");
        list.add("Can");

        System.out.println("ilk basta list : " + list);  //  ilk basta list : [Ali, Veli, Can]

        elemanlariDegistir(list);

        System.out.println("elemanDegistir metodundan sonra listemiz : " + list);
        // elemanDegistir metodundan sonra listemiz : [Oguz, Murat, Fatih]

        listDegistir(list);
        System.out.println("listDegistir metodundan sonra listemiz : " + list);
        // listDegistir metodundan sonra listemiz : [Oguz, Murat, Fatih]

    }

    public static void listDegistir(List<String> list) {
        list = new ArrayList<>();
        list.add("Nutella");
        list.add("Cay");
        list.add("Cokokrem");
        System.out.println("listDegistir metodundaki listemiz : " + list);
        // listDegistir metodundaki listemiz : [Nutella, Cay, Cokokrem]
    }

    public static void elemanlariDegistir(List<String> list) {

        list.set(0,"Oguz") ;
        list.set(1, "Murat");
        list.set(2, "Fatih");
        System.out.println("elemanDegistir metodundaki listemiz : " + list);
        // elemanDegistir metodundaki listemiz : [Oguz, Murat, Fatih]

    }
}
