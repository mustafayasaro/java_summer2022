package day32_stringBuilder;

public class C01_OlusturmaYontemlwri {

    public static void main(String[] args) {


        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Java Candir...");
        StringBuilder sb3 = new StringBuilder(10);

        System.out.println("sb1 length = " + sb1.length()); // sb1 length = 0
        System.out.println("sb1 capatity " + sb1.capacity()); // sb1 capatity 16
        //Hicbir sey soylemezsek Java 16 kapasiteli StringBuilder olusturur

        System.out.println("sb2 length = " + sb2.length()); // sb2 length = 14
        System.out.println("sb2 capatity " + sb2.capacity()); // sb2 capatity 30

        System.out.println("sb3 length = " + sb3.length()); // sb3 length = 0
        System.out.println("sb3 capatity " + sb3.capacity()); // sb3 capatity 10
        // eski kapasite carpi 2 +2

        sb1.append("Java");
        System.out.println("sb1 length = " + sb1.length()); // sb1 length = 4
        System.out.println("sb1 capatity " + sb1.capacity()); // sb1 capatity 16

        sb1.append(" Candir");
        System.out.println("sb1 length = " + sb1.length()); // sb1 length = 11
        System.out.println("sb1 capatity " + sb1.capacity()); // sb1 capatity 16


        sb1.append(", bilen bilir.");
        System.out.println("sb1 length = " + sb1.length()); // sb1 length = 25
        System.out.println("sb1 capatity " + sb1.capacity()); // sb1 capatity 34
        // kapasite eskiden 16 idi
        // kapasiteyi astik 2*(eski kapasite) + 2 = 34

        StringBuilder sb4 = new StringBuilder();
        sb4.append("Java Candir");

        System.out.println("sb4 length = " + sb4.length()); // 11
        System.out.println("sb4 kapasite = " + sb4.capacity()); // 16


    }
}
