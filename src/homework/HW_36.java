package homework;

import java.util.ArrayList;
import java.util.List;

public class HW_36 {

    public static void main(String[] args) {

        /*
        parametre olarak alan bir metot tanımlayınız.
        2. Metodumuz bir cümle ve bu cümleden çıkarmak istediğimiz kelimeyi  parametre olarak alsın.
        3. Sonuç olarak metodumuz cümle içinden istediğimiz kelimeyi çıkararak bize döndürsün.
        Örneğin;
        ("bugün hava çok güzel", "çok") ➞ "Bugün hava güzel"
        ("merhaba dünya", "dünya") ➞ "merhaba"
         */

        String str = "Bugun hava cok guzel";
        String kelime = "cok";

        kelimeCikar(str, kelime);
    }

    public static String kelimeCikar(String str, String kelime) {
        String[] sonuc = str.split(" ");
        String[] kelime1 = kelime.split(" ");

        List<String> list = new ArrayList<>();

        for (int i = 0; i < sonuc.length ; i++) {
            for (int j = 0; j < kelime1.length; j++) {
                if (!(sonuc[i].equalsIgnoreCase(kelime1[j]))){
                    list.add(sonuc[i]);
                }
            }
        }

        String donus = "";
        for (int i = 0; i < list.size(); i++) {
            donus += list.get(i) + " ";
        }

        System.out.println(donus);
        return donus;
    }


}
