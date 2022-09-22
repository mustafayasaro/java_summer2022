package day22_multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class C06_Lists {

    public static void main(String[] args) {

        /*
        avantaj = ArrayList lengthi esnek  olan bir arraydir
        dezavantaj = elemanlari biz tek tek eklemeliyiz


         */


        /*
        arrayi array yapan sembol [] idi
        arrayList'te ise <> diamand dir

         */

        List<String> isimler = new ArrayList<>(); // ikinci diamonda data turunu girmemize gerek yok
                                                   // fakat yazarsak itiraz etmez

        System.out.println(isimler); //  []

        /*
        Bir liste eleman eklemek istersek
         */

        isimler.add("Basak");

        System.out.println(isimler.add("Ayse"));  // true

        //listlerde atama yapmasak da assign edilir


        /*
        String'de bir method calistirdigimizda
        assign yapmazsak String degismiyor

        String isim = "Ali";
        isim.toUpperCase(); // sadece bu satir icin ALI olur
        sout(isim) // Ali
         */

        System.out.println(isimler); // [Basak, Ayse]

        /*
        Listin tek kotu tarafi array altyapisini kullandigi icin
        elemanlari birer birer eklemek zorunda olmamizdir
         */


    }
}
