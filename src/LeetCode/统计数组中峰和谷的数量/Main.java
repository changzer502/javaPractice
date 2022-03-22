package LeetCode.统计数组中峰和谷的数量;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lingqu
 * @date 2022/3/20
 * @apiNote
 */

class Solution {
    public int countHillValley(int[] nums) {
        int res = 0;
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(i > 0 && nums[i] == nums[i-1]){

            }else{
                list.add(nums[i]);
            }
        }
        for(int i = 1; i < list.size()-1; i++){
            if(list.get(i) > list.get(i-1) && list.get(i) > list.get(i+1)){
                res++;
            }
            if(list.get(i) < list.get(i-1) && list.get(i) < list.get(i+1)){
                res++;
            }
        }
        return res;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = {2,4,1,1,6,5};
        s.countHillValley(a);
    }
}
