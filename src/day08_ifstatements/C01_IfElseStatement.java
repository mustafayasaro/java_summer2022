package day08_ifstatements;

import java.util.Scanner;

public class C01_IfElseStatement {
    public static void main(String[] args) {


        /*
        Kullaniciadan gun ismi isteyin
        Girilen isim gecerli bir gun ismi ise gun isminin 1., 2. ve 3. harflerini
        ilk harf buyuk diger ikisi kucuk olarak yazdirin
        gun ismi gecerli degilse  "Gecerli bir gun ismi giriniz" yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gun = scan.next().toLowerCase();

        if (gun.equals("pazartesi")) {
            System.out.println("Paz");
        } else if (gun.equals("sali")) {
            System.out.println("Sal");
        } else if (gun.equals("carsamba")) {
            System.out.println("Car");
        } else if (gun.equals("persembe")) {
            System.out.println("Per");
        } else if (gun.equals("cuma")) {
            System.out.println("Cum");
        } else if (gun.equals("cumartesi")) {
            System.out.println("Cum");
        } else if (gun.equals("pazar")) {
            System.out.println("Paz");
        } else {
            System.out.println("Gecerli bir gun ismi giriniz");
        }


    }
}
