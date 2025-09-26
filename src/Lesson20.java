import java.util.Scanner;

public class Lesson20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();  // 4 - кол-во элементов в массиве
//        int[] arr = new int[n];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        int sum = n - 1;
//        for (int i = 0; i < n / 2; i++) {
//            int index = sum - i;
//            int temp = arr[i];
//            arr[i] = arr[index];
//            arr[index] = temp;
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//

        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(array[i][j]);
            }

        }

//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);


    }
}
