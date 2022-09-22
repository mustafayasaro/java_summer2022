package homework;

import java.util.Scanner;

public class HW_05 {
    public static void main(String[] args) {

        /*
        Kullanicidan 4 harfli bir kelime isteyin
        ve kelimeyi tersten yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 harfli bir kelime giriniz");

        String kelime = scan.next();

        String ters = kelime.charAt(3)+
                      kelime.substring(2,3) +
                      kelime.substring(1,2) +
                      kelime.substring(0,1);

        System.out.println(ters);


    }


}
