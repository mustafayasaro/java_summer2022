package day22_multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class C09_get {

    public static void main(String[] args) {

        List<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(7);

        List<String> isimler = new ArrayList<>();
        isimler.add("Erdal");
        isimler.add("Hakan");
        isimler.add("Enes");

        System.out.println(isimler.get(2)); // Enes
        System.out.println(sayilar1.get(1)); // 3
         //generic method denir
        // Ben String icin uygularsam bana String
        // Ben integer icin olusturdugumda bana integer donuyor
        for (int i = 0; i < 3; i++) {
            System.out.print(isimler.get(i) + " "); // Erdal Hakan Enes
        }

    }
}
