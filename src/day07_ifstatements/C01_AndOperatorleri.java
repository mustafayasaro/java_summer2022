package day07_ifstatements;

public class C01_AndOperatorleri {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 20;

        System.out.println(a > 0 && b < 20 && c >= b);

        System.out.println(a < 0 && b < 20 &&  c >= b); //Java ilk sarti kontrl edip false u bulduktan sonra
                                                       //  cift && de diger sartlari kontrol etmeden false doner

        System.out.println(a < 0 & b < 20 & c >= b); // tek & kullandigimizda ilk sart yonlis olsa bile java diger
                                                     // sartlari da kontrol eder.
                                                      // bundan dolayi java yavas calisir

    }
}
