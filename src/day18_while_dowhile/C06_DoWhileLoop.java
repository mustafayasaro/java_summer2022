package day18_while_dowhile;

import java.util.Scanner;

public class C06_DoWhileLoop {
    /*
     Kullanicidan toplamak uzere pozitif sayilar isteyin,
     islemi bitirmek icin 0’a basmasini soyleyin.
    Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve
     “Negatif sayi giremezsiniz” yazdirip basa donun
    Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
    yanlislikla kac negative sayi girdigini ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int pozSayiAded = 0;
        int negSayiAdedi = 0;
        int pozToplam = 0;


        //kullanicidan alinan sorulaarda do while loop daha kullannisli
        do {
            System.out.println("Lutfen toplamak uzere pozitif tamsayi giriniz");
            sayi = scan.nextInt();
            ;
            if (sayi > 0) {
                pozToplam += sayi;
                pozSayiAded++;
            } else if (sayi < 0) {
                negSayiAdedi++;
                System.out.println("Negatif sayi giremezsiniz");
            }

        } while (sayi != 0);

        System.out.println(pozSayiAded + " adet pozitif sayi girdiniz");
        System.out.println(negSayiAdedi + " adet yanlislikla negatif sayi adedi");
        System.out.println("Girdiginiz pozitif sayilarin toplami : " + pozToplam);

    }


}
