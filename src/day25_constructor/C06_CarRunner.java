package day25_constructor;

public class C06_CarRunner {

    public static void main(String[] args) {

        C05_Car car1 = new C05_Car();
        car1.fiyat = 150000;
        car1.yil = 2020;
        car1.marka = "Toyota";

        System.out.println("Car1  bilgileri \nMarka : " + car1.marka);
        System.out.println("Model : " + car1.model);
        System.out.println("Yil : " + car1.yil);
        System.out.println("Fiyat : " + car1.fiyat);
        /*
        Car1  bilgileri
           Marka : Toyota
           Model : Model belirtilmed
           Yil : 2020
           Fiyat : 150000

         */


        C05_Car car2 = new C05_Car();
        System.out.println("Car2  bilgileri \nMarka : " + car2.marka);
        System.out.println("Model : " + car2.model);
        System.out.println("Yil : " + car2.yil);
        System.out.println("Fiyat : " + car2.fiyat);

        /*
        Car2  bilgileri
          Marka : Marka belirtilmedi
          Model : Model belirtilmed
          Yil : 0
          Fiyat : 0
         */

        /*
        Herhangi bir obje uzerinden bir variable yazdirmaya calistigimizda
        Java degeri su siralama ile arar

        1- O obje olusturulduktan sonra olusturuldugu class'da bir deger atandi mi diye bakar
        2- Eger deger atanmamissa o variable'in olusturuldugu clasa(kaliphane) gider ve deger atanmissa assign eder
        3- Eger kaliphanede de deger atanmamissa Java default degeri atar.
         */

    }
}
