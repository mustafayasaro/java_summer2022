package day16_forLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {

        /*
        Bazen tek degisken sorunu cozmeye yetmez
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
         */

        //yanyana 3 tane * yaz

        for (int i = 1; i <= 3; i++) {
            System.out.print("* ");
        }

        System.out.println();
        //yanyana 4 tane * yaz

        for (int i = 1; i <= 4; i++) {
            System.out.print("* ");
        }

        System.out.println();

        //Bu gibi durumlarda ic ice(Nested) forloop gerekir

        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
