package homework;

import java.util.Scanner;

public class HW_15MethodCreation {
    /*
    Kullanicidan ismini soyismini ve bosluk birakmadan
    16 haneli KK numarsini aliniz
    Isminin ve soyisminin ilk harfleri diger harfleri kucuk sekilde
    KK numarasini ise  4 rakamlik 4 blok halinde ve aralarinda bosluk olacak sekilde
    duzelten 2 method yazdirin, ve programda kullanabilmek icin duzenlenmis hallerini geri dondurun
     */
    public static void main(String[] args) {
        String isim = "";
        String soyIsim = "";
        String kkNo = "";
        isimSoyIsim(isim, soyIsim);
        krediKarti(kkNo);
    }

    public static String krediKarti(String kkNo) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 16 haneli kredi karti numaranizi giriniz");
        String krediK = scan.next();
        krediK = krediK.substring(0, 4) + " " + krediK.substring(4, 8) + " " + krediK.substring(8, 12) + " " + krediK.substring(12);
        System.out.println(krediK);
        return krediK;
    }

    public static String isimSoyIsim(String isim, String soyIsim) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz");
        String isim1 = scan.nextLine();
        System.out.println("Lutfen soyadinizi giriniz");
        String soyIsim1 = scan.nextLine();
        isim1 = isim1.substring(0, 1).toUpperCase() + isim1.substring(1).toLowerCase();
        soyIsim1 = soyIsim1.substring(0, 1).toUpperCase() + soyIsim1.substring(1).toLowerCase();
        System.out.println("isim :" + isim1+"\n"+"soyisim : " + soyIsim1);
        return isim1 + soyIsim1;

    }


}
