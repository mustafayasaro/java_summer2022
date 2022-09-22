package day35_InheritancedaConstructorKullanimi;

public class GToyota {
    GToyota() {
        System.out.println("GToyota parametresiz constructor calisti");
    }

    GToyota(String isim) {
        // super(isim); Bu class'da extends olmadigi icin
        // Jaca super90; constructor call'u kabul etmez
        System.out.println("GToyota parametreli constructor calisti");
    }
}
