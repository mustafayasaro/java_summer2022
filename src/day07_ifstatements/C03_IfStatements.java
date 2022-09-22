package day07_ifstatements;

public class C03_IfStatements {

    public static void main(String[] args) {

        /*
        Bir if statement da {} kullanilmazsa Java ilk satiri sart ile baglar
        sonraki satirlar bagimsiz olur

        Eger birdenn fazla satir  ayni if  sartina baglanmissa mutlaka {} kullanmaliyiz
         */

        int sayi = -10;

        if (sayi > 0)
            System.out.println("sayi pozitif");
            System.out.println("pozitif kalacaktir"); // ekranda yazdirir

        if (sayi % 2 == 0)
            System.out.println("sayi cift");   // ekranda yazdirir
            System.out.println("Sayi cift kalacaktir"); // ekranda yazdirir

        if (sayi % 5 == 0)
            System.out.println("sayi besin tam kati");  // ekranda yazdirir


    }
}
