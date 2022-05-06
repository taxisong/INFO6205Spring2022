package taxisong;

public class Main {

//    Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water),
//    return the number of islands.
//    An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
//    You may assume all four edges of the grid are all surrounded by water.

    public static void main(String[] args) {
	// write your code here
        char[][] grid1 = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'1','1','1','1','0'}
        };
        char[][] grid2 = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };
        System.out.println(numIslands(grid1));
        System.out.println(numIslands(grid2));
    }//end of main

    public static int numIslands(char[][] grid) {
        int ans = 0;
        if (grid == null || grid.length == 0) return 0;
        int m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    ans ++;
                    dfs(grid, i, j);
                }
            }
        }
        return ans;
    }//end of numIslands

    public static void dfs(char[][] grid, int i, int j) {
        int m = grid.length, n = grid[0].length;

        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == '0') return;

        grid[i][j] = '0';
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
    }//end of dfs
}//end of Main
