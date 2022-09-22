package day39_exceptions;

import java.lang.management.GarbageCollectorMXBean;

public class C07 {

    public static void main(String[] args) {

        int yas = -1;

        try {
            if (yas > 0) {
                System.out.println("Yasiniz : " + yas);
            }else {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
           e.printStackTrace();
        }
        System.err.println("kodumuz bloke olmamis");

    }


}
