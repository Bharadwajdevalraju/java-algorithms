package org.bd.blind50.set2;

import java.util.ArrayList;
import java.util.List;

public class PacificAtlanticWaterFlow {


    public static int[][] solve(int[][] grid) {

        List<int[]> list = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visitedP = new boolean[m][n];
        boolean[][] visitedA = new boolean[m][n];
        for(int i=0;i<n;i++) dfs(0, i, grid, visitedP, grid[0][i]);
        for(int i=0;i<m;i++) dfs(i, 0, grid, visitedP, grid[i][0]);

        for(int i=0;i<m;i++) dfs(i,n-1, grid, visitedA, grid[i][n-1]);
        for (int i=0;i<n;i++) dfs(m-1, i, grid, visitedA, grid[m-1][i]);

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(visitedP[i][j] && visitedA[i][j]) {
                    list.add(new int[]{i, j});
                }
            }
        }
        return list.toArray(new int[][]{});
    }

    private static void dfs(int i, int j, int[][] grid, boolean[][] visited, int prevHeight) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || visited[i][j] || prevHeight > grid[i][j]) {
            return;
        }
        visited[i][j] = true;
        dfs(i, j + 1, grid, visited, grid[i][j]);
        dfs(i + 1, j, grid, visited, grid[i][j]);
        dfs(i, j - 1, grid, visited, grid[i][j]);
        dfs(i - 1, j, grid, visited, grid[i][j]);
    }
}
