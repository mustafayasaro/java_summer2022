package day19_scope;

public class C03_ClassLevelVariables {

    public static void main(String[] args) {

        /*
        Farkli bir class'da calisirken
        her hangi bir class adini yazip  .'ya basarsak
        adini yazdigimiz class'daki tum STATIC class uyelerini gorebiliriz
        ve kulanabiliriz
         */

        C02_StaticVariables.staticMethod(); // 10
        System.out.println(C02_StaticVariables.staticSayi); //10
        System.out.println(C02_StaticVariables.degersizStaticVariable);

        C02_StaticVariables obje1 =  new C02_StaticVariables();
        obje1.staticOlmayanMethod();
        //Bu method icinde staticSayi = 20 oldu


        System.out.println(obje1.isim); //Mustafa
        System.out.println(obje1.degersizInstanceVariable); // 0
        System.out.println(C02_StaticVariables.staticSayi); //20



        /*
         farklı bır class'dan  C02 class'ında olan method ve variable'larini kullandıgımda
         C02 class'inin tamami degil sadece benim cagirdigim class uyeleri calisir
         */


        /*
        Class level variable'lara deger atayip atamamak bize kalmisistir
        istersek deger atamasi yapariz istmezsek atama yapmayiz

        Eger deger atamissak Java atadigimiz o degeri kabul eder
        Deger atamazsak o zaman Java bu variable'lara default bir deger atamasi yapar

        int == >0
        String  == > null
        boolean  == > false
        char   == >  '' hiclik
        */



        /*
        Baska class'daki instance variable'lara obje olusturarak ulasabiliriz
         */


    }
}
