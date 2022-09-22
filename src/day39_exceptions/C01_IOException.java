package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOException {


    public static void main(String[] args) throws FileNotFoundException {
                                           // main methodun signaturune bu exceptionu yaz
                                           // diger alternatifi ise try-catc'dir
                                           // bu method calisirken FileNotFoundException firlatabilir


        /*
        Java'da bilgisayarimizdaki bir dosyay erismek istiyorsak
        FileInputStream class'indan yardim aliriz
        Ayni sekilde Java'dan bilgisayarimizdaki bir dosyayin ekleme
        veya update yapmak istersek
        FileOutputStream class'indan yardim aliriz
         */


        FileInputStream fis = new FileInputStream("src/day39_exceptions/Test.txt");

        /*
        Goruldugu gibi compile time'da altini kirmizi cizen her durum
        Compile Time Error degildir
        Java'da bazi exception'larda
        Compile Time Exception'dur
        Oellikle dosya okuma ve yazma ile ilgili exception'lar
        Compile Time Exception'dir

        Compile Time Exception olustugunda Java cozum icin 2 ihtimal onerir
        1- try-catch ile cevrelemek
        2- method signature'ina throws keyword ile beklene exception turunu yazmak

        throws Exception, sadece olayin farkinda oldugumuzun deklerasyonudur
        exception'un handle edilmesinde hicbir rolu yoktur
        Yani try-catch ile handle ettigimiz exception'larda
        kod calismaya devam ediyordu
        Ancak throws Exception yazdigimizda Java bir exception ile karsilasirsa
        hicbir sey yapamamisiz gibi hata mesaji yayinlayio calismayi durdurur





         */

    }







}
