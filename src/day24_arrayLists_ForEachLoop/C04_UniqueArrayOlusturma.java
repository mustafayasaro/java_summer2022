package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_UniqueArrayOlusturma {

    public static void main(String[] args) {

        /*
        Verilen bir array’deki tekrar eden elementleri tek bir defa barindiran
        yeni bir array olarak donduren bir method olusturun
         */

        int[] arr = {2, 3, 5, 6, 3, 5, 4, 1, 9, 6, 3};

        int[] uniqueArray = uniqueArrayolustur(arr);

        System.out.println(Arrays.toString(uniqueArray));  //  [1, 2, 3, 4, 5, 6, 9]


    }

    public static int[] uniqueArrayolustur(int[] arr) {
        Arrays.sort(arr);
        List<Integer> benzersizList = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                benzersizList.add(arr[i]);
            }
        }

        //son elementi kontrol edip yoksa listeye ekliyoruz
        if (!benzersizList.contains(arr[arr.length - 1])) {
            benzersizList.add(arr[arr.length - 1]);

        }
        // benzersiz listenin size bilgisini kullanarak yeni  bir array olusturduk
        int[] tekrarsizArr = new int[benzersizList.size()];

        // yanindaki elemente esit olmayanlari liste ekliyor
        for (int i = 0; i < tekrarsizArr.length; i++) {
            tekrarsizArr[i] = benzersizList.get(i);
        }
        return tekrarsizArr;
    }
}
























