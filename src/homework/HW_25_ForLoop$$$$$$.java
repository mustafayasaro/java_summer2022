package homework;

import java.util.Scanner;

public class HW_25_ForLoop$$$$$$ {
    public static void main(String[] args) {

        //Kullanicidan bir String isteyin ve Stringi tersten yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("testen yazdirmak icin bir cumle giriniz");
        String cumle = scan.nextLine();
        String terstenYazdir = "";

        for (int i = cumle.length() - 1; i >= 0; i--) {
            terstenYazdir += cumle.substring(i, i + 1);
        }
        System.out.println(terstenYazdir);


    }
}
