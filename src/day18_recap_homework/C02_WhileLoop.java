package day18_recap_homework;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {

        /*
        Kullanicidan tam sayilar alin
        kullanici cift sayi girdigi mudddetce sayilari yazdiirin
        tek sayi girdiginnde islemi biitrin
         */

        Scanner scan = new Scanner(System.in);
        int num = 0;

        while (num %2==0){
            System.out.println("Please enter an integer");
            num = scan.nextInt();
            System.out.println("You entered an even number");
        }
        System.out.println("You entered an odd number, game over.");
    }
}
