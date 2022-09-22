package day12_stringManupulation;

public class C05_substring {
    public static void main(String[] args) {
        // Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.
        String input = "Kaya";
        String tersInput = input.substring(3) +
                input.substring(2, 3) +
                input.substring(1, 2) +
                input.substring(0, 1);
        System.out.println(tersInput);

        //  System.out.print(input.charAt(3));
        //  System.out.print(input.charAt(2));
        //  System.out.print(input.charAt(1));
        //  System.out.print(input.charAt(0));

    }
}
