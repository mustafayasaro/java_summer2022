package day33_Encapsulation;

public class Tasit {

   private String tasitTuru;
   private boolean muayenesiVarMi;
   private int yil;
   public String getTasitTuru() {
        return tasitTuru;
    }
    public void setTasitTuru(String tasitTuru) {
        this.tasitTuru = tasitTuru;
        // return olmadigi icin bu methodun cagirildigi
        // TasitRunner class'indan yazdirilamaz
        // set method'larinda sadece 1 satirlik kod var
        // o da bizim gonderdigimiz parametreyi
        // instance variable'a atiyor
    }
    public boolean isMuayenesiVarMi() {
        // boolean variable'lar icin olusturulan getter method'larinin ismi
        // isVaiableIsmi seklinde olur
        return muayenesiVarMi;
        // getter method'u da tek bir satirlik islem yapiyor
        // baska class'larin private oldugu icin erisemedigi
        // tasitTuru bilgisini class icinden alip
        // istenen farkli class'lara return ediyor
    }
    public void setMuayenesiVarMi(boolean muayenesiVarMi) {
        this.muayenesiVarMi = muayenesiVarMi;
    }
    public int getYil() {
        return yil;
    }
    public void setYil(int yil) {
        this.yil = yil;
    }
}
