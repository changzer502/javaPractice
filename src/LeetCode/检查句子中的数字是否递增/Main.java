package LeetCode.检查句子中的数字是否递增;

/**
 * @author changzer
 * @date 2023/1/3
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.areNumbersAscending("1 box has 3 blue 4 red 6 green and 12 yellow marbles");
    }
}
class Solution {
    public boolean areNumbersAscending(String s) {
        char[] chars = s.toCharArray();
        int pre = Integer.MIN_VALUE;
        for (int i = 0;i<chars.length;i++){
            if (chars[i] >='0' && chars[i]<='9'){
                int j = i+1;
                while (j<chars.length && (chars[j] >='0' && chars[j]<='9')){
                    j++;
                }
                String substring = s.substring(i, j);
                int i1 = Integer.parseInt(substring);
                if (i1<=pre){
                    return false;
                }else{
                    pre = i1;
                }
                i=j;
            }
        }
        return true;
    }
}
