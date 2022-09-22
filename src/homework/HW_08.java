package homework;

import java.util.Scanner;

public class HW_08 {
    public static void main(String[] args) {
        /*
        Kullanicidan isim ve soy ismini aliniz
        isminin ve soyisminin kac harften olustugunnu ekrana yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scan.next();
        int lengthName = name.length();


        System.out.println("Please enter your surname");
        String surName = scan.next();
        int lengtSurName = surName.length();

        System.out.println("Name length: " + lengthName);
        System.out.println("Surname lengt: " + lengtSurName);


    }
}
