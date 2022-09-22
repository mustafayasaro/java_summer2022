package javaPractice;

import java.util.Scanner;

public class C10_IfStatement01 {
    public static void main(String[] args) {
        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.y
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Y or N");
        char deger = scan.next().toLowerCase().charAt(0);

        if(deger != 'n' && deger != 'y'){
            System.out.println("Lutfen gecerli karakter giriniz");
        }
        if (deger == 'n'){
            System.out.println("No");
        }
        if(deger == 'y'){
            System.out.println("Yes");
        }




    }
}
