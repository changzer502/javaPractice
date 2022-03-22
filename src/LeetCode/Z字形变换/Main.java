package LeetCode.Z字形变换;/**
 * @author lingqu
 * @date 2022/3/1
 * @apiNote
 */

import java.util.ArrayList;
import java.util.List;

/**
 *@description TODO
 *@author zzhi
 *@createDate 2022/3/1
 *@version 1.0
 */
class Solution {
    public String convert(String s, int numRows) {
        List<List<Character>> lists = new ArrayList<List<Character>>();
        for (int i=0;i<numRows;i++) {
            List<Character> row = new ArrayList<Character>();
            lists.add(row);
        }
        boolean flag = true;
        boolean first = true;
        for (int i=0;i<s.length();){
            if (flag){
                for (int j=0;j<numRows && i<s.length();j++){
                    if (!first){
                        j++;
                        first = false;
                    }
                    lists.get(j).add(s.charAt(i++));
                }
                flag = false;
            }else{
                for (int j=numRows-2;j>=0 && i<s.length();j--){
                    lists.get(j).add(s.charAt(i++));
                }
                flag = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (List<Character> list : lists){
            sb.append(list.toString());
        }
        return sb.toString();
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.convert("PAYPALISHIRING", 3));
    }
}
