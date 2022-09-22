package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_size {

    public static void main(String[] args) {


        List<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(7);

        System.out.println("listenin boyutu : " + sayilar1.size()); // listenin boyutu : 3
        sayilar1.add(2);
        sayilar1.addAll(sayilar1);

        System.out.println(sayilar1);  //  [5, 3, 7, 2, 5, 3, 7, 2]

        System.out.println("listenin boyutu : " + sayilar1.size()); //listenin boyutu : 8

        System.out.println(sayilar1.set(2, 8)); // 7
        System.out.println(sayilar1);  //  [5, 3, 8, 2, 5, 3, 7, 2]

        System.out.println(sayilar1.set(0, 12)); // 5

        System.out.println(sayilar1);   //  [12, 3, 8, 2, 5, 3, 7, 2]

        /*
        set methodu istenen indexteki eski elementi silip
        yerine verdigimiz yeni elementi set eder

        eger eski elementi silmek istemiyorsak
        add(index, deger) methodunu kullanabiliriz

        set methodu sildigi eski elementi bize dondurur
         */





    }
}
