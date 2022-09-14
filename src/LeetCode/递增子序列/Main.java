package LeetCode.递增子序列;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lingqu
 * @date 2022/9/1
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] num = {4,6,7,7};
        s.findSubsequences(num);
    }
}
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    boolean[] used;
    public List<List<Integer>> findSubsequences(int[] nums) {
        used = new boolean[nums.length];
        backTraval(nums,0);
        return res;
    }

    public void backTraval(int[] nums, int index) {
        if(path.size() >= 2 ){
            res.add(new ArrayList<>(path));
        }

        for(int i = index; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i-1] && !used[i-1]){
                continue;
            }
            if(path.size() == 0){
                path.add(nums[i]);
                used[i] = true;
            }else{
                if(nums[i] >= path.get(path.size()-1)) {
                    path.add(nums[i]);
                    used[i] = true;
                }
            }
            backTraval(nums,i+1);
            if(path.size() > 0){
                path.remove(path.size() - 1);
            }
            used[i] = false;

        }
    }
}
