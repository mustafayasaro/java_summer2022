package lambda_practice;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda01 { //   ODEV -> okul projesinde listele vb methodlari lamda exp. ile yapiniz

    static ArrayList<String> names = new ArrayList<>(Arrays.asList("Tulay", "zekeriya", "Hasan", "ismail", "osman", "fatih", "ersin", "mevlut"));

    static List<Integer> numbers = new ArrayList<>(Arrays.asList(25, 65, -56, 98, -89, 65, 55, 21, 54, 9, 35, 35, 34));
    static List<String> menu = new ArrayList<>(Arrays.asList("kusleme", "adana", "trilice", "havucdilim", "buryan",
            "kokorec", "kuzutandir", "guvec"));
    /* TASK :

     * Input olarak verilen listteki isimlerden
     * icinde 'a' harfi bulunanlari silen bir code create ediniz.
     *
     * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
     * OUTPUT : [Veli,Omer]
     */

    public static void aHarfiIcerenleriSil(ArrayList<String> isimler) {

        //1. yol
        /*System.out.println(isimler. // akisa alindi
                stream().
                map(t -> t.toLowerCase()). // hepsi kucuk harfe cevirildi
                filter(t -> !t.contains("a")). //  a harfi olmayanlar filtrelendi
                collect(Collectors.toList())); // listte collect edildi*/

        //2. yol
     /*   System.out.println(isimler.stream(). // akisa alindi
                        filter(t -> !t.contains("a") || !t.contains("A")). //  a ve A  harfi olmayanlar filtrelendi
                        collect(Collectors.toList()));*/
        // 3. yol
/*        isimler.removeIf(t->t.contains("a") || t.contains("A"));
        System.out.println(names);
    }*/
    }


    //en buyuk elemani bulunuz

    public static void enBuyukSayi(List<Integer> sayilar) {
        Optional<Integer> maxSayi = sayilar.stream().distinct().reduce(Math::max); // sonuna .get koyunca Optional kalkti
        System.out.println("maxSayi = " + maxSayi); // maxSayi = Optional[98]

        // 2. yol

        System.out.println("sayilar.stream().reduce(Integer :: max) = " + sayilar.stream().reduce(Integer::max));
        // sayilar.stream().reduce(Integer :: max) = Optional[98]

    }
    /*
        reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
        kullanımı yaygındır pratiktir.
        Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
        bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.
        reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
        reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
        İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.
     */

    // Task : List'teki tum elemanlarin toplamini yazdiriniz.
//Lambda Expression...

    public static void sumOfAllElementOFList(List<Integer> nums) {
        // Integer sub = nums.stream().reduce(0, (t, u) -> t + u);
        Integer sub = nums.stream().reduce((t, u) -> t + u).get(); // get de toplama isleminde initialize yapmamiza gerek kalmiyor
        System.out.println("sub = " + sub);  // sub = 351

    }

    // Listteki cift elemanlarinin carpimini yazdiriniz

    public static void ciflerinCarpimi(List<Integer> sayilar) {
        Integer multiplyOfEven = sayilar.stream().filter(Methods::ciftElemanlariBul).reduce(1, (t, u) -> t * u);
        System.out.println("multiplyOfEven = " + multiplyOfEven);
    }

    //TODO task tek lerin karesini buyukten kucuge
    public static void teklerinKareBuyuktenKucuge(List<Integer> sayi) {
        sayi.stream().filter(t -> t % 2 == 0).map(t -> t * t).sorted(Comparator.reverseOrder()).forEach(Methods::yazdir);
        // 9604 3136 2916 1156
    }


    // Task2 : List elemanlarini alafabetik buyuk harf ve  tekrarsiz print ediniz.
    public static void alfabetikBuyukHarfTekrarsiz(List<String> yemek) {
        //yemek.stream().distinct().map(t->t.toLowerCase()).sorted().forEach(Methods :: yazdir);

    }


    // Task : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
    public static void strKarakterSayisiYazdir(List<String> yemek) {
    }

    // Task :TODO list elemanlarinin son harfine gore ters sirali print ediniz.
    public static void sonHarfeGoreTersSira(List<String> yemek) {
        yemek.stream().sorted(Comparator.
                        comparing(t -> t.toString().
                                charAt(t.toString().length() - 1)).
                        reversed()).
                forEach(Methods::yazdir);
        // kuzutandir buryan havucdilim kusleme trilice kokorec guvec adana
    }

    // Task : listin elemanlarin karakterlerinin cift sayili  karelerini hesaplayan,ve karelerini tekrarsiz
    // buyukten kucuge sirali  print ediniz..
    public static void karakterCiftKareBuyuktenKucuge(List<String> yemek) {
    }

    // TODO Task : List elelmmalarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.
    public static void karakterSayiYedidenBuyuk(List<String> yemek) {
        // ilkel yontem ile
        Boolean kontrol = yemek.stream().allMatch(t -> t.length() <= 7);
        if (kontrol) {
            System.out.println("List elemanlarinin tamaminin karakter sayilari 7 ve daha az harften olusmus");
        } else {
            System.out.println("List elemanlarinin tamaminin karakter sayilari 7 ve daha az harften olusmamaktadir");
        }

        // modern yzim(Java8'in faydalari)
        System.out.println(yemek.stream().allMatch(t -> t.length() <= 7) ?
                "List elemanlarinin tamaminin karakter sayilari 7 ve daha az harften olusmus" : "List elemanlarinin tamaminin karakter sayilari 7 ve daha az harften olusmamaktadir");

        //List elemanlarinin tamaminin karakter sayilari 7 ve daha az harften olusmamaktadir

    }

    //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
    //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
    //noneMatch() --> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.
    // Task : List elelmanlarinin "W" ile baslamasını kontrol ediniz.
    public static void basHarfiWIleBaslayan(List<String> yemek) {
    }

    // TODO Task : List elelmanlarinin "x" ile biten en az bir elemaı kontrol ediniz.
    public static void xIleBitenEleman(List<String> yemek) {
    }

    // TODO Task : Karakter sayisi en buyuk elemani yazdiriniz.
    public static void karkterEnFazla(List<String> yemek) {
        //limit(1) => Sınırlandırma demek. Bu akışın elemanlarından oluşan, uzunluğu maxSize'dan uzun olmayacak
        // şekilde kesilmiş bir akış return eder. Stream return eder.

      Stream<String> sonIsim= yemek.stream().// limit kullandigimiz icin sonIsim objesine atadik
              sorted(Comparator.
                      comparing(t-> t.toString().length()). //  uzunluga gore siraladik, length methodu object classda calismadigi icin stringe cevirdik
                      reversed()). // krakter sayisi en cok olan en basa geldi
              limit(1);// limit ile ilk elemani aldik yani listeyi ilk eleman ile sinirladik
        System.out.println( // sonIsim objesinin data turu Stream oldugu icin benim bunu arraya cevirmem gerekir
                Arrays.toString // array elemanlarini yazdirmak icin stringe cevirdik
                (sonIsim.toArray()));
        // [havucdilim]
    }

    /*
TRİCK : •    Stream'ler ekrana direk yazdırılamaz. Stream'i toArray() ile Array'e çeviririz.
Array'i de Arrays.toString() 'in içine alıp yazdırabiliriz.
•  Ör; System.out.println(Arrays.toString(***.toArray())); veya System.out.println(Arrays.asList(***.toArray()));
kullanılabilir.
*/
    //TODO Task : list elemanlarini son harfine göre siralayıp ilk eleman hariç kalan elemanlari print ediniz.
    public static void sonHarfeGoreSiralaIlkHaricElmanlariYaz(List<String> yemek) {
    }

}
