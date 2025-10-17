import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создаём поле 3x3
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        char currentPlayer = 'X';
        boolean gameEnd = false;

        while (!gameEnd) {
            // Выводим поле
            System.out.println("Текущее поле:");
            for (int i = 0; i < 3; i++) {
                System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
                if (i < 2) System.out.println("---+---+---");
            }

            // Ввод хода
            System.out.println("Игрок " + currentPlayer + ", введите строку (0-2):");
            int row = scanner.nextInt();
            System.out.println("Игрок " + currentPlayer + ", введите столбец (0-2):");
            int col = scanner.nextInt();

            // Проверка на свободную клетку
            if (board[row][col] == ' ') {
                board[row][col] = currentPlayer;
            } else {
                System.out.println("Клетка занята, попробуйте снова.");
                continue;
            }

            // Проверка победы по строкам
            for (int i = 0; i < 3; i++) {
                if (board[i][0] == currentPlayer &&
                        board[i][1] == currentPlayer &&
                        board[i][2] == currentPlayer) {
                    System.out.println("Игрок " + currentPlayer + " победил!");
                    gameEnd = true;
                }
            }

            // Проверка победы по столбцам
            for (int i = 0; i < 3; i++) {
                if (board[0][i] == currentPlayer &&
                        board[1][i] == currentPlayer &&
                        board[2][i] == currentPlayer) {
                    System.out.println("Игрок " + currentPlayer + " победил!");
                    gameEnd = true;
                }
            }

            // Проверка диагоналей
            if (board[0][0] == currentPlayer &&
                    board[1][1] == currentPlayer &&
                    board[2][2] == currentPlayer) {
                System.out.println("Игрок " + currentPlayer + " победил!");
                gameEnd = true;
            }
            if (board[0][2] == currentPlayer &&
                    board[1][1] == currentPlayer &&
                    board[2][0] == currentPlayer) {
                System.out.println("Игрок " + currentPlayer + " победил!");
                gameEnd = true;
            }

            // Проверка на ничью
            boolean draw = true;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == ' ') {
                        draw = false;
                    }
                }
            }
            if (draw) {
                System.out.println("Ничья!");
                gameEnd = true;
            }

            // Смена игрока
            if (currentPlayer == 'X') {
                currentPlayer = 'O';
            } else {
                currentPlayer = 'X';
            }
        }

        // Вывод финального поля
        System.out.println("Игра окончена. Финальное поле:");
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) System.out.println("---+---+---");
        }

        scanner.close();
    }
}
