package day42_abstractClass_Interface;

public class K_ChildClass implements I03_Interface, I02_Interfaces {

    /*
    Bir class'i bir interface'e child yapmak icin implements keyword kullanilir
    implements dedikten sonra virgul yazarak istedigimiz kadar interface ekleyebilirz

     */

    public static void main(String[] args) {
        System.out.println(I02_Interfaces.SAYI);//30
        System.out.println(I03_Interface.SAYI);//20
        System.out.println(ISIM); // Yildiz koleji
    }
    @Override
    public void yakit() {

    }
    @Override
    public void motor() {

    }
    @Override
    public void teker() {

    }
}
