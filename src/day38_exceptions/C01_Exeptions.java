package day38_exceptions;

public class C01_Exeptions {
    public static void main(String[] args) {

        /*
        Exception = istisna

        Bir sorunla karsilasmayi bekledigimiz noktalrda if else ile sorunu yakalayip
        onunla ilgili cozum uretebiliriz

        Ama sorunu her zaman if else ile cozemeyecegimizden
        Java try-catch block'larini olusturmustur
         */
        int a = 1000;
        int b = 500;

        int sayac =  1;
        while(sayac<1000){

            if(b==0){
                System.out.println("Islem yapilirken payda 0 oldu dikkat etmelisiniz");
            }else {
                System.out.println(a / b);
            }
            b--;
            sayac++;
        }
    }
}
