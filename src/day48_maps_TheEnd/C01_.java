package day48_maps_TheEnd;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_ {

    public static void main(String[] args) {



        /*
        Eger bir elementle ilgili tutacagimiz bilgiler coksa veya komplex ise
        bu defa ic ice map kullanmayi tercih edebiliriz

        ic ice map kullandigimizdad daha fazla data'yi
        daha duzenli olarak tutma imkanimiz olut
        Ancak, bilgiye ulasmak ve manuple etmek zorlasakcaktir

        Ornek olarak dunku map'imizi map'lerden olusan bir map olarak olusturalim
        sinifMap.put(105, "Ali, Can, DevOPS");
        sinifMap.put(103, "Taha, Emre, JDev");
        sinifMap.put(104, "Derya, Deniz, Tester");

       */

        Map<String, String> ogr101 = new HashMap<>();
        ogr101.put("isim", "Enes");
        ogr101.put("soyisim", "Cem");
        ogr101.put("brans", "Tester");

        Map<String, String> ogr102 = new HashMap<>();
        ogr102.put("isim", "Taha");
        ogr102.put("soyisim", "Emre");
        ogr102.put("brans", "JDev");

        Map<String, String> ogr103 = new HashMap<>();
        ogr103.put("isim", "Derya");
        ogr103.put("soyisim", "Deniz");
        ogr103.put("brans", "Devops");


        Map<Integer, Map<String, String>> ogrenciNestedMap = new HashMap<>();
        ogrenciNestedMap.put(101, ogr101);
        ogrenciNestedMap.put(102, ogr102);
        ogrenciNestedMap.put(103, ogr103);

        Set<Map.Entry<Integer,Map<String,String>>> ogrenciEntrySeti= ogrenciNestedMap.entrySet();

        for (Map.Entry each: ogrenciEntrySeti
             ) {
            System.out.println(each);
        }
        // 101={soyisim=Cem, brans=Tester, isim=Enes}
        //102={soyisim=Emre, brans=JDev, isim=Taha}
        //103={soyisim=Deniz, brans=Devops, isim=Derya}
        // map in nasil dondurecegini garanti edemeyeiz
        // biz isim soyisim brans seklinde bekliyorduk
        //Eger 102 nolu kisinin ismine ulasmak istiyorsak

        ogrenciNestedMap.get(102); // burasi 102 nolu map'i getirir. buradan da isime ulasabiliriz

        System.out.println(ogrenciNestedMap.get(102).get("isim"));



    }
}
