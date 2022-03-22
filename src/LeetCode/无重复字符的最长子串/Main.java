package LeetCode.无重复字符的最长子串;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lingqu
 * @date 2022/3/14
 * @apiNote
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<Character>();
        int n = s.length();
        int rk = -1, res = 0;
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                set.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !set.contains(s.charAt(rk + 1))) {
                set.add(s.charAt(rk + 1));
                rk++;
            }
            res = Math.max(res, rk + 1 - i);
        }
        return res;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.lengthOfLongestSubstring("abcabcbb"));
    }
}
