package day39_exceptions;

public class C03_Exceptions {

    public static void main(String[] args) {

        String str = "12345";

        int sayi = 0;
        try {
            sayi = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("yazdiginiz deger sadece rakamlardan olusmalidir");
        } catch (Exception e) {
            System.out.println("Onguulemeyen bir hata olustu.");
        }

        System.out.println("sayinin karesi : " + sayi * sayi);


        /*
        Kullanicidan String olarak bir deger aliyor
        ve bunu integer'a ceviriyorsak NumberFormatException
        ile karsilasabilecegimiz ongoruruz
        NumberFormatException aldigimizda kodun ddurmamasini istiyorsak
        try-catch ile cevreleyebilirizz

        Eger bilmedigim bir exception olusursa ve kodun
        durmamaisni istiyorsak bir kere daha catch blogu ekleriz
        ve bu catch blog'una en genis exception'u ekleriz

         */
    }

}
