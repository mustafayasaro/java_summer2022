package homework;

public class HW_01 {
    public static void main(String[] args) {
        /*
        String metodlarini kullanarak
        " Java Ogrenmek123 Cok guzel@ "
        Stringini
        "Java ogrenmek cok guzel"
         */

        String str = " Java Ogrenmek123 Cok guzel@ ";
        str = str.trim();
        System.out.println(str);// "Java Ogrenmek123 Cok guzel@"

        str = str.replace(" ", "qwe");
        System.out.println(str); //JavaqweOgrenmek123qweCokqweguzel@

        str = str.replaceAll("\\W", "");
        System.out.println(str); //JavaqweOgrenmek123qweCokqweguzel

        str = str.replaceAll("\\d", "");
        System.out.println(str);//JavaqweOgrenmekqweCokqweguzel

        str = str.replaceAll("qwe", " ");
        System.out.println(str); //Java Ogrenmek Cok guzel



    }
}
