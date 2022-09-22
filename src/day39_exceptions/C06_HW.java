package day39_exceptions;

import java.util.Scanner;

public class C06_HW {
    public static void main(String[] args) {

        /*
        Kullanicidan carpma yapmak icin bir String isteyin
        ullanicinin girdigi String sadece sayilardan olusuyorsa
        sayiyi 2 ile carpip sonucu yazdirin
        ullanici sayilardan olusmayan bir String girerse
        "Girdiginiz String sayiya cevrilemez" yazdirin
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        String str = scan.next();



        try {
            int sayi = Integer.parseInt(str);// Muhtemel hata bekledigimiz kod satiri
            // try-catch blogu'nu hata bekledigimiz satirin ustunde yapariz
            System.out.println(sayi * 2);
        }catch (NumberFormatException e) {
            System.out.println("Girdiginiz String sayiya cevirilemez");
        }


    }
}
