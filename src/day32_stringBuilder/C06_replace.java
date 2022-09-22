package day32_stringBuilder;

public class C06_replace {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Calm down");

        sb.replace(5,10,"Up");
        System.out.println(sb); // Calm Up

        sb.replace(4,5,"---");
        System.out.println(sb); // Calm---Up


        //replace StringBuilder  class'inin method'u oldugu icin
        // sb deegisir.
        // mutable class'in method'lari mutable'dir

        sb.replace(4,7," ");
        System.out.println(sb); // Calm Up

        sb.replace(5,7, "down"); // 5 ve 6 dahil, 7 dahil degil
        System.out.println(sb); // Calm down


    }
}
