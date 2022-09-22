package day07_ifstatements;

import java.util.Scanner;

public class C05_IfElseStatatements {
    public static void main(String[] args) {

        /*
        Kullanicidan bir karakter girmesini isteyin
        ve karakterin harf olup olmadigini kontrol edin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir karakte giriniz");
        char harf = scan.next().toLowerCase().charAt(0);
        if (harf >= 'a' && harf <= 'z') {
            System.out.println("Girdiginiz karakter bir harftir");
        } else {
            System.out.println("Girdigiinz  karakter bir harf degildir");
        }

    }
}
