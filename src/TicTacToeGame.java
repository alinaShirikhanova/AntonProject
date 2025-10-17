import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
//        char[][] board = {
//                {' ', 'X', ' '},
//                {' ', ' ', 'O'},
//                {'X', ' ', ' '}
//        };
//
//        System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
//        System.out.println("---+---+---");
//        System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
//        System.out.println("---+---+---");
//        System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2]);

//        // Реализовать цикл for в котором  i будет принимать значения 0 1 2
//        for (int i = 0; i <3; i++) {
//            System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
//            if (i < 2){
//                System.out.println("---+---+---");
//            }
//        }
        Scanner sc = new Scanner(System.in);
        char[][] board = {
                {' ', ' ',' '},
                {' ', ' ',' '},
                {' ', ' ',' '}
        };
        

        char currentPlayer = 'X';

        while (true) {
            for (int i = 0; i <3; i++) {
                System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
                if (i < 2 ){
                    System.out.println("--+---+---");
                }
            }
            System.out.println("сделай свой ход!");
            System.out.println("введите строку: ");
            int row = sc.nextInt();
            System.out.println("введите столб: ");
            int coln = sc.nextInt();
            board[row][coln] = currentPlayer;

            System.out.println();
            System.out.println();


            if (currentPlayer == 'X'){
                currentPlayer = 'O';
            } else {
                currentPlayer = 'X';
            }
        }
    }
}
//   |   |
//---+---+---
//   |   |
//---+---+---
//   |   |