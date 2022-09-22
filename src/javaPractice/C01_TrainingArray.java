package javaPractice;

public class C01_TrainingArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]++);
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
