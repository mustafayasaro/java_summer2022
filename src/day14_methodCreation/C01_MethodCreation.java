package day14_methodCreation;

import day13_MethodCreation.C03_MethodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {

        /*
         input olarak verilen 4 harfli bir stringi
         tersten yazdiran bir method yazdirin
        */

        //String input = "Kaya";
        //terstenYazddir(input);

        terstenYazddir("akca");  // acka
        C03_MethodCreation.toplama(6,5); //11

    }

    public static void terstenYazddir(String input) {
        String tersInput = input.substring(3) +
                           input.substring(2, 3) +
                           input.substring(1, 2) +
                           input.substring(0,1);

        System.out.println("Verilen Inputun tersten yazilisi : " + tersInput);
    }

}
