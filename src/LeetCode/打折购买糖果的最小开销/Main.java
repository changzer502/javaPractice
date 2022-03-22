package LeetCode.打折购买糖果的最小开销;/**
 * @author lingqu
 * @date 2022/1/22
 * @apiNote
 */

import java.util.*;

/**
 *@description TODO
 *@author zzhi
 *@createDate 2022/1/22
 *@version 1.0
 */

class MyCompare implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        // TODO Auto-generated method stub
        return o1 > o2 ? -1 : (o1 == o2 ? 0 : 1);
    }


}
class Solution {
    public int minimumCost(int[] cost) {
        int res = 0;

        if(cost.length < 3){
            for(int i=0;i<cost.length;i++){
                res += cost[i];
            }
        }

        MyCompare mc = new MyCompare();
        Arrays.sort(cost);
        int i;
        for (i = cost.length-3; i >= 0; ) {
            if(cost[i+1] >= cost[i]){
                res += cost[i+1] + cost[i+2];
                if(i > 2) {
                    i-=3;
                } else {
                    break;
                }
            }else{
                res += cost[i+2];
                i--;
            }
        }
        for(i-=1;i>=0;i--){
            res+=cost[i];
        }
        return res;

    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = {1,3,3,3};
        System.out.println(s.minimumCost(a));
    }
}
