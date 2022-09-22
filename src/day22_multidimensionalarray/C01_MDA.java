package day22_multidimensionalarray;

import java.util.Arrays;

public class C01_MDA {

    public static void main(String[] args) {


        /*
        tek katli arraylerde arrayi direkt yazdiramiyoruz
        cunku array non primitive data turudur ve
        her non primitive datalar direkt yazdirilamayabilir

        ancak arrayin icerisindeki elementleri direkt yazdirabiliyoruz
        cunku onlar genelde ya String ya da bildigimiz primitive data turu oluyorlar

         Multi dimensional arraylerde en dikkat edecegimiz konu
         ulasmak istedigimiz elementin bir array mi yoksa
         primitive data mi oldugudur
         */


        int[][] sayilar = {{1, 2, 4, 5,}, {3, 4}};


        /*
        burada sayilar arrayini dusunursek icinde iki tane inner array var
        sayilar[0] ==> [1,2,4,5]

        ancak en icerdeki elementlere ulasabilirsek direkt yazdirabiliriz
         */
        System.out.println(sayilar[0]);  // [I@30c7da1e

        System.out.println(Arrays.toString(sayilar[0])); // [1, 2, 4, 5]

        System.out.println(sayilar[0][1]);  //  2
        System.out.println(sayilar[1][0]);  // 3

        System.out.println(Arrays.toString(sayilar)); // [[I@30c7da1e, [I@5b464ce8]
        System.out.println(Arrays.deepToString(sayilar)); //  [[1, 2, 4, 5], [3, 4]]

        /*
        arrayi iki sekilde deklare edebilyorduk
        birincisinde elemanlari direkt yazabiliyorduk

       int[][] sayilar = {{1, 2, 4, 5,}, {3, 4}};

       ikincisi outer va inner arraaylerin uzunlukarini belirterek olusturabiliriz

       inr[][] sayilar = new int[3][2];
       ancak 2. yontemle yaptigimizda arraylerin farkli uzunlukta olma ihtimali kalmaz
       bu ornek icin outer arrayin uc tane arrayi vardir
       her bir arrayin 2ser elemani vardir

       Eger inner arrayleri farkli uzunluklarda olusturmak istiyorsaniz mecburen birinci
       yontemi kullanmaliyiz
         */



    }
}
