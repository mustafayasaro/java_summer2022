package day07_ifstatements;

import java.util.Scanner;

public class C06_IfElseStatements {

    public static void main(String[] args) {

        /*
        Kullaniciya yasini sorun
        Eger 65'ten kucukse "emekli olamazsin, calismalisin"
        Eger 65'ten buyukse "Emekli olabilirsin" yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        if (yas<65){
            System.out.println("Emekli olamazsin, calismalisin");
        }else {
            System.out.println("Emekli olabilirsin");
        }



    }
}
