package day17_nestedForLoop;

import java.util.Scanner;

public class C08_WhileLoop {
    public static void main(String[] args) {

        /*
        Kullanicidan toplanmak uzere sayilar alin
        sayilarin toplami 500'u gecince 500 dahil degil
         sayilariin toplamini ve kac sayi toplandiginiz yaziniz

         13 sayi girdiniz  ve tooplamilari 567
         */

        int toplam = 0;
        int sayi = 0;
        int sayac = 0;

        Scanner scan = new Scanner(System.in);

        while (toplam < 500 ) {// conditionun icine && sayac < 10 eklenebilir
            System.out.println("Lutfen toplamak icin  sayi giriniz");
            sayi = scan.nextInt();
            toplam += sayi;
            sayac++;
        }

        System.out.println("toplam = " + toplam);
        System.out.println("sayac = " + sayac);
    }
}
