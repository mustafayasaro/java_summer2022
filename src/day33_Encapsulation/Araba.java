package day33_Encapsulation;

public class Araba {
     /*
        Encapsulation iki adimda yapilir
        1 class uyeleri private yapilir
        2 daha sonra set ve get methodlari olusturulur
         */

    String marka = "Marka belirtilmedi";
    // access modifier'i yazmadigimiz icin default'dur

    private String model = "Model belirtilmedi";
    private String yakit = "Elektrikli"; // Tum arabalar elektrikli ise bu variable'in
                                         // degistirilmemesi lazim
    // private yaptigimiz model ve yakit  variable'larina erisim yetkilendirelim
    //marka'yi degistirelim ama goremeyelim(setter)
    //yakiti'da gorelim ama degistiremeyelim(getter)

    public String getYakit() { // degistiremeyiz, yazdirabiliriz
        return yakit;
    }

    public void setModel(String model) {// degistirebiliriz
        this.model = model;
    }
}
