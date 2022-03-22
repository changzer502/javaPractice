package LeetCode.仅仅反转字母;/**
 * @author lingqu
 * @date 2022/2/23
 * @apiNote
 */

/**
 *@description TODO
 *@author zzhi
 *@createDate 2022/2/23
 *@version 1.0
 */

class Solution {
    public String reverseOnlyLetters(String s) {
        int i = 0;
        int j = s.length()-1;
        char[] chars = s.toCharArray();
        while(i < j){
            while(i < j && !((chars[i] >= 'a' && chars[i] <= 'z') || (chars[i] >= 'A' && chars[i] <= 'Z'))){
                i++;
            }
            while(i < j && !((chars[j] >= 'a' && chars[j] <= 'z') || (chars[j] >= 'A' && chars[j] <= 'Z'))){
                j++;
            }
            char tmp = chars[i];
            chars[i] = chars[j];  
            chars[j] = tmp;
        }
        return new String(chars);
    }
}
public class Main {
}
