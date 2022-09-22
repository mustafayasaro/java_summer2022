package day47_maps;

import day46_maps.ReusableMethod;

import java.util.Map;
import java.util.Set;

public class C04_Entry {

    public static void main(String[] args) {

        /*
        Java Entry<Key,Value> map'in icerisinde bulunan herbir kaydi
        Key= Value seklide tutar
        dolayisiyla herhangi bir Entry'e ulastigimizda
        hem key'a hem de value'ya ulasabilir  ve istedigimiz islemleri yapabiliriz

        entry.getKey()  == > bize key'i getirir
        entry.getValue() == > bize value'yu getirir
        entry.setValue() =>> bize
         */

        Map<Integer, String> sinifListMap = ReusableMethod.mapOlustur();

        System.out.println(sinifListMap);

        // herbir elemni alt alta yazdir
        Set<Map.Entry<Integer, String>> sinifEntrySet = sinifListMap.entrySet();

        for (Map.Entry<Integer, String> each: sinifEntrySet
             ) {
            System.out.println(each);
            //101=Ali, Can, JDev
            //102=Enes, Cem, Tester
            //103=Taha, Emre, JDev
            //104=Derya, Deniz, Tester
            //105=Ali, Can, DevOPS
            //106=Enes, Cem, Tester
            //107=Taha, Emre, JDev
        }
        //  map'in tum elemanlarinda Tester varsa  ismini QA olarak degistirelim
        String eachValue;
        for (Map.Entry<Integer, String> each: sinifEntrySet
             ) {
            eachValue = each.getValue();
            eachValue = eachValue.replace("Tester", "QA");
            each.setValue(eachValue);
        }
        System.out.println(sinifListMap);
        // {101=Ali, Can, JDev, 102=Enes, Cem, QA, 103=Taha, Emre, JDev,
        // 104=Derya, Deniz, QA, 105=Ali, Can, DevOPS, 106=Enes, Cem, QA, 107=Taha, Emre, JDev}


    }
}
