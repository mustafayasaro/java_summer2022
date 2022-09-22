package day26_constructor;

public class OzetConstructor {

    /*
       1- Parametreli constructor : Eger default constructor kullanirsak objemizi olusturabiliriz,
          ancak tum ozellikler default olarak gelir. Bu sekilde olusturulan objelere istedigimiz
          degerleri atayabilmek icin tek tek atama yapmamiz gerekir

       2- Parametresiz bir constructor ile bir obje olusturup ozellikleri tek tek atamak yerine
          constryctor'u parametreli yapip, o constructor icinde  atamalari yapabiliriz. Bu atamalari
          yaparken instance variable'lara parametre olarak gonderdigimiz degerlere atama yapmaliyiz

       3- Scope konusundan hatirlayacaginiz gibi bir scope'da marka yazarsak Java o scope'da
          marka variable'i varsa onu kullanir. Instance variable'lari Java'nin ayirt edebilmesi icin
          this keyword'unu kullanir

       4- this keyword'u constructor icinde kullanilir ve this.variableIsmi seklinde yazildiginda
          instance variable'a gider

       5- this() ise constructor icinden baska bir constructor cagirmak icin kullanilir. Uygulamada
          bu cok kullanilmaz ancak, OOP'ni 4 temel ozelliginden biri olan inheritance'i anlamamiz icin
          oncelikle this() kullanimini anlamamiz gerekir.

       6- this() constructor call icin iki onemli kural vardir. ]
          1) this() constructor call bulundugu constructor'un ilk satirinda olmak zorundadir
          2) 1. kuraldan oturu bir constructor icerisinde iki tane constroctor call olamaz
     */
}
