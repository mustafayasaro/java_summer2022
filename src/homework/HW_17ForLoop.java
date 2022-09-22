package homework;

import java.util.Scanner;

public class HW_17ForLoop {
    public static void main(String[] args) {

        /*
        Kullanicidan baslangic ve bitis degerlerini alin
        ve baslangic degerinden baslayip biten degerine
        kadar olan tamsayilari yaziniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir baslangiz degeri giriniz");
        int baslangic = scan.nextInt();

        System.out.println("Lutfen bir bitis degeri giriniz");
        int bitis = scan.nextInt();

        for (int i = baslangic; i <= bitis ; i++) {
            System.out.println(i);
        }


    }
}
