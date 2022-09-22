package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArraydenArrayListYapma {

    public static void main(String[] args) {


        /*
        Uzun listeler olusturmamiz gerektiginde
        tek tek eklemek yerine bir array olusturup bunlari
        liste cevirebiliyoruz

        1-) Loop ile arraydeki tum elemanlari liste atabiliriz
        2-) Arrays.asList() kullanabiliriz
            Ancak bu methodun 2 tane yan etksi var
            - Arrays classi kullanildigi icin Array ozellikleri gecerli olur
            dolayisiyla list'te olan add() remove() gibi size'i degistiren
            methodlar bu sekilde ousturulan list'lerde kullanilamaz
            - Kaynak olan array'le urun olan list ozdeslestirilir
              birinde yapilan degisiklik digerini de etkiler.
         */

        String[] arr = {"Ismial","Nurullah","Fatih"};
        List<String> sinifList = Arrays.asList(arr);
        System.out.println(sinifList); // [Ismial, Nurullah, Fatih]

        List<Integer> sayilar = Arrays.asList(new Integer[5]);


        //1. Yan etki

        //sinifList.add("Erdi");  UnsupportedOperationException
        //System.out.println(sinifList);
        //sinifList.remove(1);  //1. indexi remove et    UnsupportedOperationException


        //  2. Yan etki

        arr[1] = "Emre";
        System.out.println("Degisim sonrasi array : " + Arrays.toString(arr));
        //Degisim sonrasi array : [Ismial, Emre, Fatih]

        System.out.println("Array'i degistirince List : " + sinifList);
        // Array'i degistirince List : [Ismial, Emre, Fatih]


        sinifList.set(0, "Utku");
        System.out.println("List'i deisirince List : " + sinifList);
        //List'i degistirince List : [Utku, Emre, Fatih]

        System.out.println("List'i degistirince Array : " + Arrays.toString(arr));
        //  List'i degistirince Array : [Utku, Emre, Fatih]



    }
}
