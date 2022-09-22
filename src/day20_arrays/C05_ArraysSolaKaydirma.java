package day20_arrays;

import java.util.Arrays;

public class C05_ArraysSolaKaydirma {
    public static void main(String[] args) {

        /*
        Verilen 3 elemanli bir array’in tum elemanlarini
        bir soldaki konuma tasiyacak bir program yazin.
        Ornek; array [1,2, 3] ise output [2, 3, 1] olacak.
         */

        int arr[] = {1,2,3,4,5};
        int temp = arr[0]; // 2'yi bir sola kaydirirsak 1 kaybolur
                           // o yuzden 1 gecici olarak bir yerde saklamaliyiz

        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }

        arr[arr.length-1] = temp;
        System.out.print(Arrays.toString(arr)); // [2, 3, 1]

        /*
        yukarida degistirdigimiz arrayi ilk durumuna getirmek icin saga kaydiralim
         */

        temp = arr[arr.length-1];

        for (int i = arr.length-1; i >0 ; i--) {
            arr[i] = arr[i-1]; // i-1 dedigi icin 0'a gidecek o yuzden for loopun icinde 0'a olan esitligi kaldirdik
                               //0 olsaydi 0-1  -1 olurdu -1. index diye bir sey yok
        }
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));
        // [1, 2, 3, 4, 5]

    }
}
