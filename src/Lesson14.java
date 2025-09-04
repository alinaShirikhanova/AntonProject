import java.sql.SQLOutput;

public class Lesson14 {
    public static void main(String[] args) {
//        Есть ли среди двузначных чисел число, которое делится и на 3, и на 7
        boolean hasNumber = false;

//        for (int i = 10; i <= 99; i++) {
//            if (i % 3 == 0 && i % 100 == 0) {
//                hasNumber = true;
//                break;
//            }
//        }
//
//        if (hasNumber){
//            System.out.println("Есть");
//        } else {
//            System.out.println("Нет");
//        }


//        Есть ли среди трехзначных чисел число, которое делится и на 10, и на 3
        // Есть
        // Нет


//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            sum += i;
//        }


        for (int i = 0; i < 50; i++) {
            if (i % 3 != 0){
                System.out.println(i);
            }
        }


        for (int i = 0; i < 50; i++) {
            if (i % 3 == 0){
               continue;
            }
            System.out.println(i);
        }











    }
}
