package day15_Overloading_ForLoop;

public class C02_Overloading {


    public static void main(String[] args) {
        /*
           Java'da olusturdugumuz methodlarin isminin yaptigi isler ile uyummlu olmasini isteriz
        mesela bir String'i bir bolumu almak icin Java 2 adet substring() method'u veya
        verilen String'deki bazi parcalari  yenileri ile degistirmek icin
        2 adet replace() methodu vardir.

        Java ayni isimde birden fazla method varsa hangisinin kullanilacagina parametre sayisi
        ve parametrelerin data turune gore karar verir
         */
        /*
                         >>>>>>>> Overloading <<<<<<<<<<
                Eger bir classda ismi ayni fakat parametreleri
                farkli olan methodlar olusturursak buna Overloadin denir
         */
        /*
                        >>>>>>>> Method Signature <<<<<<<<<
                Java ayni isim ve ayni parametrelerle birden fazla method olusturulmasina izin vermez.
                Ayni isimle birden fazla method olusturmak isterseniz.
                METHOD SIGNATURE(METHOD IMZASI) 'nin degistirilmesi gerekir.
         */
        String str = "Bu Java ogrenilecek, baska yolu yok";
        str.substring(2,4);
        str.substring(2);
        str.replace('c', 'v');
        str.replace("J", "H");



        /*
        Ayni isimde ama farkli method'lari  olusturmak icin
        degistirebilescegimiz seyler
        1) parametre sayisi
        2) ayni sayida parametreye sahip olsa bile, parametrelerin data turleri
        3) ayni sayida ve ayni data turunde parametreleri olan methodlarda
           parametrelerin siralamasi
         */


    }
}
