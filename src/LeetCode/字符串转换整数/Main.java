package LeetCode.字符串转换整数;

/**
 * @author changzer
 * @date 2023/1/10
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.myAtoi("-91283472332"));
    }
}
class Solution {
    public int myAtoi(String s) {
        s= s.trim();
        long res = 0L;
        boolean f = true;
        char[] chars = s.toCharArray();
        if (chars.length == 0){
            return 0;
        }
        int i = 0;
        if (chars[i] == '-'){
            f = false;
            i++;
        }else if (chars[i] == '+'){
            i++;
        }
        for(; i < chars.length; i++){
            char c = chars[i];

            if(c<'0'|| c>'9'){
                break;
            }
            res = res*10+(c-'0');

            if(f&&res >= Integer.MAX_VALUE){
                res = Integer.MAX_VALUE;
                break;
            }else if(!f&&res >= 2147483648L){
                res = 2147483648L;
                break;
            }
        }
        if(!f){
            return (int)-res;
        }
        return (int)res;
    }
}
