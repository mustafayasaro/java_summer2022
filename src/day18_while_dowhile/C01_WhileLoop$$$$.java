package day18_while_dowhile;

public class C01_WhileLoop$$$$ {
    public static void main(String[] args) {
        /*
        Soru 4 ) verilen  baslangic harfinden baslayip bitis harfinde biten
        tum harfleri buyuk harf olarak ekrana yazdirin.
        Kullanicinin hata yapmadigini farz edin.
         */

        char ilkHarf =  'f';
        char sonHarf = 't';
        String buyult = "";


        char temp = ilkHarf;
        while (temp <= sonHarf){
            buyult = (temp + "").toUpperCase();
            System.out.print(buyult + " "); // F G H İ J K L M N O P Q R S T
            temp++;
        }
    }
}
