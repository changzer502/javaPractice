package LeetCode.装满杯子需要的最短总时长;

import java.util.Arrays;

/**
 * @author changzer
 * @date 2023/2/11
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.fillCups(new int[]{5, 4, 4}));
    }
}
class Solution {
    public int fillCups(int[] amount) {
        Arrays.sort(amount);
        int res = 0;
        while(amount[2] != 0){

            if (amount[1] != 0){
                amount[1]--;
                amount[2]--;
                res++;
            }else{
                amount[2]--;
                res++;
            }
            Arrays.sort(amount);
        }
        return res;
    }
}
