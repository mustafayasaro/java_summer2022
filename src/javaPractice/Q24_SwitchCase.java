package javaPractice;

import java.util.Scanner;

public class Q24_SwitchCase {
    public static void main(String[] args) {

        // Girilen uc haneli bir sayının okunusunu yazı ile yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen uc basamakli bir sayi giriniz");
        int sayi = scan.nextInt();


        int birler = sayi % 10;
        int onlar = (sayi / 10) % 10;
        int yuzler = sayi / 100;

        if (sayi>=100 && sayi<1000){
            switch (yuzler) {
                case 1:
                    System.out.println("yuz");
                    break;
                case 2:
                    System.out.println("iki yuz");
                    break;
                case 3:
                    System.out.println("uc yuz");
                    break;
                case 4:
                    System.out.println("dort yuz");
                    break;
                case 5:
                    System.out.println("bes yuz");
                    break;
                case 6:
                    System.out.println("alti yuz");
                    break;
                case 7:
                    System.out.println("yedi yuz");
                    break;
                case 8:
                    System.out.println("sekiz yuz");
                    break;
                case 9:
                    System.out.println("dokuz yuz");
                    break;
            }
            switch (onlar) {
               case 1: System.out.println(" on"); break;
               case 2:System.out.println(" yirmi"); break;
               case 3:System.out.println(" otuz");break;
               case 4:System.out.println(" kirk");break;
               case 5:System.out.println(" elli");break;
               case 6:System.out.println(" altmis");break;
               case 7:System.out.println(" yetmis");break;
               case 8:System.out.println(" seksen");break;
               case 9: System.out.println(" doksan"); break;
               case 0:System.out.println("");break;
            }
            switch (birler) {
                case 1: System.out.println(" bir");break;
                case 2: System.out.println(" iki");break;
                case 3: System.out.println(" uc");break;
                case 4: System.out.println(" dort");break;
                case 5: System.out.println(" bes");break;
                case 6: System.out.println(" alti");break;
                case 7: System.out.println(" yedi");break;
                case 8: System.out.println(" sekiz");break;
                case 9: System.out.println(" dokuz");break;
            }

        }else {
            System.out.println("Ltfwn uc basamakli bir sayi giriniz");
        }

        System.out.print(yuzler);
        System.out.print(onlar);
        System.out.println(birler);
        }





    }

