package LeetCode.最长公共前缀;

/**
 * @author lingqu
 * @date 2022/7/31
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] ss = {"flower","flow","flight"};
        System.out.println(s.longestCommonPrefix(ss));
    }
}
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        int minLength = Integer.MAX_VALUE;
        for(String num : strs) {
            if(minLength > num.length()){
                minLength = num.length();
            }
        }
        for(int i = 0; i < minLength; i++) {
            char c = strs[0].charAt(i);
            int j;
            for(j = 1; j < strs.length; j++){
                if(strs[j].charAt(i) != c) {
                    break;
                }
            }
            if(j == strs.length){
                res += c;
            }else {
                break;
            }
        }
        return res;
    }
}
