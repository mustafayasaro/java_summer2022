package day39_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_IllegalArgumentException {
    public static void main(String[] args) {

        /*
        Kullanicidan yasini girmesini isteyin.
        Kodunuzu kullanici sifirdan kucuk bir sayi girerse
        Exception verecek sekilde yazin.
         */
        /*
        throws compile time exception'lar icin gecerlidir
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Yasinizi Giriniz");
        int yas;

        try {
            yas = scan.nextInt();
            if(yas<0){
                throw new IllegalArgumentException();
            }else {
                System.out.println("Yasiniz :  " + yas);
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.err.println("Yasiniz negatif olamaz");
            //Yasiniz negatif olamaz >> kirmizi renkte yazdirdi
        }catch (InputMismatchException e){
            e.printStackTrace();
            System.err.println("Lutfen sayi giriniz");
        }
    }
}
