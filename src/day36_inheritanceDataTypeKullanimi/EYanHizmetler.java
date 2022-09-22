package day36_inheritanceDataTypeKullanimi;

public class EYanHizmetler extends BMuhasebe {

    protected int saatUcreti = 9;
    protected int gunlukMesai = 8;

    protected void maas() {
        System.out.println("Yan hizmetler : " + (30 * saatUcreti * gunlukMesai) + " maas alir");
    }

    protected void issizlikSigorta() {
        System.out.println("Yan hizmetliler %30 indirimli issizlik sigortasi yaptirabilir");
    }

    public static void main(String[] args) {

        /*
    Overriding child class'daki bir method'un parent class'daki ayni isimdeki mehodu
    etkisiz hale getirerek kendisinin spesifik ozelligini ortaya cikarmasidir
    Variable'larda overriding yoktur.

    Overriding'i nerede dikkate aliyoruz?
    bir obje olusturulurken data turu ve constructor farkli ise.

    Eger bir obje olusturulurken data turu ve constructor farkli ise
    objenin ozelliklerini belirlerken 3 konuya dikkat cekmeliyiz

       BMuhasebe yh1 = new EYanHizmetler();
    1- Obje constructor'un oldugu class'dan olusur - EYanHizmetler();
    2- Objenin ozelliklerini aramaya data turunun oldugu class'dan baslariz
       bu class'da arannan ozellik bulunamazsa parent class'lara bakilir
       orada da bulamazsa CTE verir -- BMuhasebe

       Eger aranan ozellik variable ise buldugumuz ilk degeri yazdiririz
    3- Aranan ozellik method ise degeri yazdirmadan oncce OVERRRIDE edilmi mi
       diye kontrol etmemiz gerekir Eger override edilmisse en guncel degeri yazdiririz`
     */

        BMuhasebe yh1 = new EYanHizmetler();// aramaya Muhasebe classindan baslar

        System.out.println(yh1.gunlukMesai); // 8 -- muhasebe classindan
        System.out.println(yh1.saatUcreti); // 10 -- muhasebe   classindan
        yh1.maas(); // Yan hizmetler classindan  -- Yan hizmetler : 2160 maas alir
        yh1.ozelSigorta(); // Muhasebe classindan  -- isteyen calisanlara %50 indirimli ozel sigorta yapilir
        yh1.sigorta(); // Personel classindan  -- tum personelimize sigorta yapilir
        System.out.println(yh1.isim); // Personel classindan  -- isim belirtilmedi
        System.out.println(yh1.soyIsim); // Personel classindan  -- soyisim belirtilmedi
        System.out.println(yh1.departman); // departman belirtilmedi
       // System.out.println(yh1.issizlikSigorta);
        // aramaya muhasebeden basladigimizdan
        // issizlikSigorta methodunu bulamadik CTE  verir

    }
}
