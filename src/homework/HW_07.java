package homework;

import java.util.Scanner;

public class HW_07 {
    public static void main(String[] args) {
        /*
        Kullanicidan krerdi karti numarisini isteyiniz
        ve bu numaranin ucuncu, dorduncu ve sonuncu rakamlarini isteyiniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 16 haneli kredi karti numaranizi giriniz");
        String kkNo = scan.nextLine();

        String uc = kkNo.substring(2,3);
        String dort = kkNo.substring(3,4);
        String son = kkNo.substring(15);
        System.out.println("uc = " + uc);
        System.out.println("dort = " + dort);
        System.out.println("son = " + son);




    }
}
