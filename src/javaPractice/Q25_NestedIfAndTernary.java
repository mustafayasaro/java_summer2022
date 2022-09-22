package javaPractice;

public class Q25_NestedIfAndTernary {
    public static void main(String[] args) {
        /*
          0 ~ 9 arasındaki sayilari kelimelere cevirebilen bir java programi yazin
          sayı 9'dan buyuk veya sifirdan kucukse,
          cikis "Gecersiz" olmalidir
          NestedIf ve Ternary kullanarak 2 yolla da cozunuz
        */

        int sayi = 1;
        String sonuc = "";

        if(sayi>=0 && sayi<=9){
            if (sayi == 9){sonuc = "dokuz";}
            else if (sayi == 8){sonuc = "sekiz";}
            else if (sayi == 7){sonuc = "yedi";}
            else if (sayi == 6){sonuc = "alti";}
            else if (sayi == 5){sonuc = "bes";}
            else if (sayi == 4){sonuc = "dort";}
            else if (sayi == 3){sonuc = "uc";}
            else if (sayi == 2){sonuc = "iki";}
            else if (sayi == 1){sonuc = "bir";}
            else {sonuc = "sifir";}
            System.out.println("sonuc = " + sonuc);
        } else {System.out.println("Gecersiz");}


        int n = 4;
        String result = n==9? "Dokuz":n==8 ? "Sekiz": n==7 ? "Yedi": n==6 ?"Alti": n==5 ? "Bes" :
                        n==4? "Dort" : n==3 ? "Uc": n==2 ? "Iki" : n==1 ?"Bir" : n==0 ? "Sifir" : "Gecersiz";
        System.out.println("result = " + result);


    }
}
