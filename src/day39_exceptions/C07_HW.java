package day39_exceptions;

import java.util.Scanner;

public class C07_HW {

    public static void main(String[] args) {

        /*
        String[] str Urun isimlerini tuttugumuz bir array olsun
        Kullanicidan istedigi  urunun sirasini isteyin ve istedigi urunu yazdiin
        Kullanici array'de olan urun sayisindan buyuk bir sira no girerse
        "Girdiginiz sira urun sayisindan buyuk" ayzdirin
         */

        String[] arr = {"Nutella", "Peyniz", "Yumurta", "Zeytin", "Sucuk"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen istediginiz urunun sra numarasini giriniz");
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + "-" + arr[i]);
        }

        try {
            int sira = scan.nextInt();
            System.out.println("istediginiz urun " + arr[sira]);
        } catch (Exception e) {
            System.out.println("Girdiginiz sira urun sayisindan buyuk");
        }
    }
}
