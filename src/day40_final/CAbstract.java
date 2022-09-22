package day40_final;

public abstract class CAbstract {

    void toplama(){
        System.out.println("Bu method toplama yapar");
    }

    abstract void carpma();
    /*
    Bir method'un basina abstract keyword'unu yazarsaniz
    Bu method'un child class'lar icin bir standart oldugunu deklare etmis olursunuz
    ve method body'sine ihtiyac kalmaz.

    Abstraact method'larin body'si olmaz
     */

    abstract void bolme();

    abstract void cikarma();

}
