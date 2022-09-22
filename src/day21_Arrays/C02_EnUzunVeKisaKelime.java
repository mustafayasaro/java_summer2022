package day21_Arrays;

public class C02_EnUzunVeKisaKelime {

    public static void main(String[] args) {

        /*
        Verilen bir string array'de en uzun ve en kisa kelimeyi bulunuz
         */
        String [] isimler = {"Erdal", "Onur", "Mehmet", "Hayrullah"};
        enUzunVKisaYazdir(isimler);
    }
    public static void enUzunVKisaYazdir(String[] isimler) {
        String enUzunIsim = isimler[0];
        String enKisaIsim = isimler[0];
        for (int i = 1; i < isimler.length; i++) {
            if (isimler[i].length() > enUzunIsim.length()){ // isimler[i].length() >> arrayin i. indexindeki Stringin
                                                            //  uzunlgu o yuzden lenght degil lenght() kullandik
                enUzunIsim = isimler[i];
            }
            if (isimler[i].length() < enKisaIsim.length()){
                enKisaIsim = isimler[i];
            }
        }
        System.out.println("En uzun isim : " + enUzunIsim);
        System.out.println("En kisa isim : " + enKisaIsim);
    }
}
