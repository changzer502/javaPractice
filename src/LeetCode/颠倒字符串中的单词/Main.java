package LeetCode.颠倒字符串中的单词;

/**
 * @author lingqu
 * @date 2022/4/1
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.reverseWords("the sky is blue");
    }
}
class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1, j = s.length()-1; i >= 0 && j >= 0; )  {
            while(i >= 0 && s.charAt(i) == ' '){
                i--;
                j=i;
            }
            while(j >= 0 && s.charAt(j) != ' '){
                j--;

            }
            sb.append(s.substring(j+1,i+1));
            sb.append(' ');
            i = j;
        }
        return sb.toString().trim();
    }
}
