package interview_questions;

import java.util.Scanner;


public class Q02_WhileLoopReverseNum {

    public static void main(String[] args) {

        /*
        Reverse the number taken user
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number to take it reverse");
        int num = scan.nextInt();

        int reverse = 0;
        int birler = 0;

        String str = "";

        while (num > 0) {
            birler = num % 10;
           // str += birler;  bu satiri >>  1700 girersek   0071 sonucunu elde edebilmek icin yazdik
            reverse = reverse * 10 + birler;
            num = num / 10;
        }
        System.out.println(reverse);
      //  System.out.println(str);

    }
}
