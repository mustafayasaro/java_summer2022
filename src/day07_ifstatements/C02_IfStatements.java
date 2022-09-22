package day07_ifstatements;

public class C02_IfStatements {
    public static void main(String[] args) {
        int sayi = 10;

        if (sayi > 0) {
            System.out.println("sayi pozitif");
        }
        if (sayi % 2 == 0) {
            System.out.println("sayi cift");
        }
        if (sayi % 5 == 0) {
            System.out.println("sayi besin tam kati");
        }


        /*
        Basit if cumleleri kodun diger parcalarindan bagimsizdir
        sadece bir sart kontrol eder, sart asglaniyorsa if body calisir, yoksa calismaz
        birden fazla basit ifcumlesi varsa girilen sarta bagli olarak
        tumunde if bodysi calisabilir, bir kismi  calisabilir, veya
        hicbir if bosdy'si calismayabilir
         */




    }
}
