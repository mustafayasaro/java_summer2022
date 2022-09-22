package day08_ifstatements;

import java.util.Scanner;

public class C06_InterviewQuestion_ArtikYil {

    public static void main(String[] args) {
        /*
        Kulanicidan bir yil isteyin artik yil olup olmadigini kontrol edin

         - 4'e bolunemeyen yillar artik  yil degildir
         - 4 ile bolunup 100'e bolunemeyen yillar artik yildir
         - 4'un kati olmasina ragmen 100'e bolunebilen yillardan 400'un kati olan yillar artik yildir

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir yil giriniz");
        int yil = scan.nextInt();

        if (yil % 100 != 0) {
            if (yil % 4 == 0) {
                System.out.println(yil + " artik yildir");
            } else {
                System.out.println(yil + " artik yil degildir");
            }
        } else if (yil % 100 == 0) {
            if (yil % 400 == 0) {
                System.out.println(yil + " artik yildir");
            } else {
                System.out.println(yil + " artik yil degildir");
            }
        }


    }
}
