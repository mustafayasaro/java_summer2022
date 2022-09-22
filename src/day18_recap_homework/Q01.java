package day18_recap_homework;

import java.util.*;

public class Q01 {
    public static void main(String[] args) {
        /*
        Kullanicidan toplamak icin sayi isteyin
        ve toplam 500'e ulasincaya kadar kullanicini sayi girmesini isteyin
        Toplamda 500'u gecctiginde veya 500'e ulasildiginda
        toplami ve kac sayi girildigini yaziniz

         */

        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int toplam= 0;
        int adet = 0;

        do{
            System.out.println("Lutfen pozitif bir tamsayi giriniz");
            sayi = scan.nextInt();
            toplam += sayi;
            adet ++;

        }while(toplam<=500);

        System.out.println(adet + " adet sayi girdiniz");
        System.out.println("Girdiginiz sayilarin topami : " + toplam);




    }
}
