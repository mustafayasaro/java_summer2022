package day28_staticBlock;

public class C01StaticBlock {
    static int sayi;

    static {
        /*
        static block class uyelerinin tamamindan once calisir(main method'dan bile once calisir)

        static block class olusturuldugunda calisir genelikle de class ile ilgili
        on ayarlamalar veya static variable'lara deger atamak icin kullanilir

        static block'larin clas sicerisinde nerede oldugu onemmli degildir
        once statick block'lar calisir

        birden fazla static block varsa yukaridan asagiya dogru calisir
         */
        System.out.println("static block calisti");
        sayi = 10;
    }

    public static void main(String[] args) {
        System.out.println("main method calisti");
        System.out.println(sayi); // 0
    }

    static {
        System.out.println("main metod altindaki static block calisti");
    }

}
