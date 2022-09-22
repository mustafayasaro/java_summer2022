package lambda_functional_programming;

import java.util.stream.IntStream;

public class Fp04 {

    public static void main(String[] args) {

        System.out.println("get7den100eToplam() = " + get7den100eToplam());
        // get7den100eToplam() = 5029
        System.out.println("get7den100eToplam2() = " + get7den100eToplam2());
        System.out.println("get2den11eCarpim() = " + get2den11eCarpim());
        //get2den11eCarpim() = 39916800
        System.out.println("faktoriyelHesapla() = " + faktoriyelHesapla(5));
        // faktoriyelHesapla() = 120
        System.out.println(verilenIkiSayıArasındakiCiftSayılarınToplamı(7, 5));
         // 6
        System.out.println("ikiSayiArasindakiTumSayilarinRakamlariToplami(23,32) = " + ikiSayiArasindakiTumSayilarinRakamlariToplami(23, 32));
         // ikiSayiArasindakiTumSayilarinRakamlariToplami(23,32) = 68

    }


    //1) 7'den 100'e kadar integer değerlerinin toplamını bulan bir method oluşturun.

    //1. yol
    public static int get7den100eToplam() {
        return IntStream.range(7, 101).reduce(Math::addExact).getAsInt();
        //
    }


    //2. yol
    public static int get7den100eToplam2() {
        return IntStream.rangeClosed(7, 10).reduce(Math::addExact).getAsInt();
        //  rangeClosed == yazilan iki sayi da akisa dahil ediliyor
    }


    //2) 2'den 11'e kadar integer değerlerinin çarpımını bulan bir method oluşturun.

    public static int get2den11eCarpim() {
        return IntStream.rangeClosed(2, 11).reduce(Math::multiplyExact).getAsInt();
    }


    //3) Verilen bir sayının faktoriyelini hesaplayan bir method oluşturun. (5 factorial = 1*2*3*4*5  ==> 5! = 1*2*3*4*5)

    public static int faktoriyelHesapla(int x) {
        if (x > 0) {
            return IntStream.rangeClosed(1, x).reduce(Math::multiplyExact).getAsInt();
        }
        System.out.println("0dan buyuk deger giriniz");

        return 0;
    }


    //4) Verilen iki sayı arasındaki çift sayıların toplamını bulan bir method oluşturun.

    public static int verilenIkiSayıArasındakiCiftSayılarınToplamı(int x, int y) {
        int z = 0;
        if (x > y) { // eger ki ilk girilen sayi(x) son girilen sayidan(y) buyukse x ile y'nin yerini degistirdikten sonra isleme sokuyruz
            z = x;
            x = y;
            y = z;

        }
        return IntStream.rangeClosed(x, y).filter(Utils::ciftElemanlariSec).reduce(Math::addExact).getAsInt();
    }


    //5) Verilen iki sayı arasındaki tüm sayıların rakamlarının toplamını hesaplayan bir method oluşturun.
    //  23 and 32 ==> 2+3  +  2+4  +  2+5  +  2+6  +  2+7  +   2+8  +   2+9  +   3+0  +   3+1  +   3+2 ==> 68

    public static int ikiSayiArasindakiTumSayilarinRakamlariToplami(int x, int y){
        int z = 0;
        if (x > y) { // eger ki ilk girilen sayi(x) son girilen sayidan(y) buyukse x ile y'nin yerini degistirdikten sonra isleme sokuyruz
            z = x;
            x = y;
            y = z;

        }

        return IntStream.rangeClosed(x,y).map(Utils :: rakamlarToplamiAl).sum();
    }






}
