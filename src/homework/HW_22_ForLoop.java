package homework;

import java.util.Scanner;

public class HW_22_ForLoop {
    public static void main(String[] args) {

        /*
        Kullanicidan baslangic ve bitis harfleini  alin
        ve baslangic harfinden baslayip bites harfine
        kadar olan tum harfleri buyuk harf ollarak yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen baslangic harfini yaziniz");
        char baslangic = scan.next().toUpperCase().charAt(0);

        System.out.println("Lutfen bitis harfini yazini");
        char bitis = scan.next().toUpperCase().charAt(0);

        for (int i = baslangic; i <= bitis ; i++) {
            System.out.print(i);
            System.out.print(" ");
        }

    }
}
