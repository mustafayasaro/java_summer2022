package day29_passByValue_immutable;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class C02_PassByValue {

    public static void main(String[] args) {

        /*
        Birden fazla element iceren array ve arralist gibi yapilarda da
        passByValue gecerlidir

        Eger method'da array veya list'in kendisi degistirlirse passByValue
        ozelligi sebebiyle Java degisen degeri degil array veya list'in orijinal degerini alir

        Ancak array veya list degistirlmeden sadece icindeki elemanlar
        degistirilirse Java, obje degismedigi icin (referans ayni) ayni
        array veya list'i bize dondurur. Ancak icindeki elementler degismis olacaktir
         */

        /*
        verilen 4 elemanli bir arraay'i metod'a gonderelim
        method'da yeni uc elemanli bir array atayip
        bu yeni array'e rastgele 100'den kucuk uc sayi atayalim
        method'da array'i yazdiralim

        main method'da da method call'dan sonra yeniden method'u yazdiralim
         */

        int[] arr = {3, 5, 8, 10};

        arrayiDegistir(arr);

        System.out.println("Method call'dan sonra main method'da array: " + Arrays.toString(arr));
        // Method call'dan sonra main method'da array: [3, 5, 8, 10]

        System.out.println(arr);
        // [I@42d3bd8b
    }
    public static void arrayiDegistir(int[] arr) {

        arr = new int[3];
        Random rnd = new Random();
        arr[0] = rnd.nextInt(100);
        arr[1] = rnd.nextInt(100);
        arr[2] = rnd.nextInt(100);

        System.out.println("Method'da array : " + Arrays.toString(arr));
        //  Method'da array : [93, 76, 62]

        System.out.println(arr);
        //[I@dfd3711

    }
}
