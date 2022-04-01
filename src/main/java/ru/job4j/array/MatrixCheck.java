package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        //сначала цикл по строкам, потом по столбцам проверяем первый символ. Так быстрее отработает, чем в одном цикле делать проверку
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == 'X') {
                if (monoHorizontal(board, i) || monoVertical(board, i)) {
                    return  true;
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            if (board[0][i] == 'X') {
                if (monoHorizontal(board, i) || monoVertical(board, i)) {
                    return  true;
                }
            }
        }
        return false;
    }

}