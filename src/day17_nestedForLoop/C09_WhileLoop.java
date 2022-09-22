package day17_nestedForLoop;

import java.util.Scanner;

public class C09_WhileLoop {


    /*
        Kullanicidan bir sifre girmesini isteyin.
        Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        ve basarili sifre girincee kadar tekrar sifre girmesini isteyin
        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sifre = "";
        boolean sifreBasarliMi = false;
        int kontrol = 0;

        while (!sifreBasarliMi) {//en basta false atadi ! ile true olana kadar calis
          /*
          Kullanicidan bir sifre alalim
           */
            System.out.println("Lutfen bir sifre giriniz");
            sifre = scan.nextLine();


            /*
            istenilen 4 kontrolu yapalim
            her gecen kontrool icin kontrol variable'ni 1 artiralim
             */
            if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {
                kontrol++;
            } else {
                System.out.println("Ilk harf buyuk harf olmali");
            }

            if (sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z') {
                kontrol++;
            } else {
                System.out.println("Son harf kucuk olmali");
            }

            if (sifre.contains(" ")) {
                System.out.println("Bosluk icermemeli");
            } else {
                kontrol++;
            }

            if (sifre.length() >= 8) {
                kontrol++;
            } else {
                System.out.println("Sifreniz en az 8 karakterli olmalidir");
            }

            if (kontrol == 4) {  // tum kontrollerden gecmis demektir
                System.out.println();
                System.out.println("Sifreniz basariyla kaydedildi");
                sifreBasarliMi = true;
            } else { // sifre basarisiz
                     // tekrar basa donecek
                     // kontrol variable' i sifirlanmali
                kontrol = 0;
            }


        }

    }
}

