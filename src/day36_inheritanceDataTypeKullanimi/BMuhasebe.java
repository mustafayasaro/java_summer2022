package day36_inheritanceDataTypeKullanimi;

import day34_Inheritance.Personel;

public class BMuhasebe extends APersonel {

    protected int saatUcreti = 10;
    protected int gunlukMesai = 8;


    protected void maas(){
        System.out.println("personel minimum : " + (30*gunlukMesai*saatUcreti + " maas alir"));
    }

    protected void ozelSigorta(){
        System.out.println("isteyen calisanlara %50 indirimli ozel sigorta yapilir");
    }

}
