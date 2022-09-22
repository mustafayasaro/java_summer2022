package day34_Inheritance;

public class Toyota { // parent class'in diger adi Super class'dir
    protected String marka="Toyota";
    protected String model="Model belirtilmedi";
    protected String yakit="Yakit belirtilmedi";
    protected void motor(){
        System.out.println("Toyota cevreci motorlar kullanir");
    }
    protected void aku(){
        System.out.println("Toyota modele gore aku kullanir");
    }
    /*
    Java single inheritance'i kabul eder.
    Bir child class'in sadece bir parent class'i olur
    Fakat bir parent class'in birden fazla child class'i olabilir
    ve child class'da farkli bir class'in parent class'i olabilir

    Object Class butun class'larin atasidiir
    Object class parent'i olmayan tek class'dir
     */
}
