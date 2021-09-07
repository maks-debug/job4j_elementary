package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int result = 0;
        if ((x1 < 8 && x2 < 8 && y1 < 8 && y2 < 8)) {
            if (x1 >= 0 && x2 >= 0 && y1 >= 0 && y2 >= 0) {
                result = Math.abs(x2 - x1) == Math.abs(y2 - y1) ? Math.abs(x2 - x1) : result;
            }
        }
        return result;
    }
}
