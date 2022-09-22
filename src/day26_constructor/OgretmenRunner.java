package day26_constructor;

public class OgretmenRunner {
    public static void main(String[] args) {


        Ogretmen ogretmen1 = new Ogretmen();
        System.out.println("ogretmen1 : " + ogretmen1);

        /*
        ogretmen1 :
           isim=Isim belirtilmedi
           soyIsim=Soyisim belirtilmedi
           dogumTarihi=Tarih girilmedi
           brans=Brans belirtilmedi
           yanBrans=Yan brans belirtilmedi
         */



        Ogretmen ogretmen2 = new Ogretmen("Emre", "Akdogan", "1/1/2001", "matematik", "Fizik");
        System.out.println("ogretmen2 : " + ogretmen2);

        /*
        ogretmen2 :
            isim=Emre
            soyIsim=Akdogan
            dogumTarihi=1/1/2001
            brans=matematik
            yanBrans=Fizik
         */



        Ogretmen ogretmen3 = new Ogretmen("Cavidan", "Kabinkara" , "1/1/1991");
        System.out.println("ogretmen3 : " + ogretmen3);

        /*
        ogretmen3 :
          isim=Cavidan
          soyIsim=Kabinkara
          dogumTarihi=1/1/1991
          brans=Brans belirtilmedi
          yanBrans=Yan brans belirtilmedi
         */

    }
}
