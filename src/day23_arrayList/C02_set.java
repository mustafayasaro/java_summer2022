package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_set {

    public static void main(String[] args) {

        /*
        elimizde urunlerin bulundugu bir liste var
        urun listesindeki istenen siradaki urunu
        istedigimiz yeni urunle degistirip
        eski urunu varolan eski urunler listesine ekleyelim
         */

        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");


        List<String> eskiUrunler = new ArrayList<>();

        /*
        Listediki ikramin yerine biskrem koyalim
        ikrami da eski urunler listesine ekleyelim
         */

        String yeniUrun = "Biskrem";
        String silinecekUrun = "Ikram";

        int temp = urunler.indexOf(silinecekUrun);
        String silinenUrun = urunler.set(temp, yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("Urunler listesi : " + urunler); // Urunler listesi : [Nutella, Biskrem, Cekirdek, Cay]
        System.out.println("Eski urunler listesi : " + eskiUrunler); // Eski urunler listesi : [Ikram]


        yeniUrun = "Kahve";
        silinecekUrun = "Cay";

        temp = urunler.indexOf(silinecekUrun);
        silinenUrun = urunler.set(temp, yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("Urunler listesi : " + urunler); // Urunler listesi : [Nutella, Biskrem, Cekirdek, Kahve]
        System.out.println("Eski urunler listesi : " + eskiUrunler); // Eski urunler listesi : [Ikram, Cay]


        yeniUrun = "Findik";
        silinecekUrun = "Cekirdek";

        temp = urunler.indexOf(silinecekUrun);
        silinenUrun = urunler.set(temp, yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("Urunler listesi : " + urunler); // Urunler listesi : [Nutella, Biskrem, Findik, Kahve]
        System.out.println("Eski urunler listesi : " + eskiUrunler); //Eski urunler listesi : [Ikram, Cay, Cekirdek]


    }
}
