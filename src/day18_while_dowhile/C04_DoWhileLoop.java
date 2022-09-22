package day18_while_dowhile;

import java.util.Scanner;

public class C04_DoWhileLoop {

    public static void main(String[] args) {
        /*
        Kullanicidan tam sayilar alin
        kullanici cift sayi girdigi mudddetce sayilari yazdiirin
        tek sayi girdiginnde islemi biitrin
         */

        Scanner scan = new Scanner(System.in);


        int sayi = 0; // loop'a girebilmek icin bastan atama yapmaliyiz
        // degeri daha bastan loop'u kirmayacak bir sayi atamaliyiz


        /*
        loop'larda kullanacagimiz variable'lari loop'lardan once olusturmaliyiz
        while loop'da loop'dan once olussturdugunuz bu variable'a atayacagimiz degeri
        iyi dusunmemiz gerekiz
         */
        while (sayi % 2 == 0) {
            System.out.println("Lutfeen tamsayi giriniz");
            sayi = scan.nextInt();

            if (sayi % 2 == 0) {
                System.out.println("girilen sayi cift : " + sayi);
            } else {
                System.out.println("Girdiginiz sayi tek sayidir");
            }
        }


        // do while loop ile cozumu
        //do while loop'da sayinin ilk atamasi onemli degil cunku
        //do while loop'da onceden olusturulan variable'a hangi deger atandiginin
        //hicbir onemi yok kodumuz her durumda calisir

        /*
        dezavantaj :  ilk calistirma kontrol yapilmadan oldugu icin
        loop'un body'sinde yanlis islem yapilmamasina dikkat etmek gerekir
         */

        do {
            System.out.println("Lutfeen tamsayi giriniz");
            sayi = scan.nextInt();

            if (sayi % 2 == 0) {
                System.out.println("girilen sayi cift : " + sayi);
            } else {
                System.out.println("Girdiginiz sayi tek sayidir");
            }
        } while (sayi % 2 == 0);


        /*
        while loop'da loop'dan once olusturdugumuz deger
        atadigimiz variable'a dikkat etmeliyiz

        do while loop'da ise ilk degerin
        yanlis bir sonuc olusturmadigini do'nun icerisinde if ile kontrol etmeleyiz
         */

    }
}
