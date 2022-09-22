package day46_maps;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class C02_MapsMethodIle {


    public static void main(String[] args) {


        Map<Integer, String> sinifListMap = ReusableMethod.mapOlustur();

        // value'lari sira numarali olarak yazdirin
        ReusableMethod.tumValueSiraliYazdir(sinifListMap);
        //1- Ali, Can, JDev
        //2- Enes, Cem, Tester
        //3- Taha, Emre, JDev
        //4- Derya, Deniz, Tester


        //isim ve soyisimlerin birlikte olacagi bir liste olusturun
        List<String> siniFisimSoyIsimList = ReusableMethod.isimSoyIsimListesiOlustur(sinifListMap);
        System.out.println("isim soyisim listesi : " + siniFisimSoyIsimList);

        // kac farkli brans varsa bransIsmi: branstakiOgrenciSayisi seklinde yazdirin





    }
}
