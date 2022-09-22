package day16_forLoop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {

        /*
         Kullanicidan iki sayi isteyin.
         Girilen sayilar ve aralarindaki tum tamsayilari toplayip,
         sonucu yazdiran bir method yaziniz
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen baslangic degerini pozitif tamsayi olarak giriniz");
        int baslangic = scan.nextInt();

        System.out.println("Lutfen bitis degerini pozitif tamsayi olarak giriniz");
        int bitis = scan.nextInt();


        aralariTopla(baslangic, bitis);


    }

    public static void aralariTopla(int baslangic, int bitis) {
        int topla = 0;
        for (int i = baslangic; i <=bitis; i++) {
            topla +=i;
        }
        System.out.println(topla);
    }
}
