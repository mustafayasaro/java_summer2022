package javaPractice;

import java.util.Scanner;

public class Q17_NotHesaplama {
    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize2 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen vizenizi giriniz");
        double vize = scan.nextDouble();
        vize = vize*0.3;

        System.out.println("Lutfen final notunuzu giriniz");
        double finalNotu = scan.nextDouble();
        finalNotu *=0.7;

        double ortalama = finalNotu + vize;

        System.out.println("ortalama = " + ortalama);

    }

}
