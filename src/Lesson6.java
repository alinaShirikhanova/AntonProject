import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {
//        int age = 18;
//        if (age >= 18) {
//            System.out.println("Проходите");
//        }

//        if (10 <= age && age <= 18 )
//        int age = 10;
//        boolean isAdult = age >= 18;
//        if (!isAdult) {
//            System.out.println("Проходите");
//        }

//        int i = 10;
//        ошибка
//        if (i) {
//            System.out.println();
//        }
//        int age = 10;
//        if (age >= 18) {
//            System.out.println("Проходите");
//        } else {
//            System.out.println("Вы слишком маленький");
//        }


//        Пользователь вводит число - кол-во рублей у него в кармане.
//        Вывести "Можешь купить пирожок", если рублей >= 50

//        int money = 49;
//        boolean n = money >= 50;
//        if (money >= 50){
//            System.out.println("Можешь купить пирожок");
//        } else {
//            System.out.println("не можешь купить");
//        }

        int age = 10;
        if (age >= 18) {
            System.out.println("Проходите");
        } else {
            System.out.println("Вы слишком маленький");
        }

        System.out.println("Вот и все");

//        Пользователь вводит 2 числа. Распечатайте то число, которое больше.

        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int s = sc.nextInt();
//        if (a > s) {
//            System.out.println(a);
//        }else{
//            System.out.println(s);
//
//        }

        int a = sc.nextInt();
        int d = sc.nextInt();
        int b = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println(a);
        }
        if (d % 2 ==0 ) {
            System.out.println(d);
        }
        if (b % 2 ==0 ) {
            System.out.println(b);
        }

    }
}
