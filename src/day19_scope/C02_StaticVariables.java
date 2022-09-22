package day19_scope;

public class C02_StaticVariables {

    static int staticSayi = 10;
    String isim = "Mustafa";

    static  int degersizStaticVariable;
    int degersizInstanceVariable;

    /*
    Class level'daki variable'lara deger atamazsak da Java kabul ediyor
     */

    public static void main(String[] args) {

        /*
        Bir variable static olarak olusturulduysa objeler icin degil
        class icin gecerlidir
         */

        System.out.println(staticSayi); // 10
        staticMethod();
        staticSayi = 12;
        System.out.println(staticSayi); // 12

        C02_StaticVariables obje1 = new C02_StaticVariables();
        obje1.staticOlmayanMethod();

        /*
        Instance bir variable'in degerini bulmak icin objenin olusturulmasindan itibaren
        istenen satira kadar kodu takip etmeliyiz

        Static variable'da ise class'in en basindan baslayip
        istenen satira kadar kodu takip edip static variable'in
        son degerini bulmaliyiz
         */


    }

    public  static void staticMethod(){
        System.out.println(staticSayi); // 10

    }

    public void staticOlmayanMethod(){

        System.out.println(staticSayi); //12
        staticSayi = 20;
        System.out.println(staticSayi);
        /*
        Static variable'lar class icersinde heryeden ulasilabilir
        static olsun ya da olmasin her method static variable'lari gorebilir ve degistirebilir
        farkli method'larda static variable'in hangi degerini alacagini
        bilmek istiyorsak clas'in basindan itibaren kodun calismasini takip etmeliyiz
        method ne zaman cagirilirsa o anki static variable degerini method'da kullanabiliriz
         */
    }
}
