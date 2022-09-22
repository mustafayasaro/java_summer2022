package day13_MethodCreation;

public class C03_MethodCreation {
    public static void main(String[] args) {

        /*
        Input olarak verilen iki integer'i toplayip
        sonucunu yazdiran bir metod olusturun
         */
        /*
        Metod 4 adimda olusturulur
        1-) metod call
        2-) argument eklenmesi gerekiyorsa ekleyin
            eger metodun return type'i void'den farkli olacaksa
            bir variable olusturup, method call'a assign edelir
         3-) method deklarasyonunda degistirilmesi gereken
             bolumleri degistirin (acces modifier, return type vb...)
         4-) Return type void disinda ise return keyword'u
             ve donecek degeri hesaplamaliyiz
         */
        int sayi1 = 10;
        int sayi2 = 20;
        toplama(sayi1,sayi2);
    }
    public static void toplama(int sayi1 , int sayi2){
        System.out.println("result = " + (sayi1+ sayi2));//result = 30
    }



}
