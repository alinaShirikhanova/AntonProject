import java.util.Scanner;

public class Lesson15 {
    public static void main(String[] args) {
//        for (int i = 0; i < 24; i++){
//            for (int j = 0; j <= 59 ; j++) {
//                System.out.println(i + " ч " + j + " мин");
//            }
//            System.out.println();
//        }


//        for (int i = 1; i <= 3; i++) {
//            for (int f = 1; f <= 3; f++) {
//                System.out.print(i + " , " + f + " ");
//            }
//            System.out.println();
//        }
//до тех пор, пока
//        Scanner sc = new Scanner(System.in);
//        int pass = 123;
//        int i = sc.nextInt();
//
//        while (pass != i){
//            System.out.println("Неверно");
//            i = sc.nextInt();
//        }
//        int i = 1;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i < 3);


//        int mark1 = 5;
//        int mark2 = 5;
//        int mark3 = 5;
//        int mark4 = 5;
//        int mark5 = 5;
//        int mark6 = 4;
//        System.out.println(mark1+ " " + ma);
//# 1 способ
//        int[] marks = {5, 4, 5, 4};
//        char[] symbols = {'a', 'b', 'c'};
//        System.out.println(marks);
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);
//        System.out.println(marks[5]);

//        for (int i = 0; i < marks.length; i++) {
//            System.out.println(marks[i]);
//        }
//Распечатать только положительные элементы
        int[] numbers = {-5, -4, 5, 4, 2, 3, 4, -5, 6, -7, 7, 8, -899, 0};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                System.out.println(numbers[i]);
            }

        }


    }
}
