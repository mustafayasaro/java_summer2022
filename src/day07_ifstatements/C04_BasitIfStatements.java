package day07_ifstatements;

import java.util.*;

public class C04_BasitIfStatements {

    public static void main(String[] args) {

        /*
        Kullanicidan bir gun isnimi isteyin  ve hafta ici mi hafta sonu mu olup olmadigini kontrol edin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");

        String gun = scan.next().toLowerCase();


        if (gun.equals("cumartesi") || gun.equals("pazar")) {
            System.out.println("Hafta sonu");
        }

        if (gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") ||
                gun.equals("persembe") || gun.equals("cuma")) {
            System.out.println("Hafta ici");
        }

        if (!(gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") ||
                gun.equals("persembe") || gun.equals("cuma") ||
                 gun.equals("cumartesi") || gun.equals("pazar"))){
            System.out.println("Lutfen gecerli bir gun ismi giriniz");
            }

    }
}
