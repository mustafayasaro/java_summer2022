package day42_abstractClass_Interface;

public interface I03_Interface {

    int SAYI = 20;
    /*
    int sayi;
    Interface'lerde tum variable'lar public,static ve final'dir
    dolayisiyla sonradan deger atama sansimiz yoktur
    Bunun icin variable olusturdugumuzda mutlaka deger atamaliyiz

    Bir interface bir concree class'i parent edinemez
     */

    void yakit();

    /*
    Interface icerisindeki her method
    public, abstract ozelliklerine sahiptir

    abstract bir method'un body'si olmasi mumkun degildir
    Java sonradan developer'larin istegi  uzerine kismi bir
    update yapmistir

    Bir interface'e sonradan abstract method eklerseniz
    o interface'i daha once impelement etmis tum class'lara gidip
    hepsinde yeni eklenen method'u override etmek zorundadir
    Bu da buyuk ve eskiden gelen projeler icin cok zor bir islemdir

    Bunun icin Java Java8'den itibaren
    interface'lere sonradan body'si olan method eklemesine izin vermisdir

    Bu method'lari body'si olsa da interface'in yapisi geregi
    bu method'lara concrete method denmez
    body'si olan bu method'lar istisna olarak kabul edilebilir
     */
    public void motor();

    public abstract void teker();

    public static void aku() {

    }

}
