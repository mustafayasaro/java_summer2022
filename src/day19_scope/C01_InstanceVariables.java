package day19_scope;

public class C01_InstanceVariables {
    /*
    Class icerisnde heryerden kullanmak istediginiz variable'lari
    class level'da (Classs'i icerisinde method'larin disinda) yazariz.
    genellikle class level variable'lar class'in basinda olur


    class level'daki variable'lar icin iki scope vardir
    1)  Static variables
        Static variable'lara Class variable'larda denir
    2)  Instance variable
        Static olmayan variable'lar dir
        Obje variable'i da denir
     */

    int instSayi = 20; //Static olmayip class level'da oldugu icin instance variable'dir


    public static void main(String[] args) {

        int sayi = 10;


       /*
       System.out.println(instSayi);
       instance variables static olmadigi icin static kulube uye olan
       main method'da direkt kullanamayiz
       instance variable'larin diger adi object variable'lardir
       dolayisiyla obje olusturursak instance variable'lari heryerden kullanabiliriz

        */
        C01_InstanceVariables obje1 = new C01_InstanceVariables();
        System.out.println("obje1 degismeden once : " + obje1.instSayi);
        obje1.instSayi = 30;
        System.out.println("obje1 degisdikten sonra : " + obje1.instSayi);

        C01_InstanceVariables obje2 = new C01_InstanceVariables();
        System.out.println("obje2 degismeden once : " + obje2.instSayi); // 20

        obje2.instSayi = 25 ;
        System.out.println("obje2 degisdikten sonra : " + obje2.instSayi);

        C01_InstanceVariables obje3 = new C01_InstanceVariables();
        System.out.println("obje3 degismeden once : " + obje2.instSayi); // 20
        /*
        Her obje olusturuldugunda  instance(obje) varable'inin ilk atanan degerini alir
         */





    }

    public static void voidstaticMethod(){
        /*
        System.out.println();
        bir methodun icersinde olusturulan bir variable
        sadece o methodun icersinde kullanilabilir
         */
        /*
        instSayi = 30;
        instance variable'lara main  method disindaki static methodlardanda direkt ulasamayiz
        obje olusturursak ulasabiliriz
         */

        C01_InstanceVariables obje4 = new C01_InstanceVariables();
        System.out.println(obje4.instSayi);

    }

    public void staticOlmayanMethod(){

      //  instSayi = 55;

        System.out.println(instSayi);
        /*
        Instance avriable'lar class icersindeki statik olmayan methodlardan direkt kullanilabilir
         */


    }

}
