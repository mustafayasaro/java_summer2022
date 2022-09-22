package day14_methodCreation;

import java.util.Scanner;

public class C05_MethodCreationReturn {
    public static void main(String[] args) {
        /*
        Eger bir class'in icerisinde her hangi bir hesaplama yapip
        bunu da kalici olarak saklamak istersek
        kodumuzu sade ve anlasilir tutmak icin
        islemin bir methodda yapip
        sonucunu main metod'a dondurebiliriz
        Return type'i void olmayan bir method'un sonucunu
        main method''da bir variable'a atama yaparsak
        programin geri kalaninda bi yeni degeri kullanma sansimiz olur
         */

        /*
        Kullanicidan sehir ismini ve dogum tarihini alip
        bunlari programda kullanacagimiz formatta
        bize donduren bir method olusturun
        sehir ismmini programimizda buyuk harf olarak
        dogum tarihini ise 2022-06-30 seklinde kullanmak istiyoruz
         */


        String sehir = sehirAl();
        String tarih = tarihAl();
        System.out.println("Girdiginiz sehir : " + sehir);
        System.out.println("Girdiginiz tarih : " + tarih);

    }

    public static String tarihAl() {

        String tarih = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Yil giriniz");
        int yil = scan.nextInt();


        if (yil > 1900 && yil < 2100) {
            tarih = yil + "-";
        } else {
            System.out.println("Yil icin gecerli bir sayi giriniz(1900-2100)");
        }


        System.out.println("Kacinci ay oldugunu tamsayi olarak yazziniz");
        int ay = scan.nextInt();
        if (ay < 1 || ay > 12) {
            System.out.println("Ay no 1-12 araliginda olmalidir");
        } else if (ay < 10) {
            tarih = tarih + "0" + ay + "-";
        } else {
            tarih = tarih + ay + "-";
        }


        System.out.println("Lutfen ayin kacinci gun oldugunu tamsayi olarak giriniz");
        int gun = scan.nextInt();

        if (gun < 1 || gun > 31) {
            System.out.println("Gun no olarak 1-31 arasinda sayi girilmelidir");
        } else if (gun < 10) {
            tarih = tarih + "0" + gun;
        } else {
            tarih = tarih + gun;
        }
        return tarih;


    }

    public static String sehirAl() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasadiginiz sehri giriniz");
        String sehir = scan.nextLine().toUpperCase();
        return sehir;
    }
}
