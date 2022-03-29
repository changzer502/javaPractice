package LeetCode.最大子数组和;

/**
 * @author lingqu
 * @date 2022/3/26
 * @apiNote
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int pre = 0;
        for(int i:nums){
            pre = Math.max(pre+i,i);
            res = Math.max(res,pre);
        }
        return res;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
    }
}
