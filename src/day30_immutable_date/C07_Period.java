package day30_immutable_date;

import java.time.LocalDate;
import java.time.Period;

public class C07_Period {

    public static void main(String[] args) {

        /*
        2 tarih arasindakki sureyi bulma
         */

        LocalDate tarih1 = LocalDate.of(1994,9,5);
        LocalDate bugun = LocalDate.now();

        Period period = Period.between(tarih1,bugun);
        System.out.println(period); // P27Y10M18D
        //bugun ile verilen tarihteki farki verir

        System.out.println(period.getYears()); // 27


    }
}
