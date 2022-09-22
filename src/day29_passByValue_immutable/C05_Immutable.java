package day29_passByValue_immutable;

public class C05_Immutable {

    public static void main(String[] args) {

        String isim = "Mine";

        /*
        ismi buyuk harfe cevirip kalici hale getirmek istiyorum
         */

        isim = isim.toUpperCase();
        System.out.println(isim); // MİNE

        isim = "Mevlut";

        System.out.println(isim); // Mevlut

        for (int i = 0; i < 100; i++) {
            isim+=".";
        }
        System.out.println(isim); // Mevlut.........


    }
}
