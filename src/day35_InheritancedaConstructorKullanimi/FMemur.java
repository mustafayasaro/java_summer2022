package day35_InheritancedaConstructorKullanimi;

public class FMemur extends EMuhasebe {
    /*
    extends keyword kullanilan class'larda ister default constructor bulunsun
    istersek biz yeni constructor(lar) olusturalim Java constructor'in ilk
    satirina super(); constructor call yazar

    super(); constructor call default constructor'a benzer
    gorunmese  de orada vardir ve calisir. Ancak biz ilk satira
    farkli bir constructor call yazarsak, Java super(); 'i  siler
    */
    FMemur() {System.out.println("Memur parametresiz constructor calisti");}
    FMemur(String isim) {
        System.out.println("Memur parametreli constructor calisti");
    }

    public static void main(String[] args) {

        FMemur memur1 = new FMemur();
        /*
        Personel parametresiz constructor calisti
        Muhasebe parametresiz constructor calisti
        Memur parametresiz constructor calisti
         */

        FMemur memur2 = new FMemur("Ali");

        /*
        Eger biz mudahale edip kendi constructor call'umuzu olusturmazsak
        Java'nin default olarak olarak olusturdugu constructor call
        her zaman parametresizdr super(); constructor call
         */
    }

}
