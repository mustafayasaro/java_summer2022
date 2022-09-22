package day18_recap_homework;

import java.util.*;

public class C01_WhileLoop {

    public static void main(String[] args) {
        /*
        Kullaniidan baslangic ve bitis harflerini alin
        baslangic harfinden baslayip bitis harfine kadar olan
        butun harfleri buyuk harf olarak ekrana yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter starting value");
        char starting = scan.next().toUpperCase().charAt(0);

        System.out.println("Please enter ending letter");
        char ending = scan.next().toUpperCase().charAt(0);

        while (starting < ending) {
            System.out.println(starting);
            starting++;
        }
        System.out.print(starting + " ");


    }
}
