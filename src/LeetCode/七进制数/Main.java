package LeetCode.七进制数;/**
 * @author lingqu
 * @date 2022/3/7
 * @apiNote
 */

/**
 *@description TODO
 *@author zzhi
 *@createDate 2022/3/7
 *@version 1.0
 */

class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        boolean negative = num < 0;
        num = Math.abs(num);
        StringBuffer digits = new StringBuffer();
        while (num > 0) {
            digits.append(num % 7);
            num /= 7;
        }
        if (negative) {
            digits.append('-');
        }
        return digits.reverse().toString();

    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.convertToBase7(7));
    }
}
