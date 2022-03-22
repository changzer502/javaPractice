package LeetCode.简化路径;

import java.util.Stack;

/**
 * @author lingqu
 * @date 2022/1/6
 * @apiNote
 */
class Solution {
    public int maxDepth(String s) {
        Stack<Character> sStack = new Stack<>();
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                sStack.push(s.charAt(i));
                res = Math.max(res, sStack.size());
            }
            if(s.charAt(i) == ')'){
                sStack.pop();
            }
        }
        return res;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println(Integer.valueOf("0101", 2).toString());
    }
}
