package lambda_functional_programming;

import java.util.*;
import java.util.stream.Collectors;
;

public class Fp02 {

    /*
    1-)  t -> "Logic", (t,u) -> "Logic"
         Bu yapiya LAMBDA EXPRESSION

    2-)  Functional Programming kapsaminda LAMBDA EXPRESSION kullanilabilir ama her zaman onerilmez
    3-) "Method Reference" kullanimi "Class Name :: Method Name"
        Ayni zamanda kendi class'larimizi da kullanabilirsiniz.
        Ornegin bir Animal class'imiz var ve nu class'da eat() method'una sahip
        ==> "Amimal :: eat" olarak kullanilabilir
          */

    public static void main(String[] args) {


        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);

        listElemanlariniYzdirFunctional(liste);
        System.out.println();
        ciftElemanlariYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdir(liste);
        System.out.println();
        tekrarsizTekElemanlarinKupunuYazdir(liste);
        tekrarsizCiftElemanlarinKareToplam(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplam2(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplam3(liste);
        tekrarsizCiftElemanlarinKuplerininCarpimi(liste);
        getMaximumEleman(liste);
        yedidenBuyukCiftMin(liste);
        tersSiralamaylaTekrarsizElemanlarinYarisi(liste);

    }


    //1)Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.
    // (Functionalve method reference ile)

    public static void listElemanlariniYzdirFunctional(List<Integer> list){
        list.stream().forEach(Utils :: ayniSaturdaBosluklaYazdir);
        //8 9 131 10 9 10 2 8
        // bu cozumde hicbir lambda ifade kullanmadan sadece methodlar ile
        // functional olarak cozduk
        // method referencec = > Bu class'a git :: bu methodu kullan
    }

    //   2) çift sayi olan list elemanlarini aynı satırda aralarında boşluk bırakarak
    //   yazdıran bir method oluşturun.(Structured)

    public static void ciftElemanlariYazdirFunctional(List<Integer> list){
        list.stream().filter(Utils :: ciftElemanlariSec).forEach(Utils :: ayniSaturdaBosluklaYazdir);
        //8 10 10 2 8
    }

    //3) Ardışık tek list elemanlarinin karelerini aynı satırda aralarında boşluk bırakarak
    //   yazdıran bir method oluşturun.(Functional)

    public static void tekElemanlarinKareleriniYazdir(List<Integer> list) {

        list.stream().filter(Utils :: tekElemanlariSec).map(Utils :: karesiniAl).forEach(Utils :: ayniSaturdaBosluklaYazdir);
        // 64 100 100 4 64
    }

    //4) Ardışık tek list elementlerinin küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak
    // yazdıran bir method oluşturun.


    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer> list) {

        list.stream().distinct().filter(Utils :: tekElemanlariSec).map(Utils :: kupunuAl).forEach(Utils :: ayniSaturdaBosluklaYazdir);
        // 512 1000 8
        // distinct() =>  elemanlari unique hale getirir. yani tekrar eden elemanlari eler
    }

    //5) Tekrarsız çift elemanların karelerinin toplamını hesaplayan bir method oluşturun.

    //1. yol
    public static void tekrarsizCiftElemanlarinKareToplam(List<Integer> list){
        Integer toplam = list.stream().distinct().filter(Utils ::ciftElemanlariSec).map(Utils :: karesiniAl).reduce(0, Math :: addExact);
        System.out.println(toplam); // 168
    }

    //2.yol
    public static void tekrarsizCiftElemanlarinKareToplam2(List<Integer> list){
        Integer toplam = list.stream().distinct().filter(Utils ::ciftElemanlariSec).map(Utils :: karesiniAl).reduce(Math :: addExact).get();
        System.out.println(toplam); // 168
    }


    //3.yol
    public static void tekrarsizCiftElemanlarinKareToplam3(List<Integer> list){
        Integer toplam = list.stream().distinct().filter(Utils ::ciftElemanlariSec).map(Utils :: karesiniAl).reduce(0, Integer :: sum);
        System.out.println(toplam); // 168
    }


    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElemanlarinKuplerininCarpimi(List<Integer> list){
        Integer carpim = list.stream().distinct().filter(Utils :: ciftElemanlariSec).map(Utils :: kupunuAl).reduce(1, Math :: multiplyExact);
        System.out.println("carpim = " + carpim); // carpim = 4096000
    }



    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.

    public static void getMaximumEleman(List<Integer> list){

        Integer max = list.stream().distinct().reduce(Math :: max).get();
        System.out.println("max = " + max); // max = 131
    }

    //Ödev
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(Method Reference)

    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.

    public static void yedidenBuyukCiftMin(List<Integer> list){

        Integer min = list.stream().distinct().filter(t-> t>7).filter(Utils :: ciftElemanlariSec).reduce(Math :: min).get();
        System.out.println("min = " + min); // min = 8
    }




    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini
    //     (elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.

    public static void tersSiralamaylaTekrarsizElemanlarinYarisi(List<Integer> list){

        List<Double> sonuc = list.stream(). // gerekli methodlara ulasmamiz icin bir tuneldir
                distinct(). // tekrarli olanlari almaz
                filter(t->t>5).// yazdigimiz kosullara gore siralama yapar
                map(Utils :: yarisiniaal). // Her bir elemanin degerini degistirmeye yarar
                sorted(Comparator.reverseOrder()). // siralama yapar
                collect(Collectors.toList());


        System.out.println("sonuc = " + sonuc); // sonuc = [65.5, 5.0, 4.5, 4.0]
    }

}
