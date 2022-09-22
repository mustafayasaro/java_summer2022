package day17_nestedForLoop;

public class C00_ForLoop$$$$$$$$ {


    public static void main(String[] args) {

        /*
        Verilen String'deki kullanilan harflari
        tekrarsiz olarak yazdirip
        kelimede verilen farkli harfler sayisini
        yazdiran bir method olusturun
         */
        String str = "Java her zaman guzel";
        tekrarsiz(str);
    }
    public static void tekrarsiz(String str) {

        String benzersiz = "";
        str = str.replaceAll("\\W", "");

        for (int i = 0; i <= str.length() - 1; i++) {
            if (!benzersiz.contains(str.substring(i, i + 1))) {
                benzersiz += str.substring(i, i + 1);
            }
        }
        System.out.print(benzersiz); // Javherzmngul
    }
}

