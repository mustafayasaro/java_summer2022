package interview_questions;

public class Q01_WhileLoopArmstrongNum {
    public static void main(String[] args) {

        /*
        in given number. Find it is armstrong or not

         */

        int num = 154;
        int sum = 0;
        int birler = 1;
        int r = 1;
        int temp = num;


        while (temp > 0) {

            birler = temp % 10;
            r = birler * birler * birler;
            sum += r;
            temp /= 10;
        }
        if (num == sum) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }


    }
}
