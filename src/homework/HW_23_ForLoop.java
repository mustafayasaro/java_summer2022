package homework;

import java.util.Scanner;

public class HW_23_ForLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar 3’un
        kati olan sayilari yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 100'den kucuk pozitif bir tamsayi giriniz");
        int num = scan.nextInt();


        for (int i = 1; i <= num; i++) {

            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }


    }
}
