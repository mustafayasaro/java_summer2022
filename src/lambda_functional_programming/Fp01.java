package lambda_functional_programming;

import java.util.*;
import java.util.stream.*;

public class Fp01 {
    /*
    1-) Lambda (functional programming) Java 8 ile kullanulmaya baslanmistir

    2-) Functional Programming'de "Ne yapilacak" (What to do) uzerine yogunlasilir.
        Structured Programming "Nasil yapilacak" (How to do) uzerine yogunlasilir

    3-) Functional Programming Arrays ve Collections ile kullanilir.

    4-) entrySet() methodu ileMap, Set'e donusturulerek Functional Programming'de kullanilabilir.
     */

    public static void main(String[] args) {

        //1) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)

        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste); // [8, 9, 131, 10, 9, 10, 2, 8]

        listElemanlariniYazdirStructured(liste);
        System.out.println();
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlariYazdirStructured(liste);
        System.out.println();
        ciftElemanlariYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdir(liste);
        System.out.println();
        tekrarsizTekElemanlarinKupunuYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami(liste);
        System.out.println();
        tekrarsizElemanlarinKupununCarpimi(liste);
        System.out.println();
        getMaxEleman(liste);
        System.out.println();
        getMaxEleman2(liste);
        System.out.println();
        getYedidenBuyukCiftMin(liste);
        getYedidenBuyukCiftMin2(liste);
        getYedidenBuyukCiftMin3(liste);
        getTersSiralamaylaTekrarsizElemanlarinYarisi(liste);
        System.out.println();
        getMinEleman(liste);
        getMinEleman2(liste);



    }

    public static void listElemanlariniYazdirStructured(List<Integer> list) {
        // methodun return type i voidden farkli olursa concatination yapilir uzerinde oynama yapilabilir


        for (Integer w : list
        ) {
            System.out.print(w + " ");
            //8 9 131 10 9 10 2 8
        }
    }


    //1)Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void listElemanlariniYazdirFunctional(List<Integer> list) {

        list.stream().forEach(t -> System.out.print(t + " "));
        // lambda icin gelistirilmis method'lara ulasmak icin kullanilir = stream()
        // t = variable'dir bir tanedir ( once 8 sonra 9 ... listedki elementleri tek tek aalir ve yazdirir
        // stream() methodu Collection'dan elementleri akisa dahil etmek icin kullanilir

        //8 9 131 10 9 10 2 8
    }


    //2) çift sayi olan list elemanlarini aynı satırda aralarında boşluk bırakarak
    //   yazdıran bir method oluşturun.(Structured)
    public static void ciftElemanlariYazdirStructured(List<Integer> list) {
        for (Integer w : list
        ) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
                // 8 10 10 2 8
            }
        }
    }


    //2)Ardışık çift list elementlerini aynı satırda aralarında boşluk bırakarak
    // yazdıran bir method oluşturun.(Functional)

    public static void ciftElemanlariYazdirFunctional(List<Integer> list) {

        list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));
        // 8 10 10 2 8
    }


    //3) Ardışık tek list elemanlarinin karelerini aynı satırda aralarında boşluk bırakarak
    //   yazdıran bir method oluşturun.(Functional)


    public static void tekElemanlarinKareleriniYazdir(List<Integer> list) {

        list.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));
        //81 17161 81

        // eger argumentten gelen degerler degisecekse map() methodu kullanilir
    }


    //4) Ardışık tek list elementlerinin küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak
    // yazdıran bir method oluşturun.


    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer> list) {

        list.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t * t).forEach(t -> System.out.print(t + " "));

        // distinct() =>  elemanlari unique hale getirir. yani tekrar eden elemanlari eler
    }


    //5) Tekrarsız çift elementlerin karelerinin toplamını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer> list) {

        Integer toplam = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);
        System.out.println(toplam); // 168
        // eleman sayisini teke indirdigimiz izin foreach loop kullanmadik
        //reduce eleman sayisi yapilan islemler sonucu azalirsa kullanilir
        // eleman sayimiz 3 sayiyibir biriyle toplayinca sonuc bit adet toplam olacak

        // reduce(0, (t, u) -> t + u); ==>  0= initilazingdir. carpim icinse 1'dir
        // t = baslangic noktasi(0) u = 64
        // t = 64    u = 100
        // t = 164   u = 4
        // t= 168
    }


    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.

    public static void tekrarsizElemanlarinKupununCarpimi(List<Integer> list) {

        Integer carpim = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t * t).reduce(1, (t, u) -> t * u);
        System.out.println(carpim);
        // burada tek bir sonuc alacagimiz icin gerek yok
        // map ve reduce ile foreachin yerine kullanilabilir
    }

    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.

    public static void getMaxEleman(List<Integer> list) {
        Integer max = list.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(max); // 131
        // stream()   => sayilarin hepsini listten aldi (8,9,131,10,9,10,2,8)
        // distinct() => sayilari unique hale getirdi(8,9,132,10,2)
        // reduce()   => aldigi lemanlari birbiriyle karsilastirip bize en buyuk olani dondu

    }

    //2. yol
    public static void getMaxEleman2(List<Integer> list) {
        Integer max = list.stream().distinct().sorted().reduce(list.get(0), (t, u) -> u);
        System.out.println("max = " + max); // max = 131
    }

    //Ödev
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(2 Yol ile)

    public static void getMinEleman(List<Integer> list) {
        Integer min = list.stream().distinct().reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u);
        System.out.println("mininimum = " + min); // min = 2
        // stream()   => sayilarin hepsini listten aldi (8,9,131,10,9,10,2,8)
        // distinct() => sayilari unique hale getirdi(8,9,132,10,2)
        // reduce()   => aldigi elemanlari birbiriyle karsilastirip bize en buyuk olani dondu
    }

    public static void getMinEleman2(List<Integer> list) {
        Integer minimum2 = list.stream().distinct().sorted().reduce(list.get(list.size()-1), (t, u) -> t);
        System.out.println("miinimum2 = " + minimum2); //
    }





    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.

    // 1. yol
    public static void getYedidenBuyukCiftMin(List<Integer> list) {
        Integer min = list.stream().distinct().filter(t -> t % 2 == 0).filter(t -> t > 7).reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u);
        System.out.println(min); // 8
    }


    // 2.yol
    public static void getYedidenBuyukCiftMin2(List<Integer> list) {
        Integer min = list.stream().
                distinct().
                filter(t -> t % 2 == 0).
                filter(t -> t > 7).
                sorted(Comparator.reverseOrder()).
                reduce(Integer.MAX_VALUE, (t, u) -> u);
        System.out.println("min = " + min); // min = 8
    }

    //3. yol

    public static void getYedidenBuyukCiftMin3(List<Integer> list){
        Integer min = list.stream().
                           filter(t -> t % 2 == 0).
                           filter(t -> t > 7).
                           sorted().findFirst().
                           get();
        System.out.println("min = " + min); // min = 8
    }




    // 10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.
     // diger soruda collect() metodunu kullanmadik daha onceki srular bizden ya tek tek yazdirin ya da
     // sonuc olarak bize  bir eleman donduruyordu

    public static void getTersSiralamaylaTekrarsizElemanlarinYarisi(List<Integer> list){

        // degerleruzrinde oynama yapip degisiklik yapiyoesak map() kullanilir
        // collect() => cikan sonuclari bir listin icccerisine toplanir
        List<Double> sonuc =list.stream().distinct().filter(t-> t>5).map(t-> t/2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("sonuc = " + sonuc); // sonuc = [65.5, 5.0, 4.5, 4.0]
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

        List<Double> sonuc = list.stream().
                                    distinct().
                                    filter(t->t>5).map(Utils :: yarisiniaal).
                                    sorted(Comparator.reverseOrder()).
                                    collect(Collectors.toList());


        System.out.println("sonuc = " + sonuc); // sonuc = [65.5, 5.0, 4.5, 4.0]
    }

}
