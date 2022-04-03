package LeetCode.数组的三角和;

/**
 * @author lingqu
 * @date 2022/4/2
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.triangularSum(new int[]{1, 2, 3, 4, 5}));
    }
}
class Solution {
    public int triangularSum(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int[] temp = new int[nums.length-1];
        for(int i = 1; i < nums.length; i++) {
            temp[i-1] = (nums[i] + nums[i-1]) %10;
        }
        return triangularSum(temp);
    }

}
