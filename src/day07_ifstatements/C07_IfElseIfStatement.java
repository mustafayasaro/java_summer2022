package day07_ifstatements;

import java.util.Scanner;

public class C07_IfElseIfStatement {
    public static void main(String[] args) {

        /*
        Kullaniciya yasini sorun
        Eger 65'ten kucukse "emekli olamazsin, calismalisin"
        Eger 65'ten buyukse "Emekli olabilirsin" yazdirin
         Eger kullanici yanlis deger girerse uyarin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        if (yas < 0) {
            System.out.println("Lutfen gecerli bir deger giriniz");
        } else if (yas >= 65) {
            System.out.println("Emekli olabilirsin");
        } else {
            System.out.println("Emekli olamazsin, calismalisin");
        }


    }
}
