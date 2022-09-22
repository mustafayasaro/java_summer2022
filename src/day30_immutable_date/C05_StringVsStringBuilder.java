package day30_immutable_date;

import java.time.LocalTime;
import java.util.Locale;

public class C05_StringVsStringBuilder {

    public static void main(String[] args) {

        /*
        String'mi yoksa StringBuilder' mi daha hizlidir
        Bunun ici bir String olusturup 100 kere sonuna . ekleyelim
        oncesinde ve sonrasinda zamani alip arradaki farki bulalim

        Ayni islemi StringBuilder icin de yapalim
         */

        LocalTime baslangic = LocalTime.now();

        String str = "Ahhhhh Java";

        for (int i = 0; i <1000 ; i++) {
            str+=".";
        }

        LocalTime bitis = LocalTime.now();
        System.out.println(baslangic);
        System.out.println(bitis);

        System.out.println("String zaman : " + (bitis.getNano() - baslangic.getNano()));
        // 41986100

        LocalTime baslangic1 = LocalTime.now();
        StringBuilder sb  = new StringBuilder("Ahhhhh Java");
        for (int i = 0; i <1000 ; i++) {
            sb.append(".");
        }

        LocalTime bitis1 = LocalTime.now();
        System.out.println(baslangic);
        System.out.println(bitis);

        System.out.println("StringBuilder zaman : " + (bitis1.getNano() - baslangic1.getNano()));
        // 41986100
        /*
        StringBuilder String'den 30 kat daha hizli
         */


    }

}
