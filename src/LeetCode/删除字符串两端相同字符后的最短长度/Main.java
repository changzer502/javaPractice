package LeetCode.删除字符串两端相同字符后的最短长度;
/**
 * @author changzer
 * @date 2022/12/28
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.minimumLength("abbbbbbbbbbbbbbbbbbba"));
    }
}

class Solution {
    public int minimumLength(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = s.length()-1;
        while (left < right) {
            if (chars[left] == chars[right]){
                left++;
                right--;
                while (left <= right && chars[left] == chars[left-1]){
                    left++;
                }
                while (left < right && chars[right] == chars[right+1]){
                    right--;
                }
            }else {
                break;
            }
        }
        return right-left+1;
    }
}
