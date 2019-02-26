package problems.medium;

public class P289_GameOfLife {
    private static final int LIVE = 1;
    private static final int DEAD = 0;

    public void gameOfLife(int[][] board) {
        // 1 ~ 9 for live state, liveCount = state - 1
        // 0 ~ -8 for dead state, liveCount = state * -1
        if (board == null || board.length == 0 || board[0].length == 0) {
            return;
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int state = nextState(board, i, j);
                board[i][j] = state;
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = stateToZeroOROne(board[i][j]);
            }
        }
    }

    private int nextState(int[][] board, int r, int c) {
        int count = 0;
        for (int i = Math.max(r-1, 0); i <= Math.min(r+1, board.length-1); i++) {
            for (int j = Math.max(c-1, 0); j <= Math.min(c+1, board[0].length-1); j++) {
                if (!(i == r && j == c) && isLive(board[i][j])) {
                    count++;
                }
            }
        }
        int state = countToState(count, isLive(board[r][c]));
        return state;
    }

    private boolean isLive(int state) {
        return state >= LIVE;
    }

    private int stateToCount(int state) {
        if (isLive(state)) {
            return state - 1;
        } else {
            return state * -1;
        }
    }

    private int countToState(int count, boolean isLive) {
        if (isLive) {
            return count + 1;
        } else {
            return count * -1;
        }
    }

    private int stateToZeroOROne(int state) {
        int liveCount = stateToCount(state);
        if (isLive(state)) {
            if (2 <= liveCount && liveCount <= 3) {
                return LIVE;
            }
        } else {
            if (3 <= liveCount && liveCount <= 3) {
                return LIVE;
            }
        }
        return DEAD;
    }
}
