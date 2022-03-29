package LeetCode.移动零;

/**
 * @author lingqu
 * @date 2022/3/25
 * @apiNote
 */
class Solution {
    public void moveZeroes(int[] nums) {
        int cc = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                cc++;
            }else {
                int tmp = nums[i-cc];
                nums[i-cc] = nums[i];
                nums[i] = tmp;
            }
        }
    }
}
public class Main {
}
