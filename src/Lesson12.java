import java.util.Scanner;

public class Lesson12 {
    public static void main(String[] args) {
//        int i = 1;
        // Условный
//        while (i <= 10){
//            System.out.println(i++);
//        }
//      Определенный
//        for (int i = 1; i <= 3; i++){
//            System.out.println(i);
//        }
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(); // 1000
        int e = sc.nextInt(); // 1
        if (s > e){
            int temp = s;
            s = e;
            e = temp ;
        }

        for (int i = s; i <= e; i++){
            System.out.println(i);
        }
        // Неверно
//        s = e;
//        e = s;
//        int s = 10;
//        int e = 1;
//        int temp = s;
//        s = e;
//        e = temp;


//        Вывести числа от 10 до 3

    }
}
