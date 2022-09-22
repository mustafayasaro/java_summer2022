package day18_recap_homework;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C03_WhileLoop {

    public static void main(String[] args) {

        /*
        Kullanicidan bir tamsayi alin ve tamsayinin rakamlari toplamini bulun
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int num = scan.nextInt();

        int sumOfDigit = 0;
        int onesDigit = 0;
        int temp = num;

        while (temp > 0) {
            onesDigit = temp % 10;
            sumOfDigit += onesDigit;
            temp /= 10;
        }
        System.out.println(sumOfDigit);


    }
}
