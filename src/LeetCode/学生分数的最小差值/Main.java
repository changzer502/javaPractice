package LeetCode.学生分数的最小差值;/**
 * @author lingqu
 * @date 2022/2/11
 * @apiNote
 */

import java.util.Arrays;

/**
 *@description TODO
 *@author zzhi
 *@createDate 2022/2/11
 *@version 1.0
 */

class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(k==1) return 0;
        Arrays.sort(nums);
        int i = 0;
        int j = i+k-1;
        int min = Integer.MAX_VALUE;
        for(i = 0; j < nums.length; i++ ){
            if(Math.abs(nums[i]-nums[j]) < min){
                min = Math.abs(nums[i]-nums[j]);
            }
            j = i+k;
        }
        return min;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {9,4,1,7};
        System.out.println(s.minimumDifference(nums, 2));
    }
}
