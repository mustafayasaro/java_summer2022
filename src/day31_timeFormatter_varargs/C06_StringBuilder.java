package day31_timeFormatter_varargs;

public class C06_StringBuilder {


    public static void main(String[] args) {

        /*
        primitive data turlerinin hafizada kapladigi yer bellidir
        non-primitive data turlerinin hafizada kapladigi alan sinirsiz olabilir
         */
        StringBuilder sb1 = new StringBuilder(); // bos stringbuilder olusturur
        StringBuilder sb2 = new StringBuilder("Animal");
        StringBuilder sb3 = new StringBuilder(3); // kapasiteyi belirler
        /*
        StrıngBuılder threaad'safe degıldırç Yanı synchronızed degıldır.
        Thread'lı bır ıslem kullanılacaksa StringBuilder kullanilmasi guvanli degildir.

        Not: StringBuffer, StringBuilder'a benzer. StringBuilder,
        StringBuffer'dan hizlidir. Multi-thread iccin StringBuffer kullanilir
         */

    }
}
