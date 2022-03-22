package LeetCode.拆分成最多数目的偶整数之和;
/**
 * @author lingqu
 * @date 2022/2/19
 * @apiNote
 */

import java.util.ArrayList;
import java.util.List;

/**
 *@description TODO
 *@author zzhi
 *@createDate 2022/2/19
 *@version 1.0
 */
class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        if(finalSum % 2 != 0){
            return new ArrayList<Long>();
        }
        List<Long> res = new ArrayList<>();
        Long a = 0L;
        while(finalSum > 0){
            a += 2;
            finalSum -= a;
            if(finalSum <= a){
                finalSum += a;
                res.add(finalSum);
                return res;
            }
            res.add(a);
        }
        return res;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Long> longs = s.maximumEvenSplit(28);
        for(Long l : longs){
            System.out.println(l);
        }
    }
}
