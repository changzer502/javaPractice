package LeetCode.将字符串拆分;

/**
 * @author lingqu
 * @date 2022/1/16
 * @apiNote
 */

class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length()/k;
        n += s.length() % k == 0? 0:1;
        for(int i=0;i<s.length()%k;i++){
            s+=fill;
        }
        String[] str = new String[n];
        int count = 0;
        for(int i =0;i<s.length();i+=k){
            str[count++] = s.substring(i,i+k);
        }
        return str;
    }
}
public class Main {
}
