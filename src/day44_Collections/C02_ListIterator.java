package day44_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C02_ListIterator {
    public static void main(String[] args) {

            // Soru 4) Bir listedeki elementleri iterator kullanarak
            // sondan basa dogru yazdirin

        List<Integer> liste =new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);
            // sondan basa gelebilmek icin
            // once sona gitmek lazim

        ListIterator li1= liste.listIterator(); // liste adli list iterator yapildi
        System.out.println(liste); // [2, 13, 56, 23, 45, 14, 40]

        while(li1.hasNext()){// ileride eleman oldugu muddetce
            li1.next();      // yana gec
            }// bu loop bizi sona goturur

        while(li1.hasPrevious()){ //  hasPrevious() > bir onceki yerde element var mi
                                                     // var oldugu surece calis
            System.out.print(li1.previous()+ " ");
        }


            /*
            set(kume)--> benzersiz kumeler gibi unique
            Queue--> yemekhane kuyrugu gibi dusunulebilir. gelen sona eklenir, giden bastan gider
            linked (Halay)-->  birbirine bagli> ilk sirada head vardir kendisi bir deger tutmaz
                                                sadece bir sonraki elemanin referansini tutar
                                                bu eleman ise bir deger ve bir sonraki elemanin referansini tutar
                                                son eleman ise bir deger ve null tutar
                                                Her eleman ise node olarak adlandirilir
                                                Eleman aramada cok yavastir ama
                                                yeni bir eleman ekleme ve cikarmada cok hizlidir
            Tree (Agac gibi)--> dogal sirali ozel  sorltlanmis gibi, veya isim sirali halay
            hash (hizli) --> ozel raf adi sayesinde hizli erisim
                             hash oldugu icin hizlidir
                             set oldugu icin unique elemanlardan olusur


             */
    }
}
