package day25_constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_Constructor {

    public static void main(String[] args) {

                    C01            obj1             =                 new              C01            ()              ;
              // class adi       objenin adi      assignment         keyword          constructor (yapici-muteahhit)

        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        List<String> list = new ArrayList<>();
        /*
        List<String> list2 = new List<>();
        List bir interface'dir ve interfacelerin consttructor'u yoktur
         */

        /*
        constructor nedir?
        metod degil
        variable'da degil
        Constructor constructor'dir
         */

        System.out.println(obj1.sayi); // 0
        obj1.deneme(); // C01'den deneme methoduyum

        /*
        Java OOP concept kullandigi icin olusturulan her bir classin
        ihtiyac oldugunda obje uretebilmesine uygun dizayn etmistir
        Ama her class'dan obje uretilmeyebilir

        Java'da bir obje olusturmak icin mutlaka constructor'a sahip olunmasi gerekir
        OOP concept icin class'lardan obje uretebilmeliyiz
        java  constructor  araciligiyla obje olusturur

        Bunun icin Java ihtiyac halinde kullanilmasi icin her class'da default bir Constructor koymustur
        Default constructor Class icinde gorulmez

        ornegin bu Class'da constructor gorunmemesine ragmen C01 classindan icinde oldugumuz
        C02 classinda bir obje uretebildik

        Bu default constructur class'dan obje olusturuldugunda otomatik olarak calisir
        Constructor kisaca java'da obje olusturmak icin kullandigi kod blogudur
        Constructor calismadan obje olusturulmasi mumkun degildir

        Class da variable ve methodari kullanarak objeyi sekillendiriz

        Contructorun mutlaka ismi olmali ve class ismiyle ayni olmaidir
        Bu classin default contructoru C02_Constructor(){} ' dir
        class ismiyle aynidir

        Constructorun parametresi olabilir olmayadabilir.
        Eger specific bir siparis vereceksek o siparisin ozelligine gore
        constructorin parametresine yazariz


        */


        /*
        Obje olusturmak siparis verme gibi dusunebiliriz

        bir erkek tisortu ureten bir fabrika var
        bir musteri arasa ve bana tisort uret desin
        ve bana hic bir ozelligni soylememis olsun
        ben elimde kalanlari veririm yani default olarak ne varsa o teslim edilir

        bana yesil tisort uret dese
        ben sadece yesil olanlarii veririm
        diger ozelliklreri default olur(yuvarlak yaka mi, polo yaka mi, V yaka mi soylememis)

        bana yesil V yaka uret dese
        Ben yesil V yaka tisort uretirim diger ozellikler default olur(beden)

        Bana yesil, V yaka, medium tisort uret derse
        Ben yesil, V yaka, medium tisort uretitim

        bana yesil, V yaka, medium 100 tane tisort uret derse
        ben yesil, V yaka, medium 100 tane tisort uretirim.

        siparis ne kadar specific tarif edilirse teslimat da o kadar guzel olur
         */
    }
}
