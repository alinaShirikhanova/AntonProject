import java.util.Scanner;

public class Lesson8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if (age >= 18){
            System.out.println("взрослый");
        } else {
            System.out.println("ребенок");
        }
//
        // Тернарный оператор - короткая запись условного оператора
        System.out.println(age >= 18 ? "взрослый" : "ребенок");



//
//        int a = sc.nextInt();
//        int b = sc.nextInt();

//        if (a > b){
//            System.out.println(a);
//        } else {
//            System.out.println(b);
//        }
//
//        int max = a > b ? a : b;
//        System.out.println(max);
//        System.out.println(a> b ? a : b);





//        Распечатать -1, если введенное число меньше нуля и 1,
//        если оно больше нуля


        int a = sc.nextInt();
        int res = a <0 ? -1 : 1;
        System.out.println(res);
        System.out.println(a <0 ? -1 : 1);

        int res2 = a < 0 ? -1 : a == 0 ? 0 : 1;







    }
}