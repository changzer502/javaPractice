package LeetCode.矩阵中的幸运数;/**
 * @author lingqu
 * @date 2022/2/15
 * @apiNote
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *@description TODO
 *@author zzhi
 *@createDate 2022/2/15
 *@version 1.0
 */
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[] minRow = new int[m];
        Arrays.fill(minRow, Integer.MAX_VALUE);
        int[] maxCol = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                minRow[i] = Math.min(minRow[i], matrix[i][j]);
                maxCol[j] = Math.max(maxCol[j], matrix[i][j]);
            }
        }
        List<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == minRow[i] && matrix[i][j] == maxCol[j]) {
                    ret.add(matrix[i][j]);
                }
            }
        }
        return ret;

    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] n = {{3,7,8},{9,11,13},{15,16,17}};
        s.luckyNumbers(n);
    }
}
