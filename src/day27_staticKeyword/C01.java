package day27_staticKeyword;

public class C01 {

    static int sayi = 10;
    int rakam = 5;

    public static void main(String[] args) {

        /*
        Class level'da iki farkli variable olusturabiliriz
        static variable (class variable)
        instance variable (obje variable)

        static variable'lar tum class'dan kullanilabilirken
        instance variable'lar sadece static olmayan metodlardan kullanilabilir
        instance variable'lara static metoddan ulasmak istersek
        obje olusturmamiz gerekir

        instance variable'lar obje variable'i oldugu icin
        herhangi bir satirda instance variable'in degerinin ne oldugunu
        bulmak icin obje olusturulan satirdan itibaren kod incelenmelidirr

        static variable'lar class variable'i oldugu icin her hangi bir satirda
        static variable'in degerini bulmak icin class'in basindan itibaren kod incelenmelidir
       */
        C01 obj1 = new C01();
        System.out.println("obj1'in rakam degeri : " + obj1.rakam);  // 5
        System.out.println("obj1'in sayi degeri : " + sayi); // 10
        /*
        main metodun basindan 33. satira kadar sayi degerine bir deger atanmissa onu alir atanmamissa
        class leveldaki degeri alir
         */
        obj1.rakam += 1;  // 5 + 1 = 6
        sayi += 1;  // 10 + 1 = 11
        System.out.println("1 artirdiktan sonra obj1'in rakam degeri : " + obj1.rakam); // 6
        System.out.println("1 artirdiktan sonra obj1'in sayi degeri : " + sayi); // 11


        C01 obj2 = new C01();
        System.out.println("obj2'in rakam degeri : " + obj2.rakam); // 5

        System.out.println("obj'in sayi degeri : " + sayi); // 11

        obj2.rakam++;
        obj2.sayi++;

        System.out.println("1 artirdiktan sonra obj2'in rakam degeri : " + obj1.rakam); // 6

        System.out.println("1 artirdiktan sonra obj2'in sayi degeri : " + sayi); // 12


    }
}
