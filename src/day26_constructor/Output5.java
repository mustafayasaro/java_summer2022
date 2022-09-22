package day26_constructor;

public class Output5 {
    static int count = 0;
    public void increment(){
        count++;
    }

    public static void main(String[] args) {
        Output5 obj1 = new Output5();
        Output5 obj2 = new Output5();
        obj1.increment();
        obj2.increment();
        System.out.println("obj1 : count is " + obj1.count); // obj1 : count is 2
        System.out.println("obj2 : count is " + obj2.count); // obj2 : count is 2
    }
}
