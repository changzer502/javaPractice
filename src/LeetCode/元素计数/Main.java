package LeetCode.元素计数;/**
 * @author lingqu
 * @date 2022/1/23
 * @apiNote
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *@description TODO
 *@author zzhi
 *@createDate 2022/1/23
 *@version 1.0
 */
class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> elements = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++){
            elements.add(nums[i]);
        }
        if(elements.size()<2){
            return 0;
        }else{
            return elements.size()-2;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = {-89,-89};
        System.out.println(s.countElements(a));
    }
}
