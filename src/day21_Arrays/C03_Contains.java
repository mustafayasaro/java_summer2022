package day21_Arrays;

import java.util.Scanner;

public class C03_Contains {

    public static void main(String[] args) {

        /*
        Kullanicidan aldiginiz  bir ismi verilen array'da icerip icermedigini kontrol edip
        bize false true   donduren bir method olusturun
         */

        String[] isimler = {"Basak", "Nurullah", "Fatih", "Adem", "Enes"};

        Scanner scan = new Scanner(System.in);
        String alinanIsim = scan.nextLine();

        Boolean sonuc = contains(alinanIsim, isimler); // method boolean donecegi icin main method'da onu karsilayacak
                                                       // bir boolean olmali
        if (sonuc) {
            System.out.println("Girdiginiz isim listede var");
        } else {
            System.out.println("Girdiginiz isim listede yok");
        }

    }
    public static Boolean contains(String alinanIsim, String[] isimler) {

        boolean sonucMethod = false; // method main method'a boolean gonderececgi icin sonucu gonderecegi
                                     // bir boolean data turunde bir boolean olusturmaliyiz
        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i].equalsIgnoreCase(alinanIsim)) {
                sonucMethod = true;
            }
        }
        return true;
    }
}
