package day08_ifstatements;

import java.util.Scanner;

public class C05_NestedIf {
    public static void main(String[] args) {

        /*
        Kullaniicdan bir sifre girmesini isteyin
        Eger sifrenin ilk harfi buyuk ise "A" olup olmadigini kontrol edin
         'A' ise "Gecerli sifre" degilse "gecersiz sifre"
        Eger ilk harf kucuk ise 'z' olup olmadigini kontrol edin
         'z' ise  "Gecerli sifre" degilse "gecersiz sifre"
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz");
        char sifre = scan.next().charAt(0);

        if (sifre >= 'A' && sifre <= 'Z') {
            if (sifre == 'A') {
                System.out.println("Gecerli sifre");
            } else {
                System.out.println("Gecersiz sifre");
            }
        } else if (sifre >= 'a' && sifre <= 'z') {

            if (sifre == 'z') {
                System.out.println("Gecerli sifre");
            } else {
                System.out.println("Gecersiz sifre");
            }
        }


    }
}
