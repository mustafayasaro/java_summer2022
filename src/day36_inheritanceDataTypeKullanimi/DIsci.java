package day36_inheritanceDataTypeKullanimi;

public class DIsci extends BMuhasebe {

    protected int saatUcreti = 11;
    protected int gunlukMesai = 7;
    protected void maasIsci() {
        System.out.println("Isciler : "+(30*saatUcreti*gunlukMesai) + " maas alir");
    }
    protected void ozelSigortaIsci(){

        System.out.println("Isciler %70 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {

        APersonel personel = new BMuhasebe();
       // System.out.println(personel.gunlukMesai); //personel classinda tok CTE verir
       // System.out.println(personel.saatUcreti); // personel classinda tok CTE verir
        personel.maas(); // personel class'indan alir;; rum personeller maas alir
        // personel.ozelSigorta(); //personel classinda tok CTE verir
        personel.sigorta(); // Personel classindan  -- tum personelimize sigorta yapilir
        System.out.println(personel.isim); // Personel classindan  -- isim belirtilmedi
        System.out.println(personel.soyIsim); // Personel classindan  -- soyisim belirtilmedi
        System.out.println(personel.departman); // Personel classindan  -- soyisim belirtilmedi


        BMuhasebe isc1  = new DIsci(); // Ozelliklere BMuhasebe class'indan bakacaz
        /*
        Bir obje olusturulurken data turu ve constructor ayni class'dan ise
        direkt o class'a gidiyorduk

        Eger data turu ve constructor farkli ise burada iki farkli durum var
        Obje constructor'un oldugu class'in objesidir ancack bizden istenen
        Isci class'indaki spesifik ozellikler degil
        Bir iscinin muhasebe class'indaki tum classlarla beraber sahip oldugu
        genel ozellikleri yazdiririz
            */

        System.out.println(isc1.gunlukMesai); // 8
        System.out.println(isc1.saatUcreti); // 10
        isc1.maas(); // Muhasebe classindan  -- personel minimum : 2400 maas alir
        isc1.ozelSigorta(); // Muhasebe classindan  -- isteyen calisanlara %50 indirimli ozel sigorta yapilir
        isc1.sigorta(); // Personel classindan  -- tum personelimize sigorta yapilir
        System.out.println(isc1.isim); // Personel classindan  -- isim belirtilmedi
        System.out.println(isc1.soyIsim); // Personel classindan  -- soyisim belirtilmedi
        System.out.println(isc1.departman); // Personel classindan  -- departman belirtilmedi

        APersonel isc2 = new APersonel();
        // System.out.println(isc2.gunlukMesai); // Personel class'inda oyle bir ozellik yok
        // System.out.println(isc2.saatUcreti); // Personel class'inda oyle bir ozellik yok
        // isc2.ozelSigorta(); // Personel class'inda oyle bir ozellik yok
        isc2.maas(); // muhasebe classindan -- personel minimum : 2400 maas alir
        isc2.sigorta(); // Personel classindan  -- tum personelimize sigorta yapilir
        System.out.println(isc2.isim); // Personel classindan  -- isim belirtilmedi
        System.out.println(isc2.soyIsim); // Personel classindan  -- soyisim belirtilmedi
        System.out.println(isc2.departman); // Personel classindan  -- departman belirtilmedi


        /*
        Eger data turu olan class'da aradigimiz ozellik yoksa
        onun parent'ina gidebilir ama child'a donus omaz
        Aradigi ozelligi bulamazsa CTE verir
         */






    }
























}
