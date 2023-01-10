package LeetCode.字母异位词分组;

import java.util.*;

/**
 * @author changzer
 * @date 2022/12/29
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
}
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            if (map.containsKey(String.valueOf(chars))) {
                map.get(String.valueOf(chars)).add(str);
            }else {
                List<String> objects = new ArrayList<>();
                objects.add(str);
                map.put(String.valueOf(chars), objects);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()){
            res.add(entry.getValue());
        }
        return res;
    }
}
