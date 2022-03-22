package LeetCode.K次操作后最大化顶端元素;

/**
 * @author lingqu
 * @date 2022/3/13
 * @apiNote
 */

class Solution {
    public int maximumTop(int[] nums, int k) {
        if(nums.length <= 1){
            return -1;
        }
        if (k>= nums.length){
            int max = -1;
            for (int num : nums) {
                max = Math.max(max, num);
            }
            return max;
        }
        int p = 1;
        int max = -1;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return max;
    }
    private int dfs(int[] nums, int k, int p){
        if(k < 0 || p < 0 || p == nums.length){
            return -1;
        }

        int a = dfs(nums,k-1,p-1);
        int b = dfs(nums,k-1,p+1);
        return Math.max(Math.max(nums[p],b),a);
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = {99,95,68,24,18};
        System.out.println(s.maximumTop(a, 8));
    }
}
