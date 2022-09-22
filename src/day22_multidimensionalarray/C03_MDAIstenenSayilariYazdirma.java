package day22_multidimensionalarray;

import java.lang.management.GarbageCollectorMXBean;

public class C03_MDAIstenenSayilariYazdirma {

    public static void main(String[] args) {

        /*
        Verilen 2 katli MDA de
        outer indexi ve
        inner indexi ayni olan sayilarin toplamini veriniz

        int[][] sayilar = {{1, 5, 6, 9}, {2, 5,}, {3, 1, 6}};

        [0][0] + [1][1] + [2][2] + ......
         */

        int[][] sayilar = {{1, 5, 6, 9}, {2, 5}, {3, 1, 6}};

        int toplam = 0;

        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                if (i == j) {
                    toplam += sayilar[i][j];
                }
            }
        }
        System.out.println("toplam = " + toplam); // toplam = 12 ==> 1 + 5 + 6 = 12



    }
}
