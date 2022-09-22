package homework;

public class HW_02 {
    public static void main(String[] args) {
        /*String seklinde verilen asagidaki fiyatlarin toplamini veriniz
        String str1 = "$13.99"
        String str2 = "$10.55"
        ipucu : Double.parse.Double()metodunu kullanabilirsiniz

         */

        String str1 = "$13.99";
        String str2 = "$10.55";

        str1 = str1.replace(".", "0");
        str1 = str1.replaceAll("\\D", "");
        str1 = str1.replace("0", ".");
        double d1 = Double.parseDouble(str1);
        System.out.println(d1);


        str2 = str2.replace(".", "3");
        str2 = str2.replaceAll("\\D", "");
        str2 = str2.replace("3", ".");
        double d2 = Double.parseDouble(str2);
        System.out.println(d2);

        double toplam = d1 + d2;

        System.out.println("toplam = " + toplam);
    }
}