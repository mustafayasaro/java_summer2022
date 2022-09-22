package day26_constructor;

public class Araba {

    String marka = "Marka belirtilmedi";
    String model = "Model belirtilmed";
    public int yil;
    public int fiyat;

    public Araba(String markaR, String modelR, int yilR, int fiyatR) {
        marka = markaR;
        model = modelR;
        yil = yilR;
        fiyat = fiyatR;
    }

    /*
        Biz herhangi bir constructor olusturdugumuzda
        Java defaut constructoru siler
        Eger biz projemizde bir sorun yasanmasini istemiyorsak
        mutlaka default constructor yerine
        parametresiz constructor olusturmaliyiz
         */
    public Araba() {

    }


    public void benzinliArac() {
        System.out.println("Bu arac benzinli motora sahiptir");
    }

    public void maxHiz(int hiz) {
        System.out.println("Bu araba maximum " + hiz + "km hiz yapar");


    }
}
