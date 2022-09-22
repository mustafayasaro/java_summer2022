package day26_constructor;

public class Output2 {

    String name;
    int age;
    String phone;

    public Output2(String name, int age, String phone) {
        this.phone = phone;
        this.name = name;
    }

    public Output2() {

    }


    public static void main(String[] args) {

        Output2 obj2 = new Output2("John", 25, "00-29-998877");
        Output2 obj1 = new Output2();
        System.out.println(obj2.name + ", " + obj2.age + ", "+ obj2.phone);
         //John, 0, 00-29-998877
    }
}
