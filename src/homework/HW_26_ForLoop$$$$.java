package homework;

import java.util.Scanner;

public class HW_26_ForLoop$$$$ {

    public static void main(String[] args) {

        /*
        Kullanicidan bir String isteyin ve Stringi tersine ceviren
        bir method yazin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Tersten yazdirmak  icin bir cumle giriniz");
        String cumle = scan.nextLine();

        tersYaz(cumle);

    }

    public static String tersYaz(String cumle) {
        String input = cumle.substring(cumle.length() - 1);

        for (int i = cumle.length() - 2; i >= 0; i--) {

            input += cumle.substring(i, i + 1);
        }
        System.out.println(input);
        return input;
    }
}
