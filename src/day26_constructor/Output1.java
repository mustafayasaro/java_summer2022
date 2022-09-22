package day26_constructor;

public class Output1 {
    String name = "Emily";
    int age = 20;

    public Output1(String name, int i) {
        this.name = name;
        this.age = 22;
    }

    public static void main(String[] args) {

        Output1 obj1 = new Output1("Oliver", 21);

        System.out.print(obj1.name);
        System.out.println(", " + obj1.age);

        // Oliver, 22

    }
}
