package LeetCode.最小路径和;

/**
 * @author changzer
 * @date 2022/12/30
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
    }
}
class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i==0&&j==0) {
                    continue;
                }
                int left = Integer.MAX_VALUE;
                int up = Integer.MAX_VALUE;
                if(i > 0){
                    left = grid[i-1][j];
                }
                if(j>0){
                    up = grid[i][j-1];
                }
                grid[i][j] = grid[i][j] + (Math.min(left, up));
            }
        }
        return grid[m-1][n-1];
    }
}
