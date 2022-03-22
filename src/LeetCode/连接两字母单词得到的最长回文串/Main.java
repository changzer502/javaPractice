package LeetCode.连接两字母单词得到的最长回文串;

import java.util.HashMap;
import java.util.Map;

import static jdk.nashorn.internal.objects.NativeDebug.map;

/**
 * @author lingqu
 * @date 2022/1/8
 * @apiNote
 */
class Solution {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        Map<String, Integer> mapAA = new HashMap<String, Integer>();
        boolean flag = false;
        int h = 0;
        for(int i = 0; i < words.length; i++){
            StringBuffer sb = new StringBuffer();
            for(int j=words[i].length()-1;j>=0;j--){
                sb.append(words[i].charAt(j));
            }
            if(words[i].equals(sb.toString())){
                mapAA.put(words[i],mapAA.getOrDefault(words[i],0)+1);
            }else{
                if(!map.containsKey(sb.toString()) && !map.containsKey(words[i])){
                    map(words[i],0);
                }else{
                    if(map.containsKey(sb.toString())){
                        map.put(words[i],map.getOrDefault(words[i],0)+1);
                    }
                }
            }

        }
        int res = 0;
        for(int i =0;i<words.length;i++){
            if(map.containsKey(words[i])){
                if(map.get(words[i])==1){
                    res+=words[i].length()*2;
                }
            }
        }
        return res;
    }
}
public class Main {
    public static void main(String[] args) {

    }
}
