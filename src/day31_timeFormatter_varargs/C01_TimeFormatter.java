package day31_timeFormatter_varargs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {

    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println("ilk olusturulan tarih" + tarihSaat);
         //  ilk olusturulan tarih2022-07-25T21:40:49.555130400

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/M/yy   hh:mm");
        System.out.println(dtf1.format(tarihSaat)); // 25/7/22   09:45

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("d/MMM/yyyy   HH:mm");
        System.out.println(dtf2.format(tarihSaat)); // 25/Jul/2022   21:46

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("d/MMMM/yyyy   hh:mm a");
        System.out.println(dtf3.format(tarihSaat)); // 25/July/2022   09:49 PM






    }
}
