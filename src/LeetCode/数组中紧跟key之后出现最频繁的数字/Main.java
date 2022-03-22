package LeetCode.数组中紧跟key之后出现最频繁的数字;/**
 * @author lingqu
 * @date 2022/3/5
 * @apiNote
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *@description TODO
 *@author zzhi
 *@createDate 2022/3/5
 *@version 1.0
 */
class Solution {
    public int mostFrequent(int[] nums, int key) {
        Map<Integer, Integer> keys = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == key){
                if (i+1<nums.length){
                    keys.put(nums[i+1], keys.getOrDefault(nums[i+1], 0) + 1);
                    i++;
                }
            }
        }
        int num = -1;
        int res = -1;
        for (Integer k : keys.keySet()) {
            Integer integer = keys.get(k);
            if(res < integer){
                res = integer;
                num = k;
            }
        }
        return num;
    }
}
public class Main  {
}
