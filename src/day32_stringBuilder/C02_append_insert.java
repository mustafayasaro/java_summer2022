package day32_stringBuilder;

public class C02_append_insert {

    public static void main(String[] args) {

        StringBuilder sb1  = new StringBuilder("Java daha ne yapsin");

        sb1.append("?");

        System.out.println("sb1 = " + sb1); // sb1 = Java daha ne yapsin?

        // append methoduyla sadece sona ekleme yapariz
        // yani istedigggimmiz bir indekse ekleme yapamayiz

        sb1.append(5);
        System.out.println("sb1 = " + sb1); // sb1 = Java daha ne yapsin?5

        sb1.append(true);
        System.out.println(sb1); // Java daha ne yapsin?5true

        StringBuilder sb2  = new StringBuilder("Java daha ne yapsin");
        sb2.insert(4, " herseyi dusunmus,");
        System.out.println(sb2);  // Java herseyi dusunmus, daha ne yapsin

        /*
        Araya ekleme yapmak istedigimizde append degil insert method'unu kullanmaliyiz
         */

        sb2.insert(22, " valla valla", 6,12);
        System.out.println(sb2); // Java herseyi dusunmus, valla daha ne yapsin


    }
}
