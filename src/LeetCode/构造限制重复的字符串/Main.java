package LeetCode.构造限制重复的字符串;/**
 * @author lingqu
 * @date 2022/2/20
 * @apiNote
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *@description TODO
 *@author zzhi
 *@createDate 2022/2/20
 *@version 1.0
 */

class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        char[] arrayCh = s .toCharArray();
        Arrays.sort(arrayCh);
        StringBuilder sb = new StringBuilder();
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < arrayCh.length; ){
            int count = 0;
            int limit = repeatLimit;
            for(count = 0; count < limit && (i+count) < arrayCh.length; count++){
                if(!set.contains(count+i)){
                    sb.append(arrayCh[i+count]);
                    set.add(i+count);
                    limit++;
                }
            }
            i+=count;
        }
        return sb.toString();
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.repeatLimitedString("cczazcc", 2));
    }
}
