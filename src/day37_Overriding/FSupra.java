package day37_Overriding;

public class FSupra extends EToyota{
    @Override
    void yakit(){
        System.out.println("Supra yakit alarak benzin kullanilir");
        /*
        Private override edilemez
        Eger child class'daa parent vlass'daki private method ile
        ayni signature'da bir method olusturursaniz
        bu overriding method OLMAZ

        Mesela bu yakit methodu Araba classindan override ediliyor
        simdi Araba class'ina gidip yakit() method'unu private yaparsak
        Buradaki ok isareti de gider ve @Override notasyonu silinir
         */}
    @Override
    void motor() {
        System.out.println("Sirali 6 silindir 2JZ motor kullanir");
        /*
        Override notasyonu Java'ya bir gorev verir
        Java' bu notasyonla birbirine bagli olan iki method'u
        surekli kontrol eder
        Eger parent class'daki overriden method'u silerseniz
        CTE verir.

        @Override notasyonu kullanmak mecburi degildir
        Eger overriding method method silinirse kodun CTE
        vermesini istersek @Override notasyonu kullanmak zorundayiz'

        Static,final private method'lar override edilemez
         */
    }
}
