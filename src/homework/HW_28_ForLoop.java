package homework;

import java.util.Scanner;

public class HW_28_ForLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari
        toplayip, sonucu yazdiran bir program yaziniz
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen baslangic sayisini giriniz");
        int baslangic = scan.nextInt();
        int toplam = 0;

        System.out.println("Lutfen bitis sayisini giriniz");
        int bitis = scan.nextInt();

        for (int i = baslangic; i <= bitis; i++) {

            toplam += i;
        }
        System.out.println(toplam);
    }
}
