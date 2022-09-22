package homework;

import java.util.Scanner;

public class HW_09 {
    public static void main(String[] args) {

        /*
        Kullanicidan yasadigii ulkenin ismini alin
        Almanya ise ekrana "DE"
        Amerika ise ekrana "USA"
        Ingeltere ise ekrana "UK" yazdirin
        Diger ulkeler icin ise "NA" yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your country where you live");
        String country = scan.next();
        country = country.toLowerCase();

        switch (country){
            case "almanya" :{
                System.out.println("DE");
                break;
            } case "amerika" :{
                System.out.println("USA");
                break;
            } case "ingiltere" : {
                System.out.println("UK");
                break;
            } default:
                System.out.println("NA");
        }

    }
}
