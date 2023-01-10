package LeetCode.至少在两个数组中出现的值;

import java.util.*;

/**
 * @author changzer
 * @date 2022/12/29
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.twoOutOfThree(new int[]{1, 1, 3, 2}, new int[]{2, 3}, new int[]{3}));
    }
}
class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        Set<Integer> set3 = new HashSet<Integer>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }
        for (int num : nums3) {
            set3.add(num);
        }
        for (Integer num:set1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (Integer num:set2){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (Integer num:set3){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> list = new ArrayList<Integer>();
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (entry.getValue() >= 2){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}
