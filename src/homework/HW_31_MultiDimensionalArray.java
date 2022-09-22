package homework;

public class HW_31_MultiDimensionalArray {

    public static void main(String[] args) {

        /*
        Asagidaki MDA nin ic aaraydeki son elemanlarinin carpimini yazdiran bir program yaziniz
        {{1,2,3},{4,5,6}}
        6*3=18
         */

        int[][] sayilar = {{1, 2, 3}, {4, 5, 6}};

        int carpim = 1;

        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                if (sayilar[i].length - 1 == j) {// ic arrayin son elemani j ye esit ise carp
                    carpim *= sayilar[i][j];
                }
            }
        }

        System.out.println(carpim);

    }
}
