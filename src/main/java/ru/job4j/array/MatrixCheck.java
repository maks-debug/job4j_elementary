package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int in = 0; in < board.length; in++) {
            if (board[row][in] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int in = 0; in < board.length; in++) {
            if (board[in][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}
