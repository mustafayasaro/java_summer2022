package day08_ifstatements;

import java.util.Scanner;

public class C02_IfElseStatements {

    public static void main(String[] args) {
        /*
        Kullanicidan 100 uzerinden notunu isteyin
        Notu asagidaki har sistemine gore cevap verin
        50'den kucukse "D
        50-60  arsinda ise "C"
        60-80 arasinda ise "B"
        80-100 arasinda ise "A"
        yanlis not girerse "Gecerli bir not giriniz" yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 100 uzerinden notunuzu giriniz");
        int not = scan.nextInt();

        if (not < 0 || not > 100) {
            System.out.println("Gecerli bir not giriniz");
        } else if (not >= 80) {
            System.out.println("A");
        } else if (not >= 60) {
            System.out.println("B");
        } else if (not >= 50) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }


    }
}
