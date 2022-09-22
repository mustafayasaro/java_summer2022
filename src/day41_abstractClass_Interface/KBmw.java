package day41_abstractClass_Interface;

public abstract class KBmw extends DAraba{

    /*
    Bmw abstract bir class'in abstract bir child'i
    oldugu icin parent class'daki abstract method'lari
    implement etmek zorunda kalmadi
     */

    protected abstract void amblem();

    protected abstract void guvenlik();

}
