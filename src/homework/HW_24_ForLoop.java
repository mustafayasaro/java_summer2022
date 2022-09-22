package homework;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class HW_24_ForLoop {
    /*
    Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar 3’un
    veya 5”in kati olan sayilari yazdirin.
     */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 100'den kucuk bir sayi girinz");
        int sayi = scan.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println(i + " hem 3'un hem de 5'in katidir.");
            } else if (i % 5 == 0) {
                System.out.println(i + " 5'in katidir.");
            }else if(i % 3 == 0) {
                System.out.println(i + " 3'un katidir");
            }
            }
        }


    }



