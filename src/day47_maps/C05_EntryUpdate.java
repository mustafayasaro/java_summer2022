package day47_maps;

import day46_maps.ReusableMethod;

import java.util.Map;
import java.util.Set;

public class C05_EntryUpdate {
    public static void main(String[] args) {

        // soyismi can olanlarin bransini data science yapalim

        Map<Integer, String> sinifListMap = ReusableMethod.mapOlustur();

        // entry'leri alalim

        Set<Map.Entry<Integer, String>> entrySeti = sinifListMap.entrySet();

        // array olmadan can icerio icernmedigini bilelmem
        String entryValue;
        String[] entryArr;
        for (Map.Entry<Integer, String> entry : entrySeti) {
            entryValue = entry.getValue();
            entryArr = entryValue.split(", "); // virgulle parcalayip array yaptim

            if(entryArr[1].equals("Can")){ // soyismi can olanlarin bransini DataScience yaptik
                entryArr[2] = "DataScience";
                entry.setValue(entryArr[0] + ", " + entryArr[1] + ", " + entryArr[2]);
            }

        }

        System.out.println(sinifListMap);
        //{101=Ali, Can, DataScience, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev,
        //104=Derya, Deniz, Tester, 105=Ali, Can, DataScience, 106=Enes, Cem, Tester, 107=Taha, Emre, JDev}
    }
}
