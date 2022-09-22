package day17_nestedForLoop;

public class C04_NestedForLoopUcgen {
    public static void main(String[] args) {
        /*
        Verilen inputa gore *'lardan olusan bir ucgen olusturun

        input: 4 >>
        *
        * *
        * * *
        * * * *
      */
        int input = 4;
         /*
         sayir sayisini outer loop
         sutun sayyisini inner loop kkontrol ediyor
          */

        for (int i = 1; i <= input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
