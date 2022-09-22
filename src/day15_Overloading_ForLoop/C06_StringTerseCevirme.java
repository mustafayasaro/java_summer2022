package day15_Overloading_ForLoop;

public class C06_StringTerseCevirme {
    public static void main(String[] args) {

        /*
        Input olarak verilen String'i terse cevirip yazdiran bir method olusturun
         */

        String input = "Java gun gectikce guzellesiyor";
        terseCeviren(input);

    }

    public static void terseCeviren(String input) {

        String tersInput = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            tersInput += input.substring(i, i + 1);

        }
        System.out.println(tersInput);
    }
}
