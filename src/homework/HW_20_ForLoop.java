package homework;

import java.util.Scanner;

public class HW_20_ForLoop {
    public static void main(String[] args) {

        /*
        Kullanicidan baslangic ve bitis degerlerini alin
        ve baslangic degerinden baslayip bites degerine
        kadar olan tamsayilari toplayip yaziniz
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir baslangic degeri giriniz");
        int baslangic = scan.nextInt();

        System.out.println("Lutfen bir bitis degeri giriniz");
        int bitis = scan.nextInt();

        int toplam = 0;

        for (int i = baslangic; i <= bitis; i++) {
            toplam +=i;
        }
        System.out.println(toplam);

    }
}
