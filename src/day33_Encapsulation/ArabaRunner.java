package day33_Encapsulation;

public class ArabaRunner {

    public static void main(String[] args) {
        Araba arb1 = new Araba();
        // arb1 objesi uzerinde marka variable'ina
        // ulasabildim, degistirebildim(set) ve yazdirabildim(get)
        arb1.marka ="Toyota";
        System.out.println(arb1.marka); // Toyota

        // access modifier kkullanarak marka variable'ina ulasimini
        // tamamen sertbest yapabilir veya tamamen engelleyebilirim
        // private yaptigimiz model variable'a ulasamayiz
        // yani access modifier ya hep ya hic diyor

        /*
        marka'yi degistirelim ama goremeyelim
        yakiti'da gorelim ama degistiremeyelim
         */

        /*
         set ve get yetkilerini ozel olarak tanimlamak isterseniz
         1. adim : ozel yetki tanimlayacaginiz variable'lari private yapin
                   private yaptigimiz datalara baska class'lardan ulasmak  mumkun olmadigindan
         2. adim : set yetkisi icin set, get yetkisi icin get method'u olusturalim
         */
        arb1.setModel("Supra"); // model olarak supra'yi atadik
        // model'i yazdirma imkanimiz yok, cunku getter method'u yok
        System.out.println(arb1.getYakit()); // elektrikli bilgisimi yazdirdik
        // yakiti degistiremeyiz cunku setter method'u yok.
        // Elektrikli



    }
}
