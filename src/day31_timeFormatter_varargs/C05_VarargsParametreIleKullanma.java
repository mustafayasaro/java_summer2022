package day31_timeFormatter_varargs;

public class C05_VarargsParametreIleKullanma {

    public static void main(String[] args) {

        enUzunKelimeyiYazdir(4,"Ayse","ismail","tahir","Mustafa","Ali");
        /*
        Varags teorik olarak sonsuz sayida element alabilir
        bir method'da varaargs parametre olarak varsa
        varargs'in sinirlarini bilebilmesi icin parametrelerin
        sonuncusu olmalidir.

        Oncesinde farkli parametreler olabilir ama
        varargs'tan sonra olamaz

        Bu kuraldan oturu bir method'da sadece
        bir tane varargs olabilir.

        Varargs ozellik olarak list gibi calisir,uzunlugu esnektir,
        fakat varargs'in arka planinda Java Array ile calisir
         */
    }
    public static void enUzunKelimeyiYazdir(int kelimeSayisi, String... kelime) {

        String enUzunKelime = kelime[0]; // varargs array tabanli oldugu icin atmasini boyle yapariz
        for (String each: kelime
        ) {
            if(each.length() > enUzunKelime.length()){
                enUzunKelime = each;
            }
        }
        System.out.println("enUzunKelime = " + enUzunKelime);
        // enUzunKelime = Mustafa

    }
}
