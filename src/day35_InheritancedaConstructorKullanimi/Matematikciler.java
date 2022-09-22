package day35_InheritancedaConstructorKullanimi;

public class Matematikciler extends LOgretmenler{
    Matematikciler (){System.out.println("Matematikciler parametresiz constructor");}
    Matematikciler(String isim){
        this();// Bu class'daki parametresiz constructor'a git
        System.out.println("Matematikciler parametreli constructor");
    }
    public static void main(String[] args) {

        Matematikciler obj1 = new Matematikciler("Tugba");
       // LOgretmenler parametresiz constructor
       // Matematikciler parametresiz constructor
       // Matematikciler parametreli constructor

        /*
        this() constructor call icinde bulunulan class'daki constrctor'lari
        super() constructor call ise parent class'da bulunan constrctor'lari'lari cagirir

        this() veya super() parametre yapisina uygun constructor bulamazsa

        constructor konusunda gordugumuz this. o class'daki instance
        variable'lari refere ediyordu

        inheritance'da da super. vardir
        super. parent class'daki instance variable'lari refere eder
         */



    }
}
