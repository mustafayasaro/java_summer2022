package homework;

import java.util.Scanner;

public class HW_04 {
    public static void main(String[] args) {
        /*
        Kullanicidan isim ve soyisim isteyiniz
        hangisi daha uzunsa onu yazdiriniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scan.next();

        System.out.println("Please enter your surmname");
        String surName = scan.next();

        if(name.length() > surName.length()){
            System.out.println(name);
        }else if (surName.length() > name.length()){
            System.out.println(surName);
        }else {
            System.out.println("Your name and surname is equal length");
        }


    }
}
