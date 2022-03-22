package LeetCode.统计可以提取的工件;

/**
 * @author lingqu
 * @date 2022/3/13
 * @apiNote
 */

class Solution {
    public int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        int res = 0;
        int[][] arr = new int[n][n];
        for (int[] ints : dig) {
            arr[ints[0]][ints[1]] = 1;
        }
        for(int[] art:artifacts){

            int x2 = art[2];
            int y2 = art[3];
            boolean flag = false;
            for (int x1 = art[0] ;x1 <= x2; x1++) {
                for(int y1 = art[1];y1 <= y2; y1++) {
                    if (arr[x1][y1] != 1){
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    break;
                }
            }
            if (!flag){
                res++;
            }
        }
        return res;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] tt={{0,0,0,0},{0,1,1,1}};
        int[][] t={{0,0},{0,1}};
        s.digArtifacts(2,tt,t);
    }
}
