package homework;

import java.util.Scanner;

public class HW_11 {
    public static void main(String[] args) {
         /*
        Kullanicidan yasadidigi ulkenin ismini isteyin
        ulkenin bastan ikinci harfini ve
        sondan ikinci harfini buyuk olarak ekrana yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your country where you live");
        String country = scan.nextLine();

        String w1 = country.toUpperCase().substring(1,2);
        String w2 = country.toUpperCase().substring(country.length()-2,country.length()-1);

        System.out.println(w1+w2);



    }
}
