package LeetCode.全排列;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lingqu
 * @date 2022/5/23
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1,2,3};
        s.permute(nums);
    }
}
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        int n = nums.length;
        dfs(n,res,nums,0);
        return res;
    }

    public void dfs(int n, List<List<Integer>> res, int[] nums, int current) {
        if (n == current) {
            res.add(new ArrayList(Arrays.asList(nums)));
        }

        for(int i = current; i < n; i++) {
            // swap(nums,current,i);
            int temp = nums[i];
            nums[i] = nums[current];
            nums[current] = temp;
            dfs(n,res,nums,current+1);
            // swap(nums,current,i);
            temp = nums[i];
            nums[i] = nums[current];
            nums[current] = temp;
        }
    }
    public void swap(int[]nums,int current, int i){
        int temp = nums[i];
        nums[i] = nums[current];
        nums[current] = temp;
    }
}
