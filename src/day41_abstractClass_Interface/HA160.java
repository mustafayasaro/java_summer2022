package day41_abstractClass_Interface;

import java.util.ArrayList;
import java.util.List;

public class HA160 extends FMercedes{

    /*
    Abstract parent silsilesinden gelen ilk concrete class
    Parent'i olan tum class'lardaki abstract method'lari
    concrete hale donusturmek (override) zorundadir

    Bu kuralin istisnasi
    parent clas'lardan her hangi birinde
    concrete hale donusturulmus
    abstract method'lardir
     */

    public static void main(String[] args) {
        HA160 arb1 = new HA160();
        // concrete bir class'dan istedigimiz objeyi uretebiliriz

        FMercedes arb2 = new FMercedes();
        // mercedes'de concrete oldugu icin obje uretebildik

        // EToyota arb3 = new EToyota(); // EToyota' is abstract; cannot be instantiated
        // Abstract class'lar constructor barindirir ama obje uretemezler
        // Toyota class'i abstract class'i oldugundan obje uretilemez

        /*
        List<String> list1 = new List<String>(); // altini cizer cunku list abstract
        List<String> list2 = new ArrayList<>();

        Abstract bir class'in ozelliklerini tasiyan bir obje olusturmak istedigimizde
        Data turunu istedigimiz abstract class'dan,
        constructor'u ise child'i olan concrete bir class'dan seceriz

        */









    }

}
