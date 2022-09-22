package day20_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        /*
        Arrays birden fazla variable depolamak icin kullanilan object (non-primitive data)' lardir
        Arrays'de sadece primitive datalar veya non-primitive datalara ait referanslar depolanabiilir
        Array'in icindeki tum data lar ayni data turunde olmalidir
        Arrays'ler object(Non primitive) dir ve o yuzden heap memory'de depolanir.
        */

        int sayilar[] = new int[3];
        System.out.println(sayilar);//[I@30c7da1e

        // non-primitive data turundeki datalari
        // her zaman direkt yazdiramayabiliriz
        // Array'i yazdirmak istersek Java'daki Arrays classindan yardin isteriz

        System.out.println(Arrays.toString(sayilar)); // [0, 0, 0]


        sayilar[2] = 10;
        sayilar[0] = 5;
        sayilar[1] = 1;

        System.out.println(Arrays.toString(sayilar)); // [5, 1, 10]

        String sinif[] = {"Ali", "Ayse", "Ahmet"};

        System.out.println(Arrays.toString(sinif));  //  [Ali, Ayse, Ahmet]


        sinif[1] = "Hasan";

        System.out.println(Arrays.toString(sinif));//[Ali, Hasan, Ahmet]

        //sadece hasan'i yazdirmak istersek
        //sadece hasan'dan bahsettigimiz icin bir String, Arrayin tamamindan bahsedersek bir objedir
        // o yuzden hasani direkt Arrays.toString methodunu kullanmadan yazabiliriz
        System.out.println(sinif[1]);//Hasan

        System.out.println(sinif[0]);//Ali

    }
}
