package day30_immutable_date;

public class C02_StringHavuzu {

    public static void main(String[] args) {

        String str1 = "Ali Can";
        String str2 = str1 + "";
        String str3 = new String("Ali Can");
        String hiclik = "";
        String str4 = str1.concat(hiclik);

        /*
    1- Yeni bir string olustururken esitligin saginda new keyword'u olursa
       java direkt yeni bir obje ve referansini olusturur'

    2- Eger esitligin saginda bir method calisiyor veya + islemi yapiliyorsa
       String immutable oldugunda degisikligi kaydetmek uzere hemen bir kopya
       String ve referansi olusturur sonra degeri hesaplayip bu yeni kopya
       objenin icine koyar
*/

        System.out.println(str1 == str2); //  false
        System.out.println(str1.equals(str2)); // true

        // farkli objeler olmasina ragmen sadece icerige odaklaniyor
        System.out.println(str1 == str3); // false
        System.out.println(str1.equals(str3)); // true

        System.out.println(str2.equals(str4)); // true
        System.out.println(str2 == str4); // false

        System.out.println(str1.equals(str4)); // true
        System.out.println((str1 == str4)); // true

        String str5 = "Ali Can";
        String str6 = str1;

        System.out.println(str1.equals(str5)); //  true <<< icerikler ayni
        System.out.println(str5 == str1); // true

        System.out.println(str1.equals(str6)); // true
        System.out.println(str1 == str6); // true

        /*
        Eger yeni String objesi olusturulurken new kelimesi kullanilmaz veya esitligin saginda
        + islemi olmazsa Java bakar

        Eger daha once olusturulan String objelerden (String Havuzu)
        birebir ayni String varsa o objeyi ve referansini kullanir
        birebir aynisi yoksa yeni bir obje ve referans olusturur

         */

        System.out.println(str5 == str6);  // true
        System.out.println(str5.equals(str6)); // true




    }
}
