package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fp03 {
    public static void main(String[] args) {

        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Amanda");
        liste.add("Christopher");
        liste.add("Jackson");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Benjamin");
        System.out.println(liste);

        //buyukHarfleYazdir(liste);
        System.out.println();
        //buyukHarfleYazdir2(liste);
        uzunlugaGoreYazdir(liste);
        System.out.println();
        uzunlugaGoreTersYazdir(liste);
        System.out.println();
        sonKaraktereGoreTekrarsizSirala(liste);
        System.out.println();
        UzunlukVeIlkHarfeGoreSiralaYazdir(liste);
        System.out.println();
        //bestenBuyukleriSil(liste);
        //baslangiciAYadaSonuNOlaniSil(liste);
        //baslangiciAYadaSonuNOlaniSil2(liste);
        //uzunlugu8Ile10VOIleBiten(liste);
        System.out.println("uzunlugu12denAzMi(liste) = " + uzunlugu12denAzMi(liste)); // uzunlugu12denAzMi(liste) = true
        System.out.println("xIleBaslamiyorMu(liste) = " + xIleBaslamiyorMu(liste)); // true
        System.out.println("rIleBitenVarMi(liste) = " + rIleBitenVarMi(liste)); // rIleBitenVarMi(liste) = true

    }


    //1) Tüm elemanları büyük harf ile yazdıran bir method oluşturun.
    /*public static void buyukHarfleYazdir(List<String> list){
        list.stream().map(String :: toUpperCase).forEach(Utils :: ayniSaturdaBosluklaYazdir);
        //ALİ ALİ MARK AMANDA CHRİSTOPHER JACKSON MARİANO ALBERTO TUCKER BENJAMİN
    }*/

    // 2. yol

/*    public static void buyukHarfleYazdir2(List<String> list) {
        list.replaceAll(String::toUpperCase);
        System.out.println("list = " + list);
        // list = [ALİ, ALİ, MARK, AMANDA, CHRİSTOPHER, JACKSON, MARİANO, ALBERTO, TUCKER, BENJAMİN]
    }*/


    //2) Elemanları uzunluklarına göre sıralayıp yazdıran bir method oluşturun

    public static void uzunlugaGoreYazdir(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length)).forEach(Utils::ayniSaturdaBosluklaYazdir);
        // Comparator.comparing(String :: length)  =>  Siralama kosulunu belirtmek icin kullanilir
        // Ali Ali Mark Amanda Tucker Jackson Mariano Alberto Benjamin Christopher
    }

    //3) Elemanları uzunluklarına göre ters sıralayıp yazdıran bir method oluşturun.

    public static void uzunlugaGoreTersYazdir(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(Utils::ayniSaturdaBosluklaYazdir);
        // Comparator.comparing(String :: length)  =>  Siralama kosulunu belirtmek icin kullanilir
        // Christopher Benjamin Jackson Mariano Alberto Amanda Tucker Mark Ali Ali
    }

    //4) Elemanları son karakterlerine göre sıralayıp tekrarsız yazdıran bir method oluşturun.

    public static void sonKaraktereGoreTekrarsizSirala(List<String> list) {
        list.stream().distinct().sorted(Comparator.comparing(Utils::sonKaraktariAl)).forEach(Utils::ayniSaturdaBosluklaYazdir);
    }

    //5) Elemanları önce uzunluklarına göre ve sonra ilk karakterine göre sıralayıp yazdıran bir method oluşturun.

    public static void UzunlukVeIlkHarfeGoreSiralaYazdir(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length).thenComparing(Utils::ilkKaraktariAl)).forEach(Utils::ayniSaturdaBosluklaYazdir);
        // //thenComparing() :==>siralama icin bir kosul daha belirtir
        //  Ali Ali Mark Amanda Tucker Alberto Jackson Mariano Benjamin Christopher
    }

    // //6) Uzunluğu 5'ten büyük olan elemanları silen bir method oluşturun.
   /* public static void bestenBuyukleriSil(List<String> list){
        list.removeIf(t-> t.length()>5); // list mutable oldugu icin elemanlari islem sonrasi kalici degistiginden comment out yapiyoruz
        System.out.println(list);
        // [Ali, Ali, Mark]
    }*/


    //7) ‘A’, ‘a’ ile başlayan yada ‘N’, ‘n’ ile biten elemanları silen bir method oluşturun.

   /* public static void baslangiciAYadaSonuNOlaniSil(List<String> list){
        list.removeIf(t-> t.charAt(0) == 'A' || t.charAt(0)== 'a' || t.charAt(t.length()-1) == 'N' || t.charAt(t.length()-1) == 'n');
        System.out.println(list); // [Mark, Christopher, Mariano, Tucker]
    }*/

    //2. yol

  /*  public static void  baslangiciAYadaSonuNOlaniSil2(List<String> list){
        list.removeIf(t-> t.startsWith("A") || t.startsWith("a") || t.endsWith("N") || t.endsWith("n"));
        System.out.println(list); // [Mark, Christopher, Mariano, Tucker]
    }*/


    //8) Uzunluğu 8 ile 10 arası olan yada 'o' ile biten elemanları yazdıran bir method oluşturun.
   /* public static void uzunlugu8Ile10VOIleBiten(List<String> list) {
        list.removeIf(t -> (t.length() > 7 && t.length() < 11) || t.endsWith("o"));
        System.out.println("list = " + list); // list = [Ali, Ali, Mark, Amanda, Christopher, Jackson, Tucker]
    }*/

    //9) Tüm elemanların uzunluklarının 12'den az olup olmadığını kontrol eden bir method oluşturun.


    public static boolean uzunlugu12denAzMi(List<String> list) {

        return list.stream().allMatch(t -> t.length() < 12);
    }


    //10) Hiçbir elemanın 'X' ile başlamadığını kontrol eden bir method oluşturun.

    public static boolean xIleBaslamiyorMu(List<String> list){

        return list.stream().noneMatch(t-> t.startsWith("X")); // hicbiri X ile basliyor mu ? true
    }


    //11) Herhangi bir elemanın 'r' ile bitip bitmediğini kontrol eden bir method oluşturun.

    public static boolean rIleBitenVarMi(List<String> list){
        return list.stream().anyMatch(t-> t.endsWith("r"));
    }



}
