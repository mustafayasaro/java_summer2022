package day26_constructor;

public class KamyonRunner {

    public static void main(String[] args) {


        Kamyon kamyon1 =new Kamyon();

        System.out.println("kamyon1 ozellikleri " + kamyon1.toString());

        /*
        kamyon1 ozellikleri
           marka=Marka belirtilmedi
           model=Model belirtilmed
           yil=0
           fiyat=0
         */



        Kamyon kamyon2 = new Kamyon("Mercedes", "4140", 2005, 500000);
        System.out.println("kamyon2 bilgileri : "+kamyon2.toString());
        // toString yazmasak bile yazdirir

        /*
        kamyon2 bilgileri :
           marka=Mercedes
           model=4140
           yil=2005
           fiyat=500000
         */





        Kamyon kamyon3 = new Kamyon("Man", "as900",2007, 400000);
        System.out.println("kamyon3 bilgileri : "+kamyon3.toString());

        /*
        kamyon3 bilgileri :
            marka=Man
            model=as900
            yil=2007
            fiyat=400000
                    */




        Kamyon kamyon4 = new Kamyon("Scania", "s540");

        System.out.println("kamyon4 bilgileri : " + kamyon4);

        /*
        kamyon4 bilgileri :
            marka=Scania
            model=s540
            yil=0
            fiyat=0
         */


    }
}
