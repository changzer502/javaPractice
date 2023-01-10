package LeetCode.旋转图像;

/**
 * @author changzer
 * @date 2022/12/29
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.rotate(new int[][]{{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}});
    }
}
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n/2; i++){
            for (int j = 0; j < (n+1)/2; j++){
                int tmp = matrix[j][n-1-i];
                matrix[j][n-1-i] = matrix[i][j];
                int tmp2 = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = tmp;
                int tmp3 = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = tmp2;
                matrix[i][j] = tmp3;
            }
        }
        System.out.println();
    }
}
