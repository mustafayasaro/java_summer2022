package day22_multidimensionalarray;

import java.util.Arrays;

public class C02_MDATumElementleriYzdirma {

    public static void main(String[] args) {

        /*
        verilen bir MDA nin tum elementlerini yazdiran
        bir method olusturun
         */
        int[][] sayilar = {{1, 5, 6, 9}, {2, 5,}, {3, 1, 6}};

        System.out.println(Arrays.deepToString(sayilar)); //  [[1, 5, 6, 9], [2, 5], [3, 1, 6]]
        elemetleriYazdir(sayilar);


    }

    public static void elemetleriYazdir(int[][] sayilar) {

        for (int i = 0; i < sayilar.length ; i++) { // i = 0, 1 ,2  degerlerini alacak
            for (int j = 0; j < sayilar[i].length; j++) { // inner arrayin uzunluguna bagli
                System.out.print(sayilar[i][j] + " ");  // 1 5 6 9 2 5 3 1 6

            }
        }
    }
}
