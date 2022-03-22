package LeetCode.存在重复元素;/**
 * @author lingqu
 * @date 2022/1/19
 * @apiNote
 */

import java.util.HashMap;
import java.util.Map;

/**
 *@description TODO
 *@author zzhi
 *@createDate 2022/1/19
 *@version 1.0
 */
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i< nums.length; i++){
            if(!map.containsKey(nums[i])){

            }
        }
        return true;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1,2,3,2,1};
        System.out.println(s.containsNearbyDuplicate(nums, 2));
    }
}
