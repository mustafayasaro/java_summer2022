package day32_stringBuilder;

public class C04_subSequence {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Kayra");
        sb.substring(0,3);
        System.out.println(sb); // Kayra

        // StrinBuilder mutable olmasina ragmen degismedi
        // cunku substring methodu String class'inin altinda
        // yani String class'inin altindailer de immutable'dir

        sb.subSequence(0,3);
        System.out.println(sb); // Kayra

        /*
        Eger StringBuilder'da String methodu kullanirsak
        immutable olur
         */


    }
}
