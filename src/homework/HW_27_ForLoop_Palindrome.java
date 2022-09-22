package homework;

import java.util.Scanner;

public class HW_27_ForLoop_Palindrome {
    public static void main(String[] args) {

        /*
        Kullanicidan bir String isteyin. Kullanicinin girdigi String’in
        palindrome olup olmadigini kontrol eden bir program yazin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scan.nextLine();
        String terso = "";


        for (int i = cumle.length() - 1; i >= 0; i--) {
            terso += cumle.substring(i, i + 1);
        }

        if (terso.equals(cumle)) {
            System.out.println("Girdiginiz cumle palindrome");
        } else {
            System.out.println("Girdiginiz cumle palindrome degildir");
        }

    }
}
