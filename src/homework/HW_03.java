package homework;

import java.util.Scanner;

public class HW_03 {
    public static void main(String[] args) {
        /*
        Kullanicidan isim isteyin
        Eger  isim 'a' harfi iceriyorsa "Girdiginiz isim a harffi iceriyor"
        Eger isim 'Z' harfi iceriyorsa "Girdiginiz isim a harffi iceriyor"
        ikisini de icermiyorsa "Girdiginiz isim a  vey  Z harflerini icermiyor"
         */

      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter your name");
      String name = scan.next();

      if(name.contains("a")){
          System.out.println("Girdiginiz isim a harfi iceriyor");
      }
      if (name.contains("Z")) {
          System.out.println("Girdiginiz isim Z harfi iceriyor");
      }
      if (!name.contains("a") && !name.contains("Z")) {
          System.out.println("Girdiginiz isim a  ve  Z harflerini icermiyor");
      }



    }
}
