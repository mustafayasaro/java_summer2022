package day29_passByValue_immutable;

public class C04_ImmutableClass {
    public static void main(String[] args) {

        /*
        Immutable : degistirilemez, obje bir kez olusturulursa bir daha degistirilemez.
                   Immutable class'dan olusturulan objeler de immutable'dir
                   Icinde bulucndugumuz class'da String class'indan str'i olusturduk.
                   Dolayisiyla str'da immutable'dir.
        Mutable   : degistirilebilir, obje olusturulduktan sonra surekli degisebilir.


        en meshur immutable class : String
         */


        String str = "Yildiz Bank";

        System.out.println(str.toUpperCase()); // YILDIZ BANK

        str.toLowerCase();
        System.out.println(str); //  Yildiz Bank

        str.substring(3,5); // sout olmadigindan yazdirmaz,  di

        System.out.println(str); //  Yildiz Bank

        /*
        Jaav'da String gibi metin ifadelerde kullanabilecegimiz mutable
        StringBuilder ve StringBuffer class'i vardir
         */


        StringBuilder sb = new StringBuilder("Java Bank");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb); // knaB avaJ

        sb.append(".");
        System.out.println(sb); // knaB avaJ.

        StringBuilder sb2 = new StringBuilder("Atlas bank");

        System.out.println(sb2.insert(1,sb)); //AknaB avaJ.tlas bank
        // 1. siradaki elementin(0. indexteki) yerine sb Stringini koyuyor


        /*
        StringBuilder : mutable'dir yani degistirileilir
                        atama olmasa da StringBuilder degisir
        String : immutable'dir, atama olmazsa degismez
         */
        String s="Hello";

        String t= new String(s);

        if ("Hello".equals(s)) System.out.println("one");

        if(t==s)System.out.println("two");

        if(t.equals(s)) System.out.println("three");

        if("Hello"==s)System.out.println("four");

        if("Hello"==t)System.out.println("five");



    }
}
