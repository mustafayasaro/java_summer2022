package javaPractice;

import java.util.Scanner;

public class Q14_Modulus {
    public static void main(String[] args) {
        /*
         *  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve
         * son iki basamagindaki rakamlari toplamini bulunuz
         *   Ex :
         *   input  : 12345
         *   output : 12
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sayi giriniz");
        int sayi = scan.nextInt();

        int birler = sayi %10;

        int onlar = sayi/10;
        onlar = onlar%10;

        int binler = sayi/1000;
        binler = binler %10;

        int onBinler = sayi/10000;
        onBinler = onBinler%10;

        int toplam = birler+onlar+binler+onBinler;

        System.out.println("toplam = " + toplam);






    }
}
