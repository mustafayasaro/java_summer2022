package day30_immutable_date;

import java.time.LocalDate;
import java.time.LocalTime;

public class C04_LocalTime {

    public static void main(String[] args) throws InterruptedException {

        LocalTime time1 = LocalTime.now();

        System.out.println(time1); // 19:12:18.801665900

        Thread.sleep(3000); //  kodlarimizi icine yazdigimiz milisaniye kadar bekletir
                                  // Java bu satirda 3 saniye bekler

        System.out.println(time1); // 19:12:18.801665900

        /*
        Bizim olusturdugumuz date ve time canli saat veya tarih degildir
        LocalTime.now(); kullandigimiz satirda o anki tarih veya saati alip store eder.
        time1 variable'inin degeri SAABITTIR
         */

        time1 = LocalTime.now();
        System.out.println(time1); // 19:12:21.801665900


        System.out.println(time1.getSecond());

        System.out.println(time1.plusSeconds(10000)); // 100000 sanoiye sonra zaman ne olur

        System.out.println(time1.minusMinutes(200)); // 200 dakika once saat kacti

        System.out.println(time1.withHour(3)); // saat kismini 03 yapar

    }
}
