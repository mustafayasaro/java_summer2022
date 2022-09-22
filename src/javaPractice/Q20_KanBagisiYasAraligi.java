package javaPractice;

import java.util.Scanner;

public class Q20_KanBagisiYasAraligi {
    public static void main(String[] args) {
        /*
          Problem tanimi :
          Kullanicidan  yasini ve kilosunu alaliniz
          18 yasindan kucuk ise kan bagisi yapamaz
          18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
          18 yasindan buyuk ve 50 ve 50 kilodan agir ise kan bagisi yapabilir.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");

        int yas = scan.nextInt();

        System.out.println("Lutfen kilonuzu giriniz");
        int kilo = scan.nextInt();

        if (yas >= 0 && yas < 18) {
            System.out.println("Kan bagisi yapamazsiniz");

        } else if (yas > 18) {
            if (kilo < 50) {
                System.out.println("Kan bagisi yapamazsiniz");
            } else if (kilo >= 50) {
                System.out.println("Kan bagisi yapabilirsiniz");
            }
        }
    }
}
