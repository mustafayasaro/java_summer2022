package day35_InheritancedaConstructorKullanimi;

public class LOgretmenler {

    LOgretmenler (){
        System.out.println("LOgretmenler parametresiz constructor");
    }

    LOgretmenler(String isim){
        this();
        System.out.println("LOgretmenler parametreli constructor");
    }
}
