package LeetCode.使两字符串互为字母异位词的最少步骤数;/**
 * @author lingqu
 * @date 2022/2/27
 * @apiNote
 */

/**
 *@description TODO
 *@author zzhi
 *@createDate 2022/2/27
 *@version 1.0
 */

class Solution {
    public int minSteps(String s, String t) {
        int[] snum = new int[26];
        int[] tnum = new int[26];
        int n = Math.max(s.length(), t.length());
        for(int i = 0; i < n; i++){
            if (i<s.length()){
                snum[s.charAt(i) - 97]++;
            }
            if (i<t.length()){
                tnum[t.charAt(i) - 97]++;
            }
        }
        int res = 0;
        for(int i = 0; i < snum.length; i++){
            res += Math.abs(snum[i]-tnum[i]);
        }
        return res;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println((int) 'a'- 97);
    }
}
