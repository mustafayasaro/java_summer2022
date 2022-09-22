package day30_immutable_date;

import java.time.LocalDate;
import java.time.Month;

public class C03_Date {
    /*
        3  farkli class vardir
       1 Local date
       2 local time
       3 local date time
     */

    public static void main(String[] args) {

        /*
        LocalDate tarih = new LocalDate()
        boyle olusturamayiz cunku bu class'dan LocalDate class'ina ulasamayiz
        cunku LocalDate class'i private'dir
         */
        LocalDate tarih = LocalDate.now();
        System.out.println(tarih); // 2022-07-23
        System.out.println(tarih.getDayOfYear()); // 204  <> Bugun yilin 204. gunu
        System.out.println(tarih.getDayOfWeek()); // SATURDAY <<>> bugun haftanin hangi gunu
        System.out.println(tarih.getMonthValue()); // 7
        System.out.println(tarih.getMonth()); // JULY
        System.out.println(tarih.isLeapYear()); // false

        LocalDate tarih2 = LocalDate.of(1994,9,  5);
        System.out.println(tarih2); // 1994-09-05
        //Eger su anki tarih ile degil de gelecek veya gecmis bir
        // tarihle islem yapacaksak LocalDate.of() methodu kullanilir

        /*
         Octal integer >> 8lik sistem   09 yerine 9 yazilir
         */

        LocalDate tarih3 = LocalDate.of(1990,Month.JANUARY, 10);
        System.out.println(tarih3); // 1990-01-10
        System.out.println(tarih3.plusDays(100)); // 1990-04-20
        System.out.println(tarih3.plusYears(5).plusMonths(3).plusDays(12));
        //1995-04-21

        System.out.println(tarih.minusWeeks(20)); // 2022-03-05
        System.out.println(tarih.minusDays(100).minusMonths(5)); // 2021-11-14
        System.out.println(tarih.isAfter(tarih2)); // true

        /*
        Iki farkli dogum gunu girildiginde hangisind doganan daha buyuk olani bulun

        tarih2 ve tarih3 icin bunu yapalim
         */

        System.out.println(tarih2.isAfter(tarih3)); // true

        if (tarih2.isAfter(tarih3)){
            System.out.println(tarih3 + "  tarihinde dogan daha buyuk");
        }else if(tarih2.isBefore(tarih3)){
            System.out.println(tarih2 + "  tarihinde dogan daha buyuk"); // 1990-01-10  tarihinde dogan daha buyuk
        }else {
            System.out.println("iki tarihte de dogan kisiler ayni yasta");
        }

        /*
        LocalDate is an immutable
         */




    }


}
