package LeetCode.构成特定和需要添加的最少元素;

/**
 * @author changzer
 * @date 2022/12/16
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.minElements(new int[]{1, -1, 1}, 3, -4));
    }
}

class Solution {
    public int minElements(int[] nums, int limit, int goal) {
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }
        long diff = goal - sum;
        if ((Math.abs(diff) % limit) != 0) {
            return (int) ((Math.abs(diff)) / limit) + 1;
        } else {
            return (int) ((Math.abs(diff)) / limit);
        }
    }
}
