package homework;

public class HW_32_MultiDimensionalArrays {
    public static void main(String[] args) {

        /*
        Asagidaki MDAarin ic arraylerindeki ayni indexe sahip
        elemanlarin toplamini ekrana yazdiran bir program yaziniz
        arr1 = {{3,4,5},{6}}
        arr2 = {{7,8,9},{10,11},{12}}
         */

        int[][] arr1 = {{3, 4, 5}, {6}};

        int[][] arr2 = {{7, 8, 9}, {10, 11}, {12}};

        int toplam = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (i == j) {
                    toplam += arr1[i][j];
                }
            }
        }
        System.out.println("arr1 : " + toplam);

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                if (i == j) {
                    toplam += arr2[i][j];
                }
            }
        }

        System.out.println(toplam);


    }
}
