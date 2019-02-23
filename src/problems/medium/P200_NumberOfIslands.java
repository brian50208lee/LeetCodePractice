package problems.medium;

public class P200_NumberOfIslands {
    private static final char ISLAND = '1';
    private static final char WATER = '0';

    public int numIslands(char[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == ISLAND) {
                    flip(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    public void flip(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) {
            return;
        }
        if (grid[i][j] == ISLAND) {
            grid[i][j] = WATER;
            flip(grid, i-1, j);
            flip(grid, i+1, j);
            flip(grid, i, j-1);
            flip(grid, i, j+1);
        }
    }
}
