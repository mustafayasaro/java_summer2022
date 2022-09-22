package javaPractice;

import java.util.Scanner;

public class Replit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz");
        String name = scan.next();
        String name1 =name.toUpperCase().substring(0,1);
        String name2 = name.substring(1).replace("\\w", "*");
        name= name1+name2;



        System.out.println("Lutfen soyadinizi giriniz");
        String surName = scan.next();
        String surMame1 =surName.toUpperCase().substring(0,1);
        String surName2 = surName.substring(1).replace("\\w", "*");
        surName = surMame1 + surName2;



        System.out.println("Lutfen 16 haneli kk nonuzu giriniz");

        String kk =scan.next();



        if(kk.length()!=16){
            System.out.println("Invalid credit card number");
        }

        String kk1 = "**** **** ****";
        String kk2 = kk.substring(12);
        kk = kk1+" "+ kk2;

        System.out.println(name +" "+ surName + " " + kk);



    }
}
