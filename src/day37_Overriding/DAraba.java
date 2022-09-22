package day37_Overriding;

public class DAraba {

    /*
    Overriding tamamen methodlarla ilgilidir
    Variable'da ise buldugun sonucu yazdiririz
     */
    /*
    Parent class'dan override edilmesini istemedigimiz methodlari
    public, static veya final yapabilirsiniz
     */

    void yakit(){
        System.out.println("Tum arabalar yakit kullanilir");
    }

    void marka(){
        System.out.println("Tum arabalarin markasi vardir");
    }
   void motor(){
        System.out.println("Tum arabalarin motoru vardir");
    }



}
