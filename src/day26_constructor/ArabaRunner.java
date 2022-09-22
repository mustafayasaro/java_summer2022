package day26_constructor;

import day25_constructor.C05_Car; // kutuphane gibi import etti

public class ArabaRunner {

    public static void main(String[] args) {
        C05_Car car1 = new C05_Car();
        System.out.println(car1.fiyat);  // 0
         /*
         farkli packageda oldugumuz icin public olmayan variable'lara ulasamadik
         ve car classina gidip variable'lari public yaptik
          */

        /*
        Araba class'indan bir obje olusturdugumda eger default constructor
        kullanildiysa tum ozellikler icin tek tek deger atamak zorunda kaliriz
         */
        Araba araba1 = new Araba();
        araba1.fiyat = 100000;
        araba1.marka = "Mercedes";
        araba1.yil = 2010;
        araba1.model = "C180";

        System.out.println("Araba1  bilgileri \nMarka : " + araba1.marka);
        System.out.println("Model : " + araba1.model);
        System.out.println("Yil : " + araba1.yil);
        System.out.println("Fiyat : " + araba1.fiyat);

        /*
        Araba1  bilgileri
          Marka : Mercedes
          Model : C180
          Yil : 2010
          Fiyat : 100000
         */

        /*
        Eger bir objeyi olustururken bazi ozelliklerini
        argument olarak belirtip o ozelliklerde bir obje olusturmak istersek
        Java itiraz eder
        Cunku her class'da default constructoor vardir ama o da parametresizdir
        bizim yeni ve parametreli constructorlara ihtiyacimiz var
         */

        Araba araba2 = new Araba("BMW", "5.20",2011,15000);

        System.out.println("Araba2  bilgileri \nMarka : " + araba2.marka);
        System.out.println("Model : " + araba2.model);
        System.out.println("Yil : " + araba2.yil);
        System.out.println("Fiyat : " + araba2.fiyat);

        /*
        Araba2  bilgileri
          Marka : BMW
          Model : 5.20
          Yil : 2011
          Fiyat : 15000
         */




        Araba araba3 = new Araba("Opel", "Astra", 2015, 78000);

        System.out.println("Araba3  bilgileri \nMarka : " + araba3.marka);
        System.out.println("Model : " + araba3.model);
        System.out.println("Yil : " + araba3.yil);
        System.out.println("Fiyat : " + araba3.fiyat);

        /*
        Araba3  bilgileri
           Marka : Opel
           Model : Astra
           Yil : 2015
           Fiyat : 78000
         */



        Araba araba4 = new Araba("Audi", "A5", 2020, 50000);

        System.out.println("Araba4  bilgileri \nMarka : " + araba4.marka);
        System.out.println("Model : " + araba4.model);
        System.out.println("Yil : " + araba4.yil);
        System.out.println("Fiyat : " + araba4.fiyat);

        /*
        Araba4  bilgileri
          Marka : Audi
          Model : A5
          Yil : 2020
          Fiyat : 50000
         */





    }


}
