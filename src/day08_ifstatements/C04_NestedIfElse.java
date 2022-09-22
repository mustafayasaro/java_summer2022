package day08_ifstatements;

import java.util.Scanner;

public class C04_NestedIfElse {

    public static void main(String[] args) {

        /*
        Kullanicidan 4 basamakli bir sayi isteyin
        Girdigi sayi 5'e bolonuyorsa son rakamini kontrol edin
        Son rakami 0 ise ekrana "5 ile bolunebilen cift sayi"
        Son rakami 0  degilse "5 ile bolunebilen tek sayi "
        Girdigi sayi 5'e bolunemiyorsa ekrana "Tekrar deneyiniz" yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir sayi giriniz");
        int sayi = scan.nextInt();


        if (sayi >= 1000 && sayi < 10000) {
            if (sayi % 5 == 0) {
                if (sayi % 10 == 0) {
                    System.out.println("5 ile bolunebilen cift sayi");
                } else {
                    System.out.println("5 ile bolunebilen tek sayi");
                }
            } else {
                System.out.println("Tekrar deneyiniz");
            }
        } else {
            System.out.println("Lutfen 4 basamakli olan bir sayi giriniz");
        }

    }
}
