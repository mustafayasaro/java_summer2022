package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_IcIceTryCatch {
    public static void main(String[] args) {


        //Java diyoruz ki. Su dosya yolunda bir dosya var ben onu okumak istiyorum
        //sende bunu koduma dahil et. dahil edilebilmesi icin
        //obgje olusturmaliyiz bunun icin fis objesini olusturup
        // o dosyaya ulasabiliyoruz
        // Burada soyle bir problem var
        // Javav diyor ki o adreste  ya dosya yoksa ya da okunmuyorsa
        // Bunun iki cozumu var
        // throws keyword'u ile beklenen exceptionu soylersiniz
        // objenin oldugu kodu try catch icerisine aliriz
        int k;
        try {
            FileInputStream fis = new FileInputStream("src/day39_exceptions/Test.txt");
            while ((k = fis.read()) != -1) { // FileInputStream dosyasi uzerinde dosyayi harf harf okuyor
                                             // okunacak harf kalmadiginda bize -1 donuyor
                System.out.print((char) k);
                /*
                Java'da 39. gundeyiz
                Biz Java'yi cok sevdik
                Umarim o da bizi sevmistir.
                 */
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi");
        } catch (IOException e) {
            System.out.println("Dosyan bilgiler okunamadi");
        }
        /*
        eger tek bir try'li(multiple catch) try-catch'lerde catch'lerin en disindaki daha kapsayici olmalidir
        yukaridaki ornekteki gibi; IOException FileNotFoundExceptionin'nin parent'idir
         */


    }
}
