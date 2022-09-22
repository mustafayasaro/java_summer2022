package day35_InheritancedaConstructorKullanimi;

public class AGrandParent {

    protected String isim = "Grandpa ismi belirtilmedi";
    /*-
    Her class'da gorunmese bile bir constructor vardir
    Bu class'dan obje olusturmak istedigimizde
    default constructor devreye girecektir

    Default constructor'u gozlemleyemeyecegimiz icin
    onun yerine kullanilabilecek parametresiz constructor olusturalim
    */

    protected String grandPaKlupAdi = "GrandPa klubu";
    AGrandParent() {
        System.out.println("Grandpa constructor calisti");
    }


}
