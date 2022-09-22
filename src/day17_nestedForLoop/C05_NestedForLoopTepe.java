package day17_nestedForLoop;

public class C05_NestedForLoopTepe {
    public static void main(String[] args) {

        /*
        verilen input'a gore yildizlardan ousan asagidaki sekli olusturun

        input= 4
        *
        * *
        * * *
        * * * *
        * * *
        * *
        *
         */

        /*Artdan kismi nested forloop ile yapacagiz
         */

        int input = 5
                ;

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) { //ucgen oldugu icin inner loop 1'den i'ye kadar
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = input - 1; i >= 1; i--) {
            for (int j = i; j >= 1; j--) { //ucgen oldugu icin inner loop 1'den i'ye kadar
                System.out.print("* ");
            }
            System.out.println("");
        }


    }
}
