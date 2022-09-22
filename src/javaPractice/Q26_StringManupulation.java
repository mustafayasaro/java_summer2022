package javaPractice;

import java.util.Scanner;

public class Q26_StringManupulation {
    public static void main(String[] args) {


        //Kullanicidan ismini ve soyisimi girmesini isteyin,
        // sonrasinda konsola tam ismini buyuk harfler ile yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen adinizi ve soyadinizi yaziniz");
        String isim = scan.nextLine().toUpperCase(), soyIsim = scan.nextLine().toUpperCase(); //multiple declaration

        String fullName = isim.concat(" " + soyIsim);
        System.out.println(fullName);


    }
}
