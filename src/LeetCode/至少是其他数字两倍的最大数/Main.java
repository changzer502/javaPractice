package LeetCode.至少是其他数字两倍的最大数;

/**
 * @author lingqu
 * @date 2022/1/13
 * @apiNote
 */

class Solution {
    public int dominantIndex(int[] nums) {
        int m1 = -1, m2 = -1;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > m1) {
                m2 = m1;
                m1 = nums[i];
                index = i;
            } else if (nums[i] > m2) {
                m2 = nums[i];
            }
        }
        return m1 >= m2 * 2 ? index : -1;

    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {0,2,0,3};
        System.out.println(s.dominantIndex(nums));
    }
}
