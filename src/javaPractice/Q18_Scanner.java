package javaPractice;

import java.util.Scanner;

public class Q18_Scanner {
    public static void main(String[] args) {
        /*  Problem Tanımı
           Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
           a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

           Örnek Ekran Çıktısı
           a sayısını giriniz: 5
           b sayısını giriniz: 3
           c sayısını giriniz: 1
           sonuç : 5.333333333333333
       */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen a sayisini tanimlayiniz");
        double a = scan.nextDouble();
        System.out.println("Lutfen b sayisini tanimlayiniz");
        double b = scan.nextDouble();
        System.out.println("Lutfen c sayisini tanimlayiniz");
        double c = scan.nextDouble();

        double sonuc = (a*a-b*b)/3*c;
        System.out.println("sonuc = " + sonuc);





    }
}
