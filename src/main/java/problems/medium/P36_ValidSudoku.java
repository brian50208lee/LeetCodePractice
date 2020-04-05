package problems.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P36_ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        return isValidRows(board) && isValidCols(board) && isValidBox(board);
    }

    private boolean isValidRows(char[][] board) {
        for (int i = 0; i < 9; i++) {
            List<Character> chars = new ArrayList<>();
            for (int j = 0; j < 9; j++) {
                chars.add(board[i][j]);
            }
            if (!isValidNine(chars)) {
                return false;
            }
        }
        return true;
    }

    private boolean isValidCols(char[][] board) {
        for (int i = 0; i < 9; i++) {
            List<Character> chars = new ArrayList<>();
            for (int j = 0; j < 9; j++) {
                chars.add(board[j][i]);
            }
            if (!isValidNine(chars)) {
                return false;
            }
        }
        return true;
    }

    private boolean isValidBox(char[][] board) {
        for (int startRow = 0; startRow < 9; startRow+=3) {
            for (int startCol = 0; startCol < 9; startCol+=3) {
                if (!isValidSubbox(board, startRow, startCol)) {
                    System.out.println(startRow);
                    System.out.println(startCol);
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValidSubbox(char[][] board, int r, int c) {
        List<Character> chars = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                chars.add(board[r+i][c+j]);
            }
        }
        return isValidNine(chars);
    }

    private boolean isValidNine(List<Character> chars) {
        Set<Character> usedDigit = new HashSet<>();
        for (Character c : chars) {
            if (!isIgnoredChar(c)) {
                if (usedDigit.contains(c)) {
                    return false;
                } else {
                    usedDigit.add(c);
                }
            }
        }
        return true;
    }

    private boolean isIgnoredChar(char c) {
        return c == '.';
    }

    private int toDigit(char c) {
        return c - '0' - 1;
    }
}
