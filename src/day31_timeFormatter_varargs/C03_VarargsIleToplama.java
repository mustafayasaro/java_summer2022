package day31_timeFormatter_varargs;

public class C03_VarargsIleToplama {

    public static void main(String[] args) {


        /*
        Verilen kac int olursa  olsun sonucu yazdiran bir method olusturun
        variable number of arguments(varargs) = degisken sayidaki argument
         */
        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 30;
        int sayi4 = 40;
        int sayi5 = 50;

        //  varargs array altyapisini kullandigi icin :
        toplaYazdir(sayi1, sayi2, sayi3, sayi4);// Bu method call icerisinde 4 element olan bir array
        toplaYazdir(sayi1, sayi2, sayi3);// Bu method call icerisinde 3 element olan bir array
        toplaYazdir(sayi1, sayi2);   // Bu method call icerisinde 2 element olan bir array


    }

    public static void toplaYazdir(int... sayi) { // parametre ismi olarak yazdigim "sayi" isminin hicbir onemi yok
                                                  // farkli bir isim de olabilirdi Cunku Java passByValue
                                                  // ozelligiyle yukaridaki variable'in kopyasi uzerinden
                                                  // islem yapiyor
        /*
        int.. sayi : bu gosterin integer variable'lardan olussan bir varargs demektir
        varargs arrayarray altyapisini kullanilir
         */

        int toplam = 0;
        int sayiAdedi= sayi.length;
        for (int each : sayi
        ) {
            toplam += each;
        }
        //varargs'da for kullanacaksak eleman sayisini bilmedigimiz icin foreach kullaniriz.

        System.out.println("Girilen "+sayiAdedi+ " adet sayinin toplami : "+ toplam);
        /*
        Girilen 4 adet sayinin toplami : 100
        Girilen 3 adet sayinin toplami : 60
        Girilen 2 adet sayinin toplami : 30
         */
    }

}
