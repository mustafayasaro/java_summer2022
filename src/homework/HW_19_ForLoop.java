package homework;

import java.util.Scanner;

public class HW_19_ForLoop {
    public static void main(String[] args) {

        /*
        Kullanicidan baslangic ve bitis degerlerini alin
        ve baslangic degerinden baslayip bitis degerine
        kadar olan 3 ile bolunebilen sayilari yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir baslangic degeri giriniz");
        int baslangic = scan.nextInt();

        System.out.println("Lutfen bir bitis degeri giriniz");
        int bitis = scan.nextInt();

        for (int i = baslangic; i <= bitis ; i++) {
            if (i%3==0){
                System.out.print(i);
                System.out.print(" ");
            }
        }

    }
}
