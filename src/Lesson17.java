import java.util.Scanner;

public class Lesson17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] numbers = {-5, -4, 5, 4, 2, 3, 4, -5, 6, -7, 7, 8, -899, 0};


//        if (numbers[0] % 2 == 0){
//            System.out.println(numbers[0]);
//        }
//
//        if (numbers[1] % 2 == 0){
//            System.out.println(numbers[1]);
//        }
//
//        if (numbers[2] % 2 == 0){
//            System.out.println(numbers[2]);
//        }
//        int[] numbers = {-5, -4, 5, 4, 2, 3, 4, -5, 6, -7, 7, 8, -899};
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 2 == 0) {
//                System.out.println(numbers[i]);
//            }
//        }

        // array = массив
//        int n = sc.nextInt(); // кол-во элементов в массиве
//        int[] array = new int[10];
//        double[] array2 = new double[10];
//        char[] array3 = new char[10];
//        boolean[] array4 = new boolean[10];
//        String[] array5 = new String[10];
//        System.out.println();
//        int[] array = new int[10];
//        array[0] = 900;
//        array[1] = 900;
//        array[2] = 900;
//        array[3] = 900;
//        array[4] = 900;
//        array[5] = 900;
//        array[6] = 900;
//        array[7] = 900;
//        array[8] = 900;
//        array[9] = 900;
//        for (int i = 0; i < array.length; i++) {
//            array[i] = sc.nextInt();
//        }

        int n = sc.nextInt(); // 4
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        // Распечатать все положительные элементы

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.println(array[i]);
            }
        }

    }
}
