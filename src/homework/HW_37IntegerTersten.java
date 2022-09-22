package homework;

import java.util.Arrays;
import java.util.Scanner;

public class HW_37IntegerTersten {


    //Kullanıcının girdiği integer sayıyı tersten yazdıran kod bloğu yazınız.
    // 123==>321 yada 1045==>5401 gibi.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter an integer : ");
        int sayi = scan.nextInt();

        int reversed = 0;
        int birler = 0;

        while (sayi > 0) {
            birler = sayi % 10;
            reversed = reversed * 10 + birler;
            sayi /= 10;
        }

        System.out.println(reversed);

    }
}
