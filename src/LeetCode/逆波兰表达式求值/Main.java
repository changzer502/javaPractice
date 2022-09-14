package LeetCode.逆波兰表达式求值;

import java.util.Stack;

/**
 * @author lingqu
 * @date 2022/8/10
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] ss = new String[]{"2", "1", "+", "3", "*"};
        System.out.println(s.evalRPN(ss));
    }
}
class Solution {
    public int  evalRPN(String[] tokens) {
        Stack<Integer> numStack = new Stack<>();
        
        for(String t:tokens) {
            try {
                Integer num = Integer.parseInt(t);
                numStack.push(num);
            }catch(Exception e){
                Integer num2 = numStack.pop();
                Integer num1 = numStack.pop();
                if("+".equals(t)){
                    numStack.push(num1+num2) ;
                }else if("-".equals(t)) {
                    numStack.push(num1-num2);
                }else if("*".equals(t)) {
                    numStack.push(num1*num2) ;
                }else if ("/".equals(t)){
                    numStack.push(num1/num2);
                }
            }
        }
        return numStack.pop();
    }
}
