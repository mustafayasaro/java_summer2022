package day30_immutable_date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C08_DateTimeFormatter {
    public static void main(String[] args) {
        DateTimeFormatter  dtf = DateTimeFormatter.ofPattern("yyyy/MMMM/dd");
        LocalDate tarih = LocalDate.now();
        System.out.println(dtf.format(tarih)); // 2022/July/24
        /*
        yy : yilin son iki harfini verir
        yyyy : yilin tamamini verir
        MMMM : Ayin isminin tamaamini verir
        MMM : Ayin isminin ilk uc harfini verir
        MM : Ayin sirasini verir
        M : Ayin sirasini verir
        HH : 24 saatlik dilime gore saati verir
        hh : 12 saatlik dilime gore saati verir
         */
    }
}
