package day21_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_ArrayOlustur {

    public static void main(String[] args) {

        /*
        Kullanicidan alinan bir array'in boyutunu
        ve tum elementlerini alarak bir array olusturun
        bu array'i bize donduren bir method yazdirin
         */


        int[] sayi = arrayOlustur();

        System.out.println(Arrays.toString(sayi));
    }





    public static int[] arrayOlustur() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Array'in uzunlugunu giriniz");
        int uzunluk = scan.nextInt();

        int[] olusturulan = new int[uzunluk];

        for (int i = 0; i < uzunluk; i++) {
            System.out.println(i + ". index icin elemnti giriniz");
            olusturulan[i] = scan.nextInt();
        }

        return olusturulan;


    }
}
