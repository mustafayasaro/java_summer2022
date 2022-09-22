package homework;

import java.util.Scanner;

public class HW_29_ForLoop {
    public static void main(String[] args) {

        /*
        Kullanicidan 10’dan kucuk bir  tamsayi isteyin ve girilen
        sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfefn 10'dan kucuk bir sayi giriniz");
        int sayi = scan.nextInt();
        int faktoriyel = 1;

        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }
        System.out.println(sayi + "! = " + faktoriyel);
    }
}
