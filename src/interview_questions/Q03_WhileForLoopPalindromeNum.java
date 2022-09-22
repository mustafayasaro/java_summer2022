package interview_questions;

import java.util.Scanner;

public class Q03_WhileForLoopPalindromeNum {

    public static void main(String[] args) {
        /*
        Check the number taken user whether is palindrome or not.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number whether it is palindrome or not");
        int num = scan.nextInt();
        int palindrome = 0;
        int birler = 0;
        int temp = num;


        while (temp > 0) {
            birler = temp % 10;
            palindrome = palindrome * 10 + birler;
            temp /= 10;

            System.out.println(palindrome);
        }

        if (palindrome == num){
            System.out.println(num + " is palindrome");
        }else {
            System.out.println(num + " is not palindrome");
        }

    }
}
