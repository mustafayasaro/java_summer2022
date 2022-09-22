package day18_while_dowhile;

public class C03_DoWhileLoop {
    public static void main(String[] args) {


        /*
        while loop'da once kontrol edip sonra islem yaptigimiz icin i
        islem bittikten sonra loop'un kirilmasi icin bir kez daha basa donmemiz gerekir
        bosylece fazladan bir islem fazla yapiliyor
         */
       int sayi = 7;

    //   while (sayi < 10){
    //       System.out.print(sayi + " ");
    //       sayi++;

            // do-while loop ile yaptigimiz zaman bu dezavantaj ortadan kalkar

            sayi = 7;
            do{
                System.out.print(sayi + " ");
                sayi++;

            }while (sayi<10);




    }
}
