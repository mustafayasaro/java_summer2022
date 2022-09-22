package day41_abstractClass_Interface;

public class FMercedes extends DAraba {


    @Override
    protected void yakit() {
        /*
        Abstract bir parent'in concrete child class'i inherit ederse
        parent abstract class'daki tum abstrct method'lari
        override etmek zorundadir

        abstract bir class abstract baska bir class'i parent edinirse
        parent clss'daki tum abstract class'daki tum abstract method'lari
        override etmek zorunda degildir
         */
    }

    @Override
    protected void kaporta() {

    }

    @Override
    protected void motor() {

    }
}
