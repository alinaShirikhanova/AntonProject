public class Lesson3 {
    public static void main(String[] args) {
        // Переменные

//        Тип имя;
        // Объявление переменной
        byte age;
        age = 50;
        byte a = 10;

        // Один раз пишем тип и через запятую пишем имена переменных
        byte f, g = 10;
//        byte b = 130 // ошибка компиляции
//        от -128 до 127
        System.out.println(age);

//        Компиляция - преобразование программы на джаве в байт-код
//        1 байт - 8 бит
//        byte - 1 байт -128 до 127
//        short - 2 байта редко используется -32 768 до 32 767
//        int - 4 байта -2 млрд до 2 млрд
//        long - 8 байт -9квнт до 9 квнт
        short v = 12;
//        short y = 32768;
//        System.out.println(y);

        int n = 20;

//        int number = 12 + 45;
        int number = n + n;
        n = 10;
        n = n + 20;

        System.out.println(n);

        long l = 200000000000000L;











    }
}
