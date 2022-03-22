package LeetCode.有序数组中的单一元素;/**
 * @author lingqu
 * @date 2022/2/14
 * @apiNote
 */

/**
 *@description TODO
 *@author zzhi
 *@createDate 2022/2/14
 *@version 1.0
 */

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = (high - low) / 2 + low;
            if (nums[mid] == nums[mid ^ 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.singleNonDuplicate(new int[]{1,1,2,3,3,4,4,8,8}));
    }
}
