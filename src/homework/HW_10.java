package homework;

import java.util.Scanner;

public class HW_10 {
    public static void main(String[] args) {
        /*
        Kullanicidan yasadidigi ulkenin ismini isteyin
        ulkenin ilk iki harfini isteyin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your country where you live");
        String country = scan.nextLine();
        String country1 = country.substring(0,2).toUpperCase();
        String countryRest = country.substring(2);

        System.out.println(country1+countryRest);

    }
}
