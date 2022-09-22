package day45_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {

        /*
        Verilen bir array'deki tekrar eden elementleri silip
        tekrarsiz halini array'e atan bir kod yaziniz
         */

        int[] arr = {4, 5, 3, 6, 8, 5, 1, 9, 0, 4, 2, 5, 7, 9, 1, 2, 5, 7, 6};
        Set<Integer> tekrarsizSet = new HashSet<>(); // Hizli olmasi icin HashSet sectik

        for (int each : arr
        ) {
            tekrarsizSet.add(each); // array'deki herbir elementi alip set'e attim
        }
        System.out.println("Set : " + tekrarsizSet);
        // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9] > hem siraladi hem de tekrasiz yapti

        int[] tekrarsizArr = new int[tekrarsizSet.size()];
        // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]  > bu bir set

        // set'te index yapisi olmadigi icin fori kullanamayiz. foreachLoop ile cozeriz

        int i = 0; // burada da index yapisini kendimiz olusturduk
        for (Integer each : tekrarsizSet
        ) {
            tekrarsizArr[i] = each;
            i++; // olusturdugumuz indexi her dongude bir arttirdik
        }
        arr = tekrarsizArr;
        System.out.println("Bizim array'in son hali " + Arrays.toString(tekrarsizArr));
        // Bizim array''in son hali [0, 1, 2, 3, 4, 5, 6, 7, 8, 9] > bu bir array


    }
}
