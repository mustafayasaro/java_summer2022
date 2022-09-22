package day16_forLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

        /*
        Verilen bir pozitif bir tamsayinin
        tam bolenlerini yazdiralim
         */


        int input = 20;

        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                System.out.print(i + " "); // 1 2 4 5 10 20
            }
        }


    }
}
