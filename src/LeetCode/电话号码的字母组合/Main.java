package LeetCode.电话号码的字母组合;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lingqu
 * @date 2022/8/23
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.letterCombinations("23"));
    }
}
class Solution {
    String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    List<String> res = new ArrayList<>();
    StringBuilder  sb = new StringBuilder ();
    public List<String> letterCombinations(String digits) {
        letterCombination(digits,0,0);

        return res;
    }

    public void letterCombination(String digits,int num,int c){
        if(sb.length() == digits.length()){
            res.add(sb.toString());
            return;
        }

        for(int i = num; i < digits.length(); i++){
            Integer ll = digits.charAt(i) - '0';
            for(int j = c; j < numString[ll].length(); j++){
                sb.append(numString[ll].charAt(j));
                letterCombination(digits,i+1,0);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}
