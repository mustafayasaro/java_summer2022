package homework;

public class HW_30_MultiDimensionalArrays {

    public static void main(String[] args) {

        /*
        Asagidali MDAnin tum elemanlarinin carpimini ekrana yazdiran bir method olusturun
        {{1,2,3},{4,5},{6}}
         */

        int[][] sayilar = {{1, 2, 3}, {4, 5}, {6}};

        carpim(sayilar);
    }

    public static void carpim(int[][] sayilar) {
        int carpim = 1;

        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                carpim *= sayilar[i][j];
            }
        }
        System.out.println(carpim);

    }
}
