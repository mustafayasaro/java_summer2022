package day26_constructor;

public class Kamyon {

    public String marka = "Marka belirtilmedi";
    public String model = "Model belirtilmed";
    public int yil;
    public int fiyat;

    public Kamyon(String marka, String model, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;
    }
    /*
    Bizim temel amacimiz KamyonRunner'da argument olarak girilen degerin
    Kamyon class'inda instance variable'a atanmasi
    Ancak scope konusunda ogrendigimiz gibi
    Kamyon constructor scope'unda marka oldugu icin
    instance marka'ya gider

    Bu karisikligi gidermek icin instance variable'lari
    belirli hale getirmemiz lazim
    Java bunun icin this keyword'u olusturmustur.

    this.marka ==  bu classin marka variable'i demek
    yani >>
    this.marka = marka;  bu classin marka instance variable'ini parametre olarak gelen
                         marka degerine assign et demektir

    Genel kullanim acisindan this keyword'u kodu herkesin anlamasini kolaylastirdigi icin tercih edilir

     */

    @Override
    public String toString() {
        return
                "\n marka=" + marka +
                        "\n model=" + model +
                        "\n yil=" + yil +
                        "\n fiyat=" + fiyat;

    }

    public Kamyon(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public Kamyon() {

    }
}
