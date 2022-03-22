package LeetCode.复数乘法;/**
 * @author lingqu
 * @date 2022/2/25
 * @apiNote
 */

import java.util.ArrayList;

/**
 *@description TODO
 *@author zzhi
 *@createDate 2022/2/25
 *@version 1.0
 */

class Solution {

    public String complexNumberMultiply(String num1, String num2) {
        int a = 0, b = 0, c = 0, d = 0;
        int la = 0, lb = 0;
        for (int i = 0; i < num1.length(); i++) {
            if (Character.isDigit(num1.charAt(i)) || num1.charAt(i) == '-'){
                continue;
            }else if (la == 0){
                a = Integer.parseInt(num1.substring(la,i));
                la = i+1;
            }else {
                b = Integer.parseInt(num1.substring(la,i));
            }
        }
        for (int i = 0; i < num2.length(); i++) {
            if (Character.isDigit(num2.charAt(i)) || num2.charAt(i) == '-'){
                continue;
            }else if (lb == 0){
                c = Integer.parseInt(num2.substring(lb,i));
                lb = i+1;
            }else {
                d = Integer.parseInt(num2.substring(lb,i));
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a*c - b*d);
        sb.append("+");
        sb.append(b*c+a*d);
        sb.append("i");
        return sb.toString();
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String num1 = "1+1i";
        String num2 = "1+1i";
        System.out.println(s.complexNumberMultiply(num1, num1));
    }
}

