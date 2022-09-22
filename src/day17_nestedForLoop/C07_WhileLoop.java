package day17_nestedForLoop;

public class C07_WhileLoop {

     /*
       for loop while loop ve do while loop ta
       baslangic sayisi
       bitis sayisi
       artis ya da azalis miktari olmak zarunda

       artis/ azalis miktarini loopun kendisi olusturmuyorsa biz olustrmaliyiz
       olusturmazsak while loop sonsuz donguye girer.
     */

    /*
    avantaj
     - yapisi basit
     - disardan manuel olarak baslangic sartini eklemelisin
     */

    public static void main(String[] args) {
        /*
        20'den 50'ye kadar cift sayilari yazdiralim (sinirlar dahil)
         */
        //        >>>>>>>>for loop <<<<<<<<
        int baslangic = 20;
        int bitis = 50;
        for (int i = baslangic; i <= bitis; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " "); // 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50
            }
        }
        System.out.println("");


        //     >>>>>>>>>  while loop <<<<<<<<<<

        int temp = baslangic;
        while (temp <= bitis) {
            if (temp % 2 == 0) {
                System.out.print(temp + " ");  // 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50
            }
            temp++;
        }
    }
}


