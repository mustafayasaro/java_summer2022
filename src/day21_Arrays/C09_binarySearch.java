package day21_Arrays;

import java.util.Arrays;

public class C09_binarySearch {

    public static void main(String[] args) {

        /*
        binary seaarch methodu siralanmis array'da elementin indexini dondurur

        Ya aradigimiz elemean array'da yoksa
        String'de indexOf olmayan elementler icin bize -1 donduruyordu
         */

         /*
        Eger aradigimiz elemet array'da yoksa Java  bize hem olmadigini hem de olsaydi
        hangi sirada(index degil, sira) olacagini - ile birlikte dondurur

        Var olanlarin index'i
        Var olmayanlarin -sira numarasini dondurur


        Sort methodu siralamayi kalici olarak degistirir
         */
        int[] sayilar = {3, 7, 15, 4, 27, 10};
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar)); // [0, 1, 3, 4, 5, 7]
        System.out.println(Arrays.binarySearch(sayilar, 4)); //  1
        System.out.println(Arrays.binarySearch(sayilar, 15)); // 4
        System.out.println(Arrays.binarySearch(sayilar, 11)); // -5
        System.out.println(Arrays.binarySearch(sayilar, 6)); // -3
        System.out.println(Arrays.binarySearch(sayilar, -100)); // -1


    }
}
