package problems.medium;

public class P130_SurroundedRegions {
    private static char CIRCLE = 'O';
    private static char CROSS = 'X';

    public void solve(char[][] board) {
        if (board.length <=2 || board[0].length <= 2) {
            return;
        }

        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 1; i < board.length - 1; i++) {
            for (int j = 1; j < board[0].length - 1; j++) {
                if (board[i][j] == CIRCLE && !visited[i][j]) {
                    if (!isConnectedToBorder(board, visited, i, j)) {
                        flipConnect(board, i, j);
                    }
                }
            }
        }
    }


    private boolean isConnectedToBorder(char[][] board, boolean[][] visited, int i, int j) {
        if (visited[i][j] || board[i][j] == CROSS) {
            return false;
        }
        if (i == 0 || j == 0 || i == board.length - 1 || j == board[0].length - 1){
            return true;
        }
        visited[i][j] = true;
        boolean b1 = isConnectedToBorder(board, visited, i-1, j);
        boolean b2 = isConnectedToBorder(board, visited, i+1, j);
        boolean b3 = isConnectedToBorder(board, visited, i, j-1);
        boolean b4 = isConnectedToBorder(board, visited, i, j+1);
        return b1 || b2 || b3 || b4;
    }


    private void flipConnect(char[][] board, int i, int j) {
        if (board[i][j] == CIRCLE) {
            board[i][j] = CROSS;
            flipConnect(board, i-1, j);
            flipConnect(board, i+1, j);
            flipConnect(board, i, j-1);
            flipConnect(board, i, j+1);
        }
    }
}
