package day41_abstractClass_Interface;

public abstract class EToyota extends DAraba {

    @Override
    protected void motor() {
        System.out.println("Toyota arabalar cevreci motor kullanir");
    }

    /*
    parent class'daki standart belirleyici method'lar
    (abstract method'larin) tamami child class'i tarafindan
    override edilmelidir

    concrete method'larin override edilme mecburiyeti yoktur
    istersek override edebiliriz ismezsek etmeyiz

    Aslinda Toyota class'i da obje uretebiilecegimiz bir class degil
    bu durumda eger proje tasarimi yapiyorsaniz Toyota class'ini da
    abstract yapmaniz guzel olur
    Bu class'dan obje olusturacak miyiz olusturmayacak miyiz
    Buna gore class'i abstract yapariz ya da yapmayiz

     */


}
