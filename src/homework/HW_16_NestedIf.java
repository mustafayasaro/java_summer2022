package homework;

import java.util.Scanner;

public class HW_16_NestedIf {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sifre girmesini isteyiniz
        Asagidaki sartlari sagliyorsa "Sifre basariyla tanimlandi"
        Saartlari saglamiyorsa "Islem basarisiz, lutfen yeni  ir sifre giriniz"
        - Ilk harf buyuk harf ollmali
        - Son harf kucuk harf oolmali
        - Sifre bosluk icermemli
        - Sifre uzunlugu 8 karakter olmali
         */

        Scanner scann = new Scanner(System.in);
        System.out.println("Lutfen 8 karakterli bir sifre giriniz " +
                "\n- Ilk harf buyuk harf olmali " +
                "\n- Son harf kucuk harf olmali" +
                "\n- Sifre bosluk icermemli");
        String sifre = scann.next();

        if (sifre.length() == 8)
            if ((sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z'))
                if (sifre.charAt(7) >= 'a' && sifre.charAt(7) <= 'z')
                    if (!sifre.contains(" ")) {
                        System.out.println("Sifre basariyla tanimlandi");
                    } else {
                        System.out.println("Islem basarisiz, lutfen yeni bir sifre giriniz");
                    }
                else {
                    System.out.println("Islem basarisiz, lutfen yeni bir sifre giriniz");
                }
            else {
                System.out.println("Islem basarisiz, lutfen yeni bir sifre giriniz");
            }
        else {
            System.out.println("Islem basarisiz, lutfen yeni bir sifre giriniz");
        }


    }
}
