package homework;

import java.util.Scanner;

public class HW_14MethodCreation {
    /*
    Email kontrolu yapan bir program yazin.
    Kullanicinin girdigi mail
    -@ icermiyorsa "Gecersiz sifre"
    - @gmail.com icermiyorsa "Lutfen gmail adresinizi giriniz"
    - @gmail.com ile bitmiyorsa "Yazimda bir hata var, maili kontrol ediniz"
     */
    public static void main(String[] args) {
        mailKontrol();
    }

    public static void mailKontrol() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi giiriniz.");
        String mail = scan.next();

        if (mail.contains("@") == false){
            System.out.println("Gecersiz sifre.");
        } else if (mail.contains("@gmail.com") == false) {
            System.out.println("Lutfen gmail adresinizi giriniz.");
        } else if (mail.endsWith("@gmail.com") == false) {
            System.out.println("Yazimda bir hata var, maili kontrol ediniz.");
        }
    }

}
