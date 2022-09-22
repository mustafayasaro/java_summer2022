package day47_maps;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class C02_TekrarSayisiBulma {
    public static void main(String[] args) {

        String str = "Heeeeellllooooo Woooorrrrllllllddddd.";

        String[] harflerArr = str.replaceAll("\\W", "").split("");

        System.out.println(Arrays.toString(harflerArr));
        // [H, e, e, e, e, e, l, l, l, l, o, o, o, o, o, W, o, o, o, o, r, r, r, r, l, l, l, l, l, l, d, d, d, d, d]
        // H = 1 e=5 l=10 W=1 o= 9 r=4 d=5   >> beklenen cikti

        // key jharf olan  harfSayisi da value olan bir Map olusturalim

        Map<String, Integer> harfKullanimSayilariMap = new HashMap<>();

        Integer harfKullanimSayisi;

        for (String each : harflerArr
        ) {
            // harkKullanimSayilariMap  "H" var mi yok mu diye once kontrol ederiz
            if (!harfKullanimSayilariMap.containsKey(each)) {
                harfKullanimSayilariMap.put(each, 1);
            } else {
                harfKullanimSayisi = harfKullanimSayilariMap.get(each); // each olan harfin kac kere kullanildigini getir
                harfKullanimSayilariMap.put(each, harfKullanimSayisi + 1);
            }
        }
        System.out.println(harfKullanimSayilariMap);
       //  {r=4, d=5, e=5, W=1, H=1, l=10, o=9}

    }
}
