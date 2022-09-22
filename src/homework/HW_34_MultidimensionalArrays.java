package homework;

import java.util.Arrays;
import java.util.Scanner;

public class HW_34_MultidimensionalArrays {

    public static void main(String[] args) {

        /*
        Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini ekrana yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String cumle = scan.nextLine();

        int count = 0;

        String[] kelimeler = cumle.split(" ");
        System.out.println(Arrays.toString(kelimeler));

        for (int i = 0; i < kelimeler.length; i++) {
            count++;
        }

        System.out.println("girdiginiz cumlede " + count + " adet kelime vardir");
    }
}
