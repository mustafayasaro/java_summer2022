package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_ForEachLoop {

    public static void main(String[] args) {

        int[] arr = {2,3,4,6,23,6,8,9,1};
        List<Integer> liste = new ArrayList<>();

        //Array'deki tum elemanlari inceleyelim tek sayi olanlari list'e atayalim

                             // arr arrayini git her bir int kontrol et
        for (int each : arr  // gelecek datalarin turu loop icinde ne isim verdigim
             ) {             // ve nereden aldigim bilgilerini yazdim
            if (each%2==1){
                liste.add(each);
            }
        }
        System.out.println(liste);
        //[3, 23, 9, 1]
    }
}
