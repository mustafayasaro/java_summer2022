package javaPractice;

import java.util.Scanner;

public class Q07_BMISiniflama {
    public static void main(String[] args) {
        /*
         *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
         *
        BMI = kilo(kg) /(boy*boy)(cm)
        BMI <=20 oldukca zayifsiniz
        20<BMI<=25 Normal sinirlardasiniz
        25<BMI<=30 Sisman kategorisindesiniz
        30<BMI ==> Obez grubundasiniz.

        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kilonuzu yaziniz");
        double kilo = scan.nextDouble();

        System.out.println("Lutfen boyunuzu giriniz");
        double boy = scan.nextDouble() / 100;


        double BMI = kilo / (boy * boy);

        if (BMI <= 20) {
            System.out.println("Bmi indexiniz " + BMI + " oldukca zayifsiniz");
        } else if (BMI <= 25 && BMI > 20) {
            System.out.println("Bmi indexiniz " + BMI + " normal sinirlardasiniz");
        } else if (BMI <= 30 && BMI >= 25) {
            System.out.println("Bmi indexiniz " + BMI + " sisman kategorisindesiniz");
        } else {
            System.out.println("Bmi indexiniz " + BMI + " obez grubundasiniz");
        }

    }
}
