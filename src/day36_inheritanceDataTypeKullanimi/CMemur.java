package day36_inheritanceDataTypeKullanimi;

import java.util.ArrayList;

public class CMemur extends BMuhasebe {

    protected int saatUcreti = 12;
    protected int gunlukMesai = 9;

    protected void maas() {
        System.out.println("Memurlar : " + (30 * saatUcreti * gunlukMesai) + " maas alir");
    }

    protected void ozelSigorta(){
        System.out.println("Memurlar %60 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {

        CMemur mmr1 = new CMemur();
        System.out.println(mmr1.gunlukMesai); // 9
        System.out.println(mmr1.saatUcreti); // 12
        mmr1.maas(); // Memurlar : 3240 maas alir
        mmr1.ozelSigorta(); // Memurlar %60 indirimli ozel sigorta yaptirabilir
        mmr1.sigorta(); // personeel class'indan alir -- tum personelimize sigorta yapilir
        System.out.println(mmr1.isim); // personeel class'indan alir -- isim belirtilmedi
        System.out.println(mmr1.soyIsim); // personeel class'indan alir -- soyisim belirtilmedi
        System.out.println(mmr1.departman); // personeel class'indan alir -- departman belirtilmedi

        BMuhasebe mhsb1 = new BMuhasebe();
        /*
        Her ne kadar Memur class'inin icinde olsam da olusturdugum obje muhasebe class'indan
        Cunku data turu ve constructor BMuhasebe

        String str = "Murat";
        ArrayList<Integer> list = new ArrayList<Integer>();
        Integer sayi = 20;

        BMuhasebe class'i da obje olusturulabilen bir class'dir. Yani bir data turudur
        Obje olusturdugumuz her class bir data turudur
 */
        System.out.println(mhsb1.gunlukMesai); // 8  -- bunu muhasebeden aldi
        System.out.println(mhsb1.saatUcreti); // 10  -- bunu muhasebeden aldi
        mhsb1.maas(); // Calisanlar : 3240 maas alir  -- bunu muhasebeden aldi
        mhsb1.ozelSigorta(); // isteyen calisanlara %50 indirimli ozel sigorta yaptirabilir -- bunu muhasebeden aldi
        mhsb1.sigorta(); // personeel class'indan alir -- tum personelimize sigorta yapilir
        System.out.println(mhsb1.isim); // personeel class'indan alir -- isim belirtilmedi
        System.out.println(mhsb1.soyIsim); // personeel class'indan alir -- soyisim belirtilmedi
        System.out.println(mhsb1.departman); // personeel class'indan alir -- departman belirtilmedi





























    }

}
