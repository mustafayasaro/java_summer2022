package day21_Arrays;

import java.util.Arrays;

public class C11_equals {

    public static void main(String[] args) {

        /*
        Verilen iki arrayin birbirine esit olup olmadigini kontrol edin
         */

        int[] sayilar1 = {1,2,3,4,5,6,7,8,9};
        int[] sayilar2 = {9,8,7,6,5,4,3,2,1};

        /*
        equals methodu degerleri ve indexleri birlikte kontrol edip boolean bir sonuc return eder
         */

        //oncelikle iki arrayi sort ederiz

        Arrays.sort(sayilar1);
        Arrays.sort(sayilar2);

        System.out.println(Arrays.equals(sayilar1,sayilar2)); //true

    }
}
