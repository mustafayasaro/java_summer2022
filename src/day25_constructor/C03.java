package day25_constructor;

public class C03 {

    /*
    Proje olustururken bazi Classlar run etmek icin degil
    variable ve method olusturup bunlari baska Class'lardan
    kullanmak icin olusturulur

    C03 == kaliphane >>main method yok
     */
    /*
    Default constructor parametresizdir
    goremezsek bile ihtiyac oldugunda calisir

    Class icerisinde parametreli veya parametresiz
    herhangi bir constructor olusturursak
    Java default constructor'u siler
     */
    C03(){
    }
    /*
    Olusturdugumuz parametresiz bu construccor
    default constructor ile bire bir aynidir

    Ama biz olusturdugumuz icin default constructor demeyiz
    Parametresiz constructor deriz
    Bunu yazdigimizda default constructor silinir
    */
    String isim = "Etka";
    public void method01(){
        System.out.println("C03 clas'inin methoduyum");
    }
}
