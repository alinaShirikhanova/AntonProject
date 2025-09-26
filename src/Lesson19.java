import java.util.Scanner;

public class Lesson19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            int temp = arr[i];
//            arr[i] = arr[n - 1 - i];
//            arr[n - 1 - i] = temp;
//        }

//        int a = 10;
//        int b = 12;
//
//        a = b;
//        b = a;
        int num = sc.nextInt();
        int sum = 0;
        while (num != 0){
            sum += num;
            num = sc.nextInt();
        }
        System.out.println(sum);
    }
}
