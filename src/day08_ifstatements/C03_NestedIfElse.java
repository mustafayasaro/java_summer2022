package day08_ifstatements;

import java.util.Scanner;

public class C03_NestedIfElse {
    public static void main(String[] args) {
        /*
        Emeklilik kontrolu yapan bir program  yapiniz
        cinsiyet olarak E erkek K kadin degiskenlerini kabul edin
        farkli bir harf ya da rakam girilirse hata mesaji versin
        emeklilik icin kadinlarda yas siniri 60
        erkeklerde 65 olsun
        negatif yas ya da 120'den buyuk sayi girilirse hata mesaji verilsin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz" +
                "\nKadinsaniz k karfine " +
                "\nErkekseniz e harfine basiniz");

        char cinsiyet = scan.next().toLowerCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();
        if (cinsiyet == 'e') {
            if (yas < 0 || yas > 120) { System.out.println("Lutfen gecerli bir yas giriniz");
            } else if (yas > 65) {System.out.println("Emekli olabilirsiniz");
            } else {System.out.println("emekli olamazsiniz");
            }
        } else if (cinsiyet == 'k') {
            if (yas < 0 || yas > 120) {System.out.println("Lutfen gecerli bir yas giriniz");
            } else if (yas > 60) {System.out.println("Emekli olabilirsiniz");
            } else {System.out.println("emekli olamazsiniz");
            }
        } else {System.out.println("Lutfen gecerli bir cinsiyet seciniz");}




    }
}
