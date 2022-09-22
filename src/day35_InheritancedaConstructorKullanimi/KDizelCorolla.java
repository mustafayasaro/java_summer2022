package day35_InheritancedaConstructorKullanimi;

public class KDizelCorolla extends HCorolla {
    KDizelCorolla() {

        System.out.println("KDizel parametresiz constructor calisti");
    }
    KDizelCorolla(String isim) {
        super(isim);
        System.out.println("KDizel parametreli constructor calisti");
    }
    public static void main(String[] args) {

        KDizelCorolla obj1 = new KDizelCorolla();

        /*
        GToyota parametresiz constructor calisti
        HCorolla parametresiz constructor calisti
        KDizel parametresiz constructor calisti
         */
        KDizelCorolla obj2 = new KDizelCorolla("Beyaz");
         /*
         GToyota parametreli constructor calisti
         HCorolla parametreli constructor calisti
         KDizel parametreli constructor calisti
          */
    }
}
