package org.bd.blind50.set2;

public class NumberOfIslands {

    public static int solve(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int c=0;
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(!visited[i][j] && grid[i][j]==1) {
                    dfs(grid, i, j, visited);
                    c++;
                }
            }
        }
        return c;
    }

    private static void dfs(int[][] grid, int i, int j, boolean[][] visited) {
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || visited[i][j] || grid[i][j] == 0) {
            return;
        }
        visited[i][j] = true;
        dfs(grid, i+1, j, visited);
        dfs(grid, i, j+1, visited);
        dfs(grid, i, j-1, visited);
        dfs(grid, i-1, j, visited);
    }

    //TC: 0(m*n);
    //SC: 0(m*n)

}
