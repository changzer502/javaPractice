package LeetCode.罗马数字转整数;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lingqu
 * @date 2022/7/17
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.romanToInt("MCMXCIV"));
    }
}

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer integer = map.get(c);
            Integer next = 0;
            if (i+1 < s.length() ){
                next = map.get(s.charAt(i+1));
            }
            if (next != 0) {
                if (integer < next) {
                    res -= integer;
                }else{
                    res += integer;
                }
            }else {
                res += integer;
            }
        }
        return res;
    }
}
