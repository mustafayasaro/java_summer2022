package day35_InheritancedaConstructorKullanimi;

public class CChild extends BParent {
    String isim = "Child isim belirtilmedi";
    CChild() {System.out.println("Child constructor calisti");}
    public static void main(String[] args) {
        // AGrandParent gp1 = new AGrandParent();
        // Bu objeyi olusturmak icin GrandPa Constructor calisir
        // Parent ya da Child constructor calismaz

        CChild child1 = new CChild();
        child1.grandPaKlupAdi = "Child1";
        child1.parentKlupAdi = "Child2";
        /*
        Grandpa constructor calisti
        Parent constructor calisti
        Child constructor calisti
         */
        /*
        child1 objesi icin Child constructor calisti
         */
        /*
          Java'da bir class'i kullanabilmek icin
          o class'dan obje olusturur, dolayisiyla
          o class'in constructor'ini kullanirdik

          Java inheritance'da parent class'lardaki ozellikleri kullanabilmek icin
          o class'larin constructor'larini otomatik calistiran bir yapi kurmustur.

          Ornegin biz child class'inda Child class'indan bir obje olusturmak istedigimizde
          Child cons. ini kullaniriz Java Child(){} gordugundeonce parent'in constuctor'ini
          calistirmam lazim der. Buradan Parent cons'a gider. Parent class'inda Parent(){} gorunce
          once bunun parent'inin yani Granparent cons.calismasi gerekir der.Boylece extends keyword
          olmayan class'a kadar gider ve oradan baslayarak tum constructorlari asagi dogru calistirir
         */


    }

}
