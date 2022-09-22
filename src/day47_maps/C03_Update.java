package day47_maps;

import day46_maps.ReusableMethod;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C03_Update {
    public static void main(String[] args) {
        /*
        map.contains(key) ==> verdigimiz key'in map'de olup olmadigini boolean olarak doner
        map.contains(value) ==> bir butun olarak valuenun map'de olup olmadigini doner

        ONEMLI NOT = map.contains(value) value'nun icindeki bir parcayi bulmada ise yaramaz
                     eger value icindeki bir parcayi aratmak istiyorsak
                     map uzerinde manupulation yapmamiz lazim
        map.get(key) ==> verilen key'e ait degeri erir
         */

        Map<Integer, String> sinifListMap = ReusableMethod.mapOlustur();
        System.out.println(sinifListMap);
        //{101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev,
        // 104=Derya, Deniz, Tester, 105=Ali, Can, DevOPS, 106=Enes, Cem, Tester, 107=Taha, Emre, JDev}
        System.out.println(sinifListMap.containsKey(104)); // true
        System.out.println(sinifListMap.containsKey(114)); // false

        System.out.println(sinifListMap.containsValue("Ali, Can, JDev")); // true

        System.out.println(sinifListMap.containsValue("JDev")); // false

        // Verilen Jdev degerlerini JavaDeveloper olarak degistirelim
        // Map'lerde replace() method'u tum value'yu degistirmek istiyorsak kullanabiliriz
        // kismi degisikliklerde kullanamayiz

        Collection<String> valueCollection = sinifListMap.values();

        for (String each : valueCollection
        ) {
            each = each.replace("JDev", "JavaDeveloper");
            System.out.println(each);
            //Ali, Can, JavaDeveloper
            //Enes, Cem, Tester
            //Taha, Emre, JavaDeveloper
            //Derya, Deniz, Tester
            //Ali, Can, DevOPS
            //Enes, Cem, Tester
            //Taha, Emre, JavaDeveloper
        }

        ReusableMethod.tumValueSiraliYazdir(sinifListMap);
        // map'i tekrar yazdigimizda degismemis olur cunku atamayi loop'un icinde yapildi ve disarida gecersiz olur

        // map'i guncelleme yapmak icin key, yeniDeger'i map'a eklemeliyiz
        // ornegin key 101 icin value
        // guncelleme icin sinifListMap.put(101,"Ali, Can, JavaDeveloper") yapmaliyiz
        // bunu yapabilmek icin herbir key'a ve ona ait value'ya ihtiyacim var

        Set<Integer> keySeti = sinifListMap.keySet();
        // key'ler unique oldugu icin Set bunun icin bicilmis kaftan
        String eachValue;
        for (Integer each : keySeti) {
            eachValue = sinifListMap.get(each);
            eachValue = eachValue.replace("JDev", "JavaDeveloper");
            sinifListMap.put(each, eachValue);
            /*
            Biz key'larin tamamini aldik herbir key'in value'sini getirdik
            value uzernde degisikligi yapip yeni halini put(key, yeniDeger) ile map'a koyduk
             */
        }
        System.out.println(sinifListMap);
        // {101=Ali, Can, JavaDeveloper, 102=Enes, Cem, Tester, 103=Taha, Emre, JavaDeveloper,
        // 104=Derya, Deniz, Tester, 105=Ali, Can, DevOPS, 106=Enes, Cem, Tester, 107=Taha, Emre, JavaDeveloper}


    }

}
