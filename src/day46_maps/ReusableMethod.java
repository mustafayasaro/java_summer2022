package day46_maps;

import java.util.*;

public class ReusableMethod {


    public static Map<Integer, String> mapOlustur() {
        Map<Integer, String> sinifMap = new HashMap<>();

        sinifMap.put(101, "Ali, Can, JDev");
        sinifMap.put(102, "Enes, Cem, Tester");
        sinifMap.put(103, "Taha, Emre, JDev");
        sinifMap.put(104, "Derya, Deniz, Tester");
        sinifMap.put(105, "Ali, Can, DevOPS");
        sinifMap.put(106, "Enes, Cem, Tester");
        sinifMap.put(107, "Taha, Emre, JDev");


        return sinifMap;
    }


    public static void tumValueSiraliYazdir(Map<Integer, String> ogrenciMap) {

        int sira = 1;
        for (String each : ogrenciMap.values()
        ) {
            System.out.println(sira + "- " + each);
            sira++;
        }
    }

    public static List<String> isimSoyIsimListesiOlustur(Map<Integer, String> ogrenciMap) {

        String[] eachArr;
        List<String> methoddakiList = new ArrayList<String>();
        for (String each : ogrenciMap.values()
        ) {
            eachArr = each.split(",");
            methoddakiList.add(eachArr[0] + " " + eachArr[1]);
        }

        return methoddakiList;
    }

    public static void bransOgrenciSayisiYazdir(Map<Integer, String> sinifListMap) {

        // brans = bransdakiOgrenciSayisi


        Map<String, Integer> bransOgrSayiMap = new TreeMap<>(); // sirali vermesini istiyorsak treemap yapalim
        // oncce bu value lari collectiona atiyoruz

        Collection<String> valuesCollection = sinifListMap.values();
        // sinif listesindeki tum value'lari aldik
        // simdi tek tek branslarini alacagiz. foreach ile aliriz


        String[] valueArr;// Collection'dan value'lari almamiz icin bir array olustururuz
        String brans;    // brans degerlerini almamiz icin bir array olustururuz
        Integer brandakiOgrenciSayisi;
        for (String each : valuesCollection
        ) {
            valueArr = each.split(", ");
            brans = valueArr[2]; // value'lerdeki 2. index brans oldugu icin

            // bransin bransOgrSayiMap'inde key olarak daha onceden eklenip eklenmedigini
            // kontrol etmeliyiz


            if (!bransOgrSayiMap.containsKey(brans)) {// bu map benim bransimi icermiyorsa ekle
                bransOgrSayiMap.put(brans, 1); // brans map'de icermiyorsa ekle ve 1 olarak degerini atadi
            } else {
                // o brans daha once varsaa onun value'sunu bir arttiririz
                brandakiOgrenciSayisi = bransOgrSayiMap.get(brans);
                bransOgrSayiMap.put(brans, brandakiOgrenciSayisi + 1);
            }

        }

        System.out.println(bransOgrSayiMap);


    }

    public static void entryYazdir(Map<Integer, String> sinifListMap) {

        Set<Map.Entry<Integer, String>> sinifListEntrySeti = sinifListMap.entrySet();

        for (Map.Entry<Integer, String> entry: sinifListEntrySeti
             ) {
            System.out.println(entry);
        }
    }
}
