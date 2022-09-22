package day17_nestedForLoop;

public class C02_NestedForLoop {
    public static void main(String[] args) {
        int sum=0;

        for(int i=10; i>0; i=i-5) {
            sum=sum+i;
        }
        System.out.println(sum); // 15
    }
}
