package homework;

import java.util.Scanner;

public class HW_18ForLoop {
    public static void main(String[] args) {

        /*
        Kullanicidan baslangic ve bitis degerlerini alin
        ve baslangic degerinden baslayip bitis degerine
        kadar olan cif sayilari yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir baslangic degeri yaziniz");
        int baslangic = scan.nextInt();

        System.out.println("Lutfen bir bitis degeri yaziniz");
        int bitis = scan.nextInt();

        for (int i = baslangic; i <= bitis; i++) {
            if (i%2==0){
                System.out.print(i);
                System.out.print(" ");
            }

        }


    }
}
