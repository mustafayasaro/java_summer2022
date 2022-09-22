package interview_questions;

import java.util.Scanner;

public class Q06_DakikadanYilHesaplama {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dakika giriniz");
        int minute = scan.nextInt();
        int yil = 525600; //dakika
        int gun = 1440; //dakika
        int kalan = ((minute / yil));
        int kalan2 = ((minute % yil) / gun);

        System.out.print(minute + " dakika yaklasik olarak " + kalan + " yil " + kalan2 + " gundur");
    }
}

