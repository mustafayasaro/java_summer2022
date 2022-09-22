package homework;

import java.util.Scanner;

public class HW_39UglyNumber {
    public static void main(String[] args) {

     /*
            Given a number n, the task is to find n'th Ugly number.
            Examples:
                    Input  : n = 7      Output : 8
                    Input  : n = 10     Output : 12
                    Input  : n = 15     Output : 24
                    Input  : n = 150    Output : 5832
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir pozitif sayi giriniz ( 1 - 250 arasi ) : ");
        int sayi = scan.nextInt();
        int temp1 = 0;
        int count = 1;
        int sonuc = 1;
        if (sayi != 1) {
            for (int j = 2; j < Integer.MAX_VALUE; j++) {
                temp1 = j;
                for (int i = 2; i <= j; i++) {
                    if ((temp1 % 2) == 0) {
                        temp1 /= 2;
                    } else if ((temp1 % 3) == 0) {
                        temp1 /= 3;
                    }
                    if ((temp1 % 5) == 0) {
                        temp1 /= 5;
                    }
                    if (temp1 == 1) break;
                }
                if (temp1 == 1) {
                    count++;
                    if (count == sayi) {
                        sonuc = j;
                        break;
                    }
                }
            }
        }
        System.out.println(sayi + ". cirkin sayi : " + sonuc);
    }
}
