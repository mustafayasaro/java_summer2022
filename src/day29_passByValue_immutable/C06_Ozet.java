package day29_passByValue_immutable;

public class C06_Ozet {

    /*
    Immutable class : degistirilemeyen class demektir. Bu class'lardan olusturulan
    objeler de immutable olurlar
    2- Bugune kadar kullandigimiz class'lardan immutable olan en meshur class Strig class'idir
    3- String class'inda olusturdugumuz objelerde, String methodlari calistirdigimizda objemiz
       degismez.
         Ex :  String str = "Java candir";
               str.toLowerCase();
               str.replace("Java", "C#");
               str.substring(0,2);
               sout(str);  // Java candir

               Bu methodlar calistirildiklari satirda str'nin bir kopyasi uzerinde calisirlar ve
               o kopya uzerinde degisiklikler yaparlar o satirda yazdirir veya bir String
               variable'a atama yaparsak method'un sonucunu yazdirir veya atama yaparlar.
               Ancak o satiri gectikten sonra str yazdirdigimizda degismedigini goruruz.
     4- String method'larinda yasadigimiz bu durum mutable olan ArrayList, Array, Stringbuilder'da
        yasanmaz. Onlarda method calisdigida yapilan degisiklikler kalici olur.
     */
}
