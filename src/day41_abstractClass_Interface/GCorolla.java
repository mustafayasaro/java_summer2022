package day41_abstractClass_Interface;

public class GCorolla extends EToyota{
    @Override
    protected void yakit() {

    }

    @Override
    protected void kaporta() {

    }

    /*
    Corolla class'inin iki tane paren'i var
    Corolla parent'larinin ikisinin de standartlarina
    uymak zorudadir

    Concrete bir class parent'i olan tum abstract class'larda
    abstract olan method'lari implement etmek zorundadir
    Ancak parent silsilesinde override edilerek concrete
    yapilan method'lari override etmek zorunda degildir
     */
}