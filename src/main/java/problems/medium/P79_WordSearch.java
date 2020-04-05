package problems.medium;

public class P79_WordSearch {
    public boolean exist(char[][] board, String word) {
        if (word.length() == 0) {
            return true;
        }
        if (board == null || board.length == 0 || board[0].length == 0) {
            return false;
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    boolean[][] used = new boolean[board.length][board[0].length];
                    if (backtrack(board, word, used, i, j)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private boolean backtrack(char[][] board, String remainWord, boolean[][] used, int rowIndex, int colIndex) {
        if (isIndexOutofBound(board, rowIndex, colIndex) ||
            isUsed(used, rowIndex, colIndex) ||
            notLegalChar(board, rowIndex, colIndex, remainWord.charAt(0))) {
            return false;
        }

        remainWord = remainWord.substring(1);
        if (remainWord.length() == 0) {
            return true;
        }

        used[rowIndex][colIndex] = true;
        if  (backtrack(board, remainWord, used, rowIndex - 1, colIndex) ||
                backtrack(board, remainWord, used, rowIndex + 1, colIndex) ||
                backtrack(board, remainWord, used, rowIndex, colIndex - 1) ||
                backtrack(board, remainWord, used, rowIndex, colIndex + 1)) {
            return true;
        }
        used[rowIndex][colIndex] = false;

        return false;
    }

    private boolean isIndexOutofBound(char[][] matrix, int i, int j) {
        return i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length;
    }

    private boolean isUsed(boolean[][] used, int i, int j) {
        return used[i][j];
    }

    private boolean notLegalChar(char[][] board, int i, int j, char c) {
        return board[i][j] != c;
    }
}
