package day32_stringBuilder;

public class C03_reverse {
    public static void main(String[] args) {
        /*
        Verilen bir inputu tersine cevirip bize
        bize donduren bir method olusturunuz
         */

        String input = "Hey idi for loop gunleri";

        String tersInput = tersineCevir(input);

        System.out.println(tersInput);
        // irelnug pool rof idi yeH
    }

    public static String tersineCevir(String input) {

        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
        // StringBuilder'i String'e cevirdik
        // cunku method 'tan String retur etmeliyiz
    }
}
