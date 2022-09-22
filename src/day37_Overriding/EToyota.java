package day37_Overriding;

public class EToyota extends DAraba{

    /*
    yakit methodunu toyota classina yazmadik cunku yakit
    toyota da spesifiklesmiyor ama supra da spesifiklesiyor
     */
    void marka(){
        System.out.println("Markamiz Toyota");
        /*
        Eger hem overriden hem de overriding methodunun calismasini istersek
        ilk satira super.marka(); yazabiliriz.>>ilk satirda olmak zorunda degil
                   super() > ilk saitrda olmak zorundaydi
         */
    }
    void motor(){
        System.out.println("Toyota araclar Toyota marka motor kullanir");
    }

}
