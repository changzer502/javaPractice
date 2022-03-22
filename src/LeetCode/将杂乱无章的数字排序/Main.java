package LeetCode.将杂乱无章的数字排序;/**
 * @author lingqu
 * @date 2022/3/5
 * @apiNote
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *@description TODO
 *@author zzhi
 *@createDate 2022/3/5
 *@version 1.0
 */
class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        List<String[]> lists = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            String[] split = String.valueOf(nums[i]).split("");
            lists.add(split);
        }
        for (String[] string : lists){
            int t = 0;
            for (int i=0;i<string.length; i++){
                string[i] = String.valueOf(mapping[Integer.parseInt(string[i])]);
                t = t*10+ Integer.parseInt(string[i]);
            }
            integers.add(t);
        }
        Integer[] rr = integers.toArray(new Integer[integers.size()]);
        for (int i = 0; i < rr.length; i++){
            int t = i;
            for (int j = i +1;j<rr.length;j++){
                if (rr[j]<rr[t]){
                    t = j;
                }
            }
            if (t != i){
                int tmp = rr[i];
                rr[i] = rr[t];
                rr[t] = tmp;
                int tmps = nums[i];
                nums[i] = nums[t];
                nums[t] = tmps;
            }
        }
        return nums;

    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = {991,338,38};
        int[] b = {8,9,4,0,2,1,3,5,7,6};
        s.sortJumbled(b,a);

    }
}
