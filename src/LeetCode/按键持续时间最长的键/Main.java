package LeetCode.按键持续时间最长的键;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lingqu
 * @date 2022/1/9
 * @apiNote
 */

class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int max = releaseTimes[0];
        char res = keysPressed.charAt(0);
        for (int i = 1; i < releaseTimes.length; i++){
            int time = releaseTimes[i]-releaseTimes[i-1];
            if(max<=time){
                if(max==time){
                    if(res<keysPressed.charAt(i)){
                        max = time;
                        res = keysPressed.charAt(i);
                    }
                }else{
                    max = time;
                    res = keysPressed.charAt(i);
                }

            }
        }
        return res;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] releaseTimes = {12,23,36,46,62};
        String keysPressed  = "spuda";
        Solution s = new Solution();
        System.out.println(s.slowestKey(releaseTimes, keysPressed));

    }
}
