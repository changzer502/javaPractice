package LeetCode.boundaryColor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lingqu
 * @date 2021/12/7
 * @apiNote
 */
public class Main {
    private static int[][] gridAll;
    private static int[][] tag;

    public static void main(String[] args) {
        int[][] grid = {{1,1,1},{1,1,1},{1,1,1}};
        int[][] ints = colorBorder(grid, 1, 1, 3);
        for (int i = 0; i < ints.length; i++){
            for (int j = 0; j < ints[0].length;j++){
                System.out.print(ints[i][j]);
            }
            System.out.println();
            
        }

    }
    public static int[][] colorBorder(int[][] grid, int row, int col, int color) {
        int m = grid.length, n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        List<int[]> borders = new ArrayList<>();
        int originalColor = grid[row][col];
        visited[row][col] = true;
        dfs(grid, row, col, visited, borders, originalColor);
        for (int i = 0; i < borders.size(); i++) {
            int x = borders.get(i)[0], y = borders.get(i)[1];
            grid[x][y] = color;
        }
        return grid;
    }

    private static void dfs(int[][] grid, int x, int y, boolean[][] visited, List<int[]> borders, int originalColor) {
        int m = grid.length, n = grid[0].length;
        boolean isBorder = false;
        int[][] direc = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        for (int i = 0; i < 4; i++) {
            int nx = direc[i][0] + x, ny = direc[i][1] + y;
            if (!(nx >= 0 && nx < m && ny >= 0 && ny < n && grid[nx][ny] == originalColor)) {
                isBorder = true;
            } else if (!visited[nx][ny]){
                visited[nx][ny] = true;
                dfs(grid, nx, ny, visited, borders, originalColor);
            }
        }
        if (isBorder) {
            borders.add(new int[]{x, y});
        }
    }
}


