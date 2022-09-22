package day47_maps;

import day46_maps.ReusableMethod;

import java.util.Map;

public class C01_DununTekrari {

    public static void main(String[] args) {


        Map<Integer, String> sinifListMap = ReusableMethod.mapOlustur();

        System.out.println(sinifListMap);

        // ogrenci listesini isim soyisim olarak yazdirin

        ReusableMethod.tumValueSiraliYazdir(sinifListMap);
        // 1- Ali, Can, JDev
        // 2- Enes, Cem, Tester
        // 3- Taha, Emre, JDev
        // 4- Derya, Deniz, Tester
        // 5- Ali, Can, JDev
        // 6- Enes, Cem, Tester
        // 7- Taha, Emre, JDev

        // kac farkli brans varsa bransIsmi: branstakiOgrenciSayisi seklinde yazdirin
        ReusableMethod.bransOgrenciSayisiYazdir(sinifListMap);
        // {DevOPS=1, JDev=3, Tester=3}


    }
}
