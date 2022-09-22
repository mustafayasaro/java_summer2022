package day48_maps_TheEnd;

import day46_maps.ReusableMethod;

import java.util.Map;

public class C02_Map_Methodlari {

    public static void main(String[] args) {

        Map<Integer, String> sinifListMap = ReusableMethod.mapOlustur();

        ReusableMethod.entryYazdir(sinifListMap);

        sinifListMap.clear();

        ReusableMethod.entryYazdir(sinifListMap);

        System.out.println("clear'dan sonra map : " + sinifListMap);
        // clear'dan sonra map : {}

        System.out.println(sinifListMap.getOrDefault(104, "Aradigimiz key yok"));

        System.out.println(sinifListMap.getOrDefault(110, "Aradigimiz key yok"));
        //  Aradigimiz key yok

        System.out.println(sinifListMap.isEmpty()); // false

        System.out.println(sinifListMap.putIfAbsent(104, "Derya, okyanus, Developer"));

        sinifListMap.putIfAbsent(108,"Aysun, Can, Devops");
        ReusableMethod.entryYazdir(sinifListMap);

        /*
        sinifListMap'e key olarak 106 yoksa , value "Mevlut, Han, Tester"
        106 daha onceden varsa, "eski data'yi degistirmek istediginizde emin misiniz"
        yazdirin

        106'nin oldugunu kontrol etmek icin containsKey() daha mantikli ama
        biz yeni ogrendigimiz method ile yapalim

        map.putIfAbsent(key, value) ==> key varsa
                                        ekleme yapmaz bize o key ile kayitli olan vaklue'ye dondurur
                                        key yok ise
                                        eklemeyi yapar ve bize null dondurur
         */

        System.out.println(sinifListMap.putIfAbsent(106,"Mevlut, Han, Tester"));
        // Taha, Deniz, JDev


        if (sinifListMap.putIfAbsent(106,"Mevlut, Han, Tester") == null){
            System.out.println("Kayit basarili");
        }else {
            System.out.println("eski data'yi degistirmek istediginizde emin misiniz");
        }


        sinifListMap.remove(106); // 106'yi silip bize sildigini donduruyo
        sinifListMap.remove(107,"Derya,Cem, Tester"); // silerse true, silemezse false dondurur

        sinifListMap.replace(105,"Erdal,Ciftci,Tester");

        System.out.println(sinifListMap.size());


















    }
}
