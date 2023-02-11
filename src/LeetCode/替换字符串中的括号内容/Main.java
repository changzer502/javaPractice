package LeetCode.替换字符串中的括号内容;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author changzer
 * @date 2023/1/12
 * @apiNote
 */
public class Main {
}
class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String> map = new HashMap<String,String>();
        for (List<String> knowledg : knowledge) {
            map.put(knowledg.get(0), knowledg.get(1));
        }
        StringBuilder sb= new StringBuilder();
        for(int i =0; i < s.length();i++){

            if (s.charAt(i) == '('){
                i++;
                int left = i;
                while (s.charAt(i)!=')'){
                    i++;
                }
                String substring = s.substring(left, i);
                sb.append(map.getOrDefault(substring,"?"));
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
