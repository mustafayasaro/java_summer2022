package day25_constructor;

public class C05_Car {

    /*
    Bu Class bizim kaliphanemiz
    bir araba olusturmak icin ihtiyacimiz olan
    variable ve methodlari bu classda belirleriz

    Sonra farkli classlarda araba olusturmamiz gerekirse
    bu class'dan obje olusturup bu car classinda
    belirlenen variable ve methodlara gore araba uretilir
     */

    String marka = "Marka belirtilmedi"; //Bu bizin kalibimiz oldugu icin atama yapmak zorunda degiliz
    String model = "Model belirtilmed";
    public  int yil;
    public  int fiyat;


    public void benzinliArac() {
        System.out.println("Bu arac benzinli motora sahiptir");
    }

    public void maxHiz(int hiz) {
        System.out.println("Bu araba maximum " + hiz + "km hiz yapar");
    }
}
