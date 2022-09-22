package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_remove {

    public static void main(String[] args) {

        List<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(7);
        sayilar1.add(1);

        System.out.println(sayilar1); // [5, 3, 7, 1]
        sayilar1.remove(1);

        /*
        sayilardan olusan bir list varsa
        Java remove metodunda sayi yazdigimizda
        direkt index olarak kabul eder
         */
        System.out.println(sayilar1); // [5, 7, 1]

        // illa 5 i silmek istiyorsak
        // silinecek objeyi variable'a tanimlayabiliriz

        Integer sil = 5;
        sayilar1.remove(sil);
        System.out.println(sayilar1);  // [7, 1]

        //indexOf metodundan yardim alabilirim

        sayilar1.remove(sayilar1.indexOf(1)); //  1'i silmek icin 1'in indexini bulup onnu remove'a yazabiliriz
        System.out.println(sayilar1); // [7]





    }
}
