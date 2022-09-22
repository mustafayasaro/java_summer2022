package day37_Overriding;

public class C01_Overloading {

    public static void main(String[] args) {

        /*
        1-parametre sayisi
        2-ayni sayida parametreye sahip olsa bile.parametrelerin data turleri
        3-ayni sayida ve ayni data turunde parametreleri olan methodlarda parametrelerin siralanisi
         */
        /*
        Bir class'da ayni isimde ve ayni signature sahip iki method olmaz
        Ayni class'da ayni isimde birden fazla method olusturmak istersek
        mutlaka signutare'i degistirmeliyiz.

        Farkli class'larda ayni isim ve ve signature'ye sahip iki method olabilir mi?
        Evet
         */
    }
    void ekleme(){

    }
    void ekleme(int sayi){

    }
    void ekleme(String str){

    }
    void ekleme(String str,int sayi){

    }
    void ekleme(int sayi, String str){

    }
}
