package day18_while_dowhile;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz degerini");
        int input = scan.nextInt();

        int rakamlarToplami = 0;
        int birler = 0;
        int temp = input;
        while (temp > 0) {
            birler = temp % 10;
            rakamlarToplami += birler;
            temp /= 10;
        }
        System.out.println(rakamlarToplami);


    }
}
