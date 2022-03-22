package LeetCode.将数组和减半的最少操作次数;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author lingqu
 * @date 2022/3/19
 * @apiNote
 */
class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq =  new PriorityQueue<>(nums.length, new Comparator<Double>(){

            @Override
            public int compare(Double i1, Double i2) {
                if (i2 > i1){
                    return 1;
                }else if (i2 < i1){
                    return -1;
                }
                return 0;
            }
        });

        double sum = 0;
        for (int num : nums) {
            sum += num;
            pq.add((double)num);
        }
        double res = 0;
        int count = 0;
        while(res < sum/2){
            Double poll = pq.remove();
            res += poll/2;
            pq.add(poll/2);
            count++;
        }
        return count;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a ={3,8,20};
        int i = s.halveArray(a);
        System.out.println(i);
    }
}
