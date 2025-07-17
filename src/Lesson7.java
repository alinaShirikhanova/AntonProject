import java.util.Scanner;

public class Lesson7 {
    public static void main(String[] args) {
//        Пользователь число:
//        1 - иди
//        2 - жди
//        3 - СТОП
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        if (n == 1) {
//            System.out.println("иди");
//        } else if (n == 2) {
//            System.out.println("жди");
//        } else if (n == 3) {
//            System.out.println("стоп");
//        } else {
//            System.out.println("Некорректное число");
//        }


//        Пользователь вводит число. Вывести сезон
//                1-зима
//                2 - весна
//                3 - лето
//                4 - осень

//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int d = sc.nextInt();
//        int e = sc.nextInt();
//
//        int max = a;
//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
//        if (d > max) {
//            max = d;
//        }
//        if (e > max) {
//            max = e;
//        }
//
//        System.out.println(max);

//        if (a >= b && a >= c && a > d && a > e){
//            System.out.println(a);
//        } else if (b > a && b ) {
//
//        }
//        e

//        пользователь вводит 3 числа. Распечатать те из них, которые больше нуля

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > 0){
            System.out.println(a);
        } else if (b > 0) {
            System.out.println(b);
        } else if (c > 0) {
            System.out.println(c);
        }

    }
}
