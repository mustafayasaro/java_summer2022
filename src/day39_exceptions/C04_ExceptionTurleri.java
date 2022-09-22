package day39_exceptions;

public class C04_ExceptionTurleri {

    public static void main(String[] args) throws InterruptedException {

        String str;

        /*
        System.out.println(str);
        deger atamasi yapmadan bir variable'i kullanmaya calisirsaniz
        Jaca Compile Time'da bunu farkeder ve size izin vermez
         */

        str = null;
        // System.out.println(str.length());
        // NullPointerException verir >> Run time Exception'dir

        Object obj = "Java Java Java";
        Integer sayi = (int)obj; // Stringi direkt atayamayiz Java direkt uyanir

        /*
        String str2 = "Java Java Java";
        Integer sayi = (int)obj;
        Java bazi casting islemlerine compile time'da izin vermez
        ClassCastException  verir

        Ancak bazen syntax uygun olabilir
        bu durumda Java kodun calismasina itiraz etmez
         */

        Thread.sleep(5000); // 5 saniye bekliyor
        // throws InterruptedException > main methodun yanina ekledik

    }
}
