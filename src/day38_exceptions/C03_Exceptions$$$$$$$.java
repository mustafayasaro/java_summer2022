package day38_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exceptions$$$$$$$ {


    public static void main(String[] args) {

        /*
        Marketteki tum urunleri bir array'de tuttugumuzu varsayalim
        Kullaniciya index sorup o index'teki o urunu yazdiran bir program hazirlayalim
        Kullanici urun sayisindan buyuk bir inedex girerse
        exceptions vermesinin onune gecelim
         */

        String[] urunler = {"Nutella", "Cokokrem", "Sut", "Cay", "Findik"};

        Scanner scan;
        int istenenSira = 0;

        boolean varMi = false;
        while (!varMi){
            try {
                scan = new Scanner(System.in); // loop dongusunu kirip tekrar kullanicidan almak icin buraya yazdik
                System.out.println("Istediginiz urunun sira nosunu giriniz");
                istenenSira = scan.nextInt(); // Eger istenen deger
                System.out.println("Aradiginiz urun : " + urunler[istenenSira-1]);
                varMi = true;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Girdiginiz sira listemizde bulunmuyor" +
                        "\nSira numarasi en fazla : " + urunler.length  + " olabilir" );
            }catch (InputMismatchException a){
                System.out.println("Lutfen sira numarasini tamsayi olarak giriniz");
            }
        }


    //   while (true) {
    //       try {
    //           System.out.println("Istediginiz urunun sira nosunu giriniz");
    //           istenenSira = scan.nextInt();
    //           System.out.println("Aradiginiz urun : " + urunler[istenenSira - 1]);
    //           break;
    //       } catch (InputMismatchException e) {
    //           System.out.println("Urun index'i icin bir tam sayi girmeniz gerekli");
    //           scan.next();
    //           continue;
    //       } catch (ArrayIndexOutOfBoundsException e) {
    //           System.out.println("Girdiginiz sira listemizde bulunmuyor \nSira numarasi en fazla : " + (urunler.length) + " olabilir");
    //           scan.nextLine();
    //           continue;
    //       }
    //   }

        // catch blogu: o exc. yakaldigimizda verecegimiz mesaj
        /*
        catch blogunun onundeki parantezde
        exception class'inin ismi yaninda
        yakalanan exceptioni atadigimiz variable'in ismi olur(e)

        Eger yakalanan exception ile ilgili bilgileri
        kullaniciya vermek isterseniz
        bu objeyi kullanabiirsiniz
         */


    }
}
