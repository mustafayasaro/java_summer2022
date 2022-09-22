package day14_methodCreation;

import day13_MethodCreation.C03_MethodCreation;

public class C02_MethodCreation {
    /*
    Verilen uc basamakli bir sayinin
    rakamlari toplamini yazdiran bir metohod olusturalim
     */
    public static void main(String[] args) {

        int input = 423;

        rakamlariTopla(input); // 9
        C01_MethodCreation.terstenYazddir("Nuri"); //iruN
        C03_MethodCreation.toplama(56,65); //121
    }

    public static void rakamlariTopla(int input) {
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;
        int temp = input;

        birlerBasamagi = input % 10;
        rakamlarToplami += birlerBasamagi;
        input /= 10;

        birlerBasamagi = input % 10;
        rakamlarToplami += birlerBasamagi;
        input /= 10;

        birlerBasamagi = input % 10;
        rakamlarToplami += birlerBasamagi;
        input /= 10;

        System.out.println("Girdiginiz "+ temp + " sayisinin rakamlar toplami = " + rakamlarToplami);

    }


}
