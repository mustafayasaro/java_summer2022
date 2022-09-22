package day18_recap_homework;

import java.util.Scanner;

public class C05_DoWhileLoop {

    public static void main(String[] args) {

        /*
          Kullanicidan toplamak uzere pozitif sayilar isteyin,
          islemi bitirmek icin 0’a basmasini soyleyin.
          Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve
          “Negatif sayi giremezsiniz” yazdirip basa donun
          Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
          yanlislikla kac negative sayi girdigini ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen toplanmak uzere pozitif tamsayi giriniz. oyunu bitirmek icin 0'a basin");
        int sayi =0;
        int pozAdet = 0;
        int negAdet = 0;
        int pozToplam = 0;

        do {
            sayi = scan.nextInt();
            if (sayi > 0) {
                pozToplam += sayi;
                pozAdet++;
            } if (sayi < 0) {
                System.out.println("Negatif sayi giremezsiniz");
                negAdet++;
                System.out.println("Lutfen toplanmak uzere pozitif tamsayi giriniz");
            }
        } while (sayi != 0);

        System.out.println("Girdiginiz pozitif tamsayilarin toplami = " + pozToplam );
        System.out.println(pozAdet + " adet pozitif tamsayi girdiniz");
        System.out.println(negAdet + " adet negaif tamsayi girdiniz");


    }
}
