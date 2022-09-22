package day15_Overloading_ForLoop;

public class C08_Faktoriyel {
    public static void main(String[] args) {


        /*
        Input olarak verilen bir tamsayi icin faktoriyel hesaplayip
        yazdiran bir method olusturun

        verilen sayi 0, negatif veya 20'den buyuk olursa
        girilen sayinin faktoriyelin hesaplanamaz
         */

        int input = 21;

        faktoriyelHesapla(input);


    }

    public static void faktoriyelHesapla(int input) {
        int faktoriyel = 1;

        if (input>20 && input <0){
            System.out.println("girilen sayinin faktoriyelin hesaplanamaz");
        }else if (input == 0) {
            System.out.println("0! = 1");
        }else {
            for (int i = 1; i <= input ; i++) {
                faktoriyel *=i;
            }
            System.out.println(input+"! = " + faktoriyel);
        }

    }
}
