package day21_Arrays;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {

        String[] isimler = {"Basak", "Nurullah", "Fatih", "Adem", "Enes"};

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz");
        String alinanIsim = scan.nextLine();

        int varMi = 0;

        for (int i = 0; i < isimler.length; i++) {
            if (alinanIsim.equalsIgnoreCase(isimler[i])) {
                varMi += 1;
            }
        }
        if (varMi > 0) {
            System.out.println("Girdiginiz isim listede var");
        } else {
            System.out.println("Girdiginiz isim listede yok");
        }


    }
}
