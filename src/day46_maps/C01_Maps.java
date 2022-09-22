package day46_maps;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {


        Map<Integer, String> sinifList = new HashMap<>();

        sinifList.put(101, "Ali, Can, JDev");
        sinifList.put(102, "Enes, Cem, Tester");
        sinifList.put(103, "Taha, Emre, JDev");
        sinifList.put(104, "Derya, Deniz, Tester");

        System.out.println(sinifList);
        // {101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev, 104=Derya, Deniz, Tester}

        System.out.println(sinifList.keySet()); // [101, 102, 103, 104]
        System.out.println(sinifList.values());
        // [Ali, Can, JDev, Enes, Cem, Tester, Taha, Emre, JDev, Derya, Deniz, Tester]

        System.out.println(sinifList.values().size()); // 4

        // tum ogrencilaerin bilgilerini alt alta yazdirin

        System.out.println(sinifList.get(101));
        System.out.println(sinifList.get(102));
        System.out.println(sinifList.get(103));
        System.out.println(sinifList.get(104));
        //Ali, Can, JDev
        //Enes, Cem, Tester
        //Taha, Emre, JDev
        //Derya, Deniz, Tester


        // tum ogrencilaerin bilgilerini alt alta yazdirin

        Collection<String> tumValueColl2 = sinifList.values();
        for (String each : tumValueColl2
        ) {
            // buradaki each bize herbir ogenciye ait ayni yapidaki
            // isim, bosluk soyisim, brans bilgilerini iceren String'ler getiriyor
            System.out.println(each);
        }// collectiona atayarak yazdik
        //Ali, Can, JDev
        //Enes, Cem, Tester
        //Taha, Emre, JDev
        //Derya, Deniz, Tester


        // tum ogrencilaerin isim ve soyisimlerini sira no  alt alta yazdirin
        Collection<String> tumValueColl = sinifList.values();
        int sira = 1; // sira no'lu yapmak icin her donugude 1 artacak olan bir variable olusturduk
        String[] eachArr; // elemanlari atamak icin bir array olusturduk
        for (String each : tumValueColl
        ) {
            eachArr = each.split(", ");
            System.out.println(sira + "- " + eachArr[0] + " " + eachArr[1]);
            sira++;
        }
        //1- Ali Can
        //2- Enes Cem
        //3- Taha Emre
        //4- Derya Deniz
//
        // Map'de bulunan ogrencilerin, isim ve soyisimlerini birlestirerek
        // bir sinif listesi olusturun


        List<String> sinifIsimSoyIsimListe = new ArrayList<>();

        for (String each : tumValueColl
        ) {
            eachArr = each.split(", ");
            sinifIsimSoyIsimListe.add(eachArr[0] + " " + eachArr[1]);
        }

        System.out.println(sinifIsimSoyIsimListe);
        // [Ali Can, Enes Cem, Taha Emre, Derya Deniz] should be able to find the correct number of elements



    }
}
