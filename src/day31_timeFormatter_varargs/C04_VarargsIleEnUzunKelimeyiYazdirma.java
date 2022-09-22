package day31_timeFormatter_varargs;

public class C04_VarargsIleEnUzunKelimeyiYazdirma {

    public static void main(String[] args) {

        enUzunKelimeyiYazdir("ali","Ayse","ismail","tahir","Mustafa");

        /*
        Varargs ozellik olarak list gibi calisir(esnek uzunluktaki bir arraydir);
        varargs declaresi methodun parametreisine int... sayi  gibi
         */
    }

    public static void enUzunKelimeyiYazdir(String... kelime) {

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
