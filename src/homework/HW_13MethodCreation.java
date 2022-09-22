package homework;

import java.util.Scanner;

public class HW_13MethodCreation {
    /*
    Kullanicidan kac sayi toplamak istedigini sorun
    Kullanici 2,3 ve 4 degerini girerse
    kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdirin
    kullanici toplamak istedigi sayi adedini 4'ten buyuk girerse
    "Cok sayi girdiniz ben bunu toplayamam yazdirin"
     */

    public static void main(String[] args) {
        topla();
    }

    public static void topla() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen toplamak istediginiz sayi adedini giriniz");
        int adet = scan.nextInt();

        if (adet == 2) {
            System.out.println("Lutfen toplamak istediginiz ilk sayiyi giriniz");
            int sayi1 = scan.nextInt();
            System.out.println("Lutfen toplamak istediginiz ikinci sayiyi giriniz");
            int sayi2 = scan.nextInt();

            System.out.println("Girdiginiz iki adet sayinin toplami : " + (sayi1 + sayi2));
        }else if (adet == 3) {
            System.out.println("Lutfen toplamak istediginiz ilk sayiyi giriniz");
            int sayi1 = scan.nextInt();
            System.out.println("Lutfen toplamak istediginiz ikinci sayiyi giriniz");
            int sayi2 = scan.nextInt();
            System.out.println("Lutfen toplamak istediginiz ucuncu sayiyi giriniz");
            int sayi3 = scan.nextInt();

            System.out.println("Girdiginiz uc adet sayinin toplami : " + (sayi1 + sayi2 + sayi3));
        }else if (adet == 4) {
            System.out.println("Lutfen toplamak istediginiz ilk sayiyi giriniz");
            int sayi1 = scan.nextInt();
            System.out.println("Lutfen toplamak istediginiz ikinci sayiyi giriniz");
            int sayi2 = scan.nextInt();
            System.out.println("Lutfen toplamak istediginiz ucuncu sayiyi giriniz");
            int sayi3 = scan.nextInt();
            System.out.println("Lutfen toplamak istediginiz dorduncu sayiyi giriniz");
            int sayi4 = scan.nextInt();

            System.out.println("Girdiginiz dort adet sayinin toplami : " + (sayi1 + sayi2 + sayi3 + sayi4));
        }else {
            System.out.println("Cok sayi girdiniz ben bunu toplayamam yazdirin");
        }
    }
}
