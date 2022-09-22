package interview_questions;

import java.util.*;

public class Q04_DisplayNumInWord {

    public static void main(String[] args) {

        /*
        display the number in words taken the user
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number to display in words");
        int num = scan.nextInt();
        String str = "";
        int birler = 0;

        while (num > 0) {
            birler = num % 10;
            str += birler;
            num /= 10;
        }
        System.out.println(str);

        char c;
        for (int i = str.length() - 1; i >= 0; i--) {

            c = str.charAt(i);
            switch (c) {
                case '0':
                    System.out.print("zero ");
                    break;
                case '1':
                    System.out.print("one ");
                    break;
                case '2':
                    System.out.print("two ");
                    break;
                case '3':
                    System.out.print("three ");
                    break;
                case '4':
                    System.out.print("four ");
                    break;
                case '5':
                    System.out.print("five ");
                    break;
                case '6':
                    System.out.print("six ");
                    break;
                case '7':
                    System.out.print("seven ");
                    break;
                case '8':
                    System.out.print("eight ");
                    break;
                case '9':
                    System.out.print("nine ");
                    break;

            }
        }




    }
}
