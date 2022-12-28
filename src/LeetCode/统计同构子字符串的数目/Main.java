package LeetCode.统计同构子字符串的数目;

/**
 * @author changzer
 * @date 2022/12/26
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.countHomogenous("xy"));
    }
}
class Solution {
    public int countHomogenous(String s) {
        char[] chars = s.toCharArray();
        int t = 1;
        int res = 1;
        for (int i = 1; i < chars.length; i++){
            if (chars[i] == chars[i-1]){
                t++;
                res = (res + t)%1000000007;
            }else{
                t = 1;
                res = (res + t)%1000000007;
            }
        }

        return res;
    }
}
