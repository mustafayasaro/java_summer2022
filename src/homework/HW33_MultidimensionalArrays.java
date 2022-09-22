package homework;

import java.util.Arrays;

public class HW33_MultidimensionalArrays {

    public static void main(String[] args) {


        /*
        Asagidaki MDAlarin ic arrayindeki  bitin elemanlarinin toplamini bulan
        ve hebir sonucu yeni bir arrayin elemani yapan ve yeni arrayi ekrana
        yazdiran bir broogram yaziniz

        {{1,2,3},{4,5},{6,7}}

        1+2+3 = 6
        4+5 = 9
        6+7 = 13

        {6,9,13}
         */

        int[][] arr1 = {{1, 2, 3}, {4, 5}, {6, 7}};

        int[] arr2 = new int[arr1.length];

        int toplam = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                toplam += arr1[i][j];

            }
            arr2[i] = toplam;
            toplam = 0;
        }

        System.out.println(Arrays.toString(arr2)); // [6, 9, 13]

    }
}
