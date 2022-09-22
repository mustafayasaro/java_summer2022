package day42_abstractClass_Interface;

import java.util.ArrayList;
import java.util.List;

public interface I02_Interfaces {
    int SAYI = 30;
    String ISIM ="Yildiz koleji";


    /*
    Interface bir class degildir
    Interface interface'dir

    Abstract class'lar Java'da abstraction(Soyutlastirma/ kural koyma)
    islerini yapiyordu
    Ancak abstract bir class'da abstract olmayan method'lar da olabilir
    bu da full abstraction yapmaya izin vermez

    Eger Java'da icinde hic concrete method olmasin
    dedigimiz bir class olusturmak istoyorsaniz
    bunu class degil Interface yapmalisiniz

    Interface icinde sadece kendisinden tureyen siniflarin icini doldurmak zorunda oldugu
    body'si olmayan method'larin olusturdugu bir yapidir

    Kisacasi kendisini inherit eden class'lar icin yerine getirmeleri gereken method'lari
    belirten "tum alanlari doldurmak zorunda olan bir sablon" gibidir

    Interface'ler somutlastirilamaz

    1- INTERFACE'LERDE CONCRETE METHOD OLMAZ
    2- Interface'ler full abstraction yaptigindan interface'lerden
       obje olusturulamaz

       Hatirladigimiz gibi interface olan List'den direkt obje olusturamiyorduk
       List<String> liste = new List<String>();
       Bunun yerine constructor'u List'in concrete child'i olan ArrayList'den seceriz
       List<String> liste = new ArrayList<String>();

    3- Class'larda bir child birden fazla parent edinemez
       Ancak Interface'lerde concrete method olmadigindan
       biz her method'u child class'da override etmek zorundayiz
       Override ederken kimin soyledigini override ettigimizin onemi yok
    4- Interface'ler neyin yapilmasi gerektigini soyler
       ama nasil yapilacagina karismaz
    5- Bir class birden fazla class'a extends edilemez ama birden fazla interface'e
       implement edilebilir
     */


    List<String> liste = new ArrayList<String>();










}
