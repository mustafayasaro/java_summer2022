package day20_arrays;

import java.util.Arrays;

public class C04_ArraysElemanlariYazdirma {

    public static void main(String[] args) {

        int sayilar[] = {1, 2, 3, 4, 5, 6, 7};

        //Arrayin tamamini yazdiralim

        System.out.println(Arrays.toString(sayilar)); // [1, 2, 3, 4, 5, 6, 7]

        //array'in tum elementlerini yazdirin

        for (int i = 0; i <= sayilar.length - 1; i++) {
            if (i != sayilar.length - 1) {
                System.out.print(sayilar[i] + ", ");
            } else {
                System.out.println(sayilar[i]);//  1, 2, 3, 4, 5, 6, 7
            }
        }
    }
}
