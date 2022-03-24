package LeetCode.图片平滑器;

import java.util.Arrays;

/**
 * @author lingqu
 * @date 2022/3/24
 * @apiNote
 */
class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int[][] tmp = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int count = 0;
                int sum = 0;
                for(int k = i -1; k <= i+1; k++){
                    for(int l = j - 1;  l <= j+1 ; l++){
                        if(k >= 0 && k < m && l >= 0 && l <n){
                            count++;
                            sum += img[k][l];
                        }
                    }
                }
                tmp[i][j] = sum/count;
            }
        }
        return tmp;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] img = {
                {100,200,100},
                {200,50,200},
                {100,200,100}
        };
        System.out.println(Arrays.deepToString(s.imageSmoother(img)));
    }
}
