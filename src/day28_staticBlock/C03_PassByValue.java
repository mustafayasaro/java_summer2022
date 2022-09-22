package day28_staticBlock;

public class C03_PassByValue {

    public static void main(String[] args) {

        double satisFiyati = 100;
        double indirimOrani = 0.25;
        /*
        %25 indirimli fiyati hesaplayip bize donduren bir method olusturun
         */
        /*
        java da program yaparken genelde main methodda kullandığımız variable ismi
        ne ise kodu rahat takip edebilmek icin constructor'da da method'da da aynı ismi kullanmayı tercih ederiz
        yani burada satisFiyati ismini kullandiysam, asağıda da satisFiyati ismini kullanmayi tercih ederiz
        ama scope diye bir konu gördük herkesin variable'ı kendine dedik
        yukarıdaki satisFiyatini yeni bir variable olusturmadan asağıda kullanamayiz.
        bir tane main methodun scope u var local scope 1 diyelim
        bir tane de method scope u var local scope2 diyelim
        biz programı calıstırırken sürekli scope lar arasında hareket ederiz,
        neden cunku main methodlar bizim robotlarımızdı
        sürekli bizim adımıza bazı islemleri yaparlardı.
        100 tl ye yaptığınız indirimde birinci müsteri 90 a ikinci 80 a 3. 70 e alırsa olmaz
        benim her müsteri icin indirimli fiyatim 90 dır
        yani ilk scope'taki satıs fiyati ikinci scope icin gecerli değildir.
        ayni scope ta aynı isimde iki variable olusturulamaz
        data türü farklı olsa bile aynı isimde iki variable olusturulamaz
        farklı scopelar'da olusturulabilir.
         */
        double indirimliFiyat = indirimliFiyatHesapla(satisFiyati, indirimOrani);
        System.out.println(indirimliFiyat);  // 75.0
    }
    public static double indirimliFiyatHesapla(double satisFiyati, double indirimOrani) {
        double indirimliFiyat = satisFiyati - (satisFiyati * indirimOrani);
        return indirimliFiyat;
    }


}
