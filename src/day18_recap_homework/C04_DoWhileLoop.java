package day18_recap_homework;

public class C04_DoWhileLoop {

     /*
            9'dan 190'a kadar 7^nin kati olan tum tam sayilari ekrana yazdiriniz
            */

    public static void main(String[] args) {


        int start = 9;
        int end = 190;

        do {
            if (start % 7 == 0) {
                System.out.print(start + " ");
            }
            start++;

        } while (start <= end);

    }


}
