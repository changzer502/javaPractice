package LeetCode.字符串中最多数目的子字符串;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lingqu
 * @date 2022/3/19
 * @apiNote
 */
class Solution {
    public long maximumSubsequenceCount(String text, String pattern) {
        Map<Character,Integer> map = new HashMap<>();
        int a = 0;
        int b = 0;
        int d = 0;
        int res = 0;
        for (int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if (pattern.charAt(0) == c){
                a++;
            }
            if (pattern.charAt(1) == c){
                b++;
                res += a;
            }
        }
        if (pattern.charAt(1) == pattern.charAt(0)){
            return (a*(a+1))/2;
        }
        if (a >= b){
            return res + a;
        }
        return res + b;
    }
}
public class Main {
    public static void main(String[] args) {
        String a = "iekbksdsmuuzwxbpmcngsfkjvpzuknqguzvzik";
        String b = "mp";
        Solution s = new Solution();
        s.maximumSubsequenceCount(a,b);
    }
}
