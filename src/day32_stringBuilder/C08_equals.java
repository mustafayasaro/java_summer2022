package day32_stringBuilder;

public class C08_equals {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        String str = "Java";

        System.out.println(sb1.equals(sb2)); // false
        System.out.println(sb1.compareTo(sb2));
        // 0 >> aradaki fark 0 demek

        System.out.println(sb1.equals(sb1)); // true

        /*
        StringBuilder'da equals methodu ancak ayni
        obje olursa true doner
        String'deki gibi dusunmemek gerekir
         */

        System.out.println(sb1.equals(str)); // false

        //steCharAt
        // trimToSize >> kapasiteyle length'i esitler fazla alan kaplamamak icin

        StringBuilder sb3 = new StringBuilder("Jave");
        System.out.println(sb1.compareTo(sb3));
        // -4  Java <> Jave tek tek karsilastirir
        //     J       J       = ayni
        //      a        a     = ayni
        //       v        v    = ayni
        //        a         e  = aralarindaki fark = (b,c,d,e)-4
        //                       ASCII degerleri arasindaki farka bakar
        //                       iki farkli harf varsa ilk farkli olanlarin farkini verir


    }
}
